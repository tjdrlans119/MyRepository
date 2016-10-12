package ch18.exam23.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ServerExample extends Application {
	ExecutorService executorService;
	ServerSocket serverSocket;
	List<Client> connections = new Vector<>();

	// 스레드풀 생성(최대 스레드 50개만 사용)
	void startServer() {
		executorService = Executors.newFixedThreadPool(50);

		// ServerSocket 생성
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("192.168.0.31", 5001));
		} catch (Exception e) {
			if (!serverSocket.isClosed()) {
				stopServer();
			}
			return;
		}

		// 클라이언트 연결 수락 작업 생성과 작업규에 넣기
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				Platform.runLater(new Runnable() {
					public void run() {
						displayText("[서버 시작]");
						btnStartStop.setText("stop");
					}
				});

				while (true) {
					try {
						// 클라이언트의 연결을 기다리고 수락하기
						Socket socket = serverSocket.accept();
						String message = "[연결  수락: " + socket.getInetAddress().getHostAddress() + ": "
								+ Thread.currentThread().getName() + "]";
						Platform.runLater(new Runnable() {
							@Override
							public void run() {
								displayText(message);
							}
						});

						// 통신 객체 client 생성
						Client client = new Client(socket);

						// client 관리
						connections.add(client);
						Platform.runLater(new Runnable() {
							@Override
							public void run() {
								displayText("[연결개수:" + connections.size() + "]");
							}
						});

					} catch (Exception e) {
						if (!serverSocket.isClosed()) {
							stopServer();
							break;
						}
					}
				}
			}
		};
		executorService.submit(runnable);
	}

	void stopServer() {
		try {
			Iterator<Client> iterator = connections.iterator();// 반복해서 지울때는
																// iterator을
																// 이용해서 지워야한다.
			while (iterator.hasNext()) {
				Client client = iterator.next();
				client.socket.close(); // List안에 클라이언트 닫기
				iterator.remove(); // List 안에 client 삭제(connections에서 삭제된다)
			}

			if (serverSocket != null && !serverSocket.isClosed()) {
				serverSocket.close();
			}
			if (executorService != null && !executorService.isShutdown()) {
				executorService.shutdown();
			}
			Platform.runLater(new Runnable() {
				public void run() {
					displayText("[서버 멈춤]");
					btnStartStop.setText("Start");
				}
			});

		} catch (Exception e) {
		}
	}

	class Client {
		Socket socket; // 필드

		Client(Socket socket) { // 생성자
			this.socket = socket;
			receive();

		}

		void receive() {
			// 클라이언트의 데이터를 받는 작업 생성 및 작업큐에 넣기
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					try {
						while (true) {
							InputStream is = socket.getInputStream(); // 클라이언트에서
																		// 보낸
																		// 데이터
																		// 읽기
							byte[] values = new byte[1024];
							int byteNum = is.read(values);
							if (byteNum == -1) {
								throw new IOException();
							} // 예외발생
							String data = new String(values, 0, byteNum, "UTF-8");
							for (Client client : connections) {// 클라이언트로부터 읽은 데이터 모든 클라이언트한테 보내기
								client.send(data);
							}

						}
					} catch (Exception e) {
						try {
							connections.remove(Client.this); // 중첩되어있는 클래스에서 각각
																// 객체를 가르킬때는
																// 클래스명.this
							// 정상,비정상 종료일때 종료된클라이언트 출력
							String message = "[클라이언트 통신 안됨: " + socket.getInetAddress().getHostAddress() + ": "
									+ Thread.currentThread().getName() + "]";
							Platform.runLater(new Runnable() {
								@Override
								public void run() {
									displayText(message);
								}
							});
							socket.close();
						} catch (IOException e1) {
						}
					}
				}
			};
			executorService.submit(runnable);
		}

		void send(String data) {
			// 클라이언트의 데이터를 보내는 작업 생성 및 작업큐에 넣기
			Runnable runnable = new Runnable() {// 생성
				@Override
				public void run() {
					try {
						OutputStream os = socket.getOutputStream();
						byte[] values = data.getBytes("UTF-8");
						os.write(values); // 클라이언트가 없을때 예외가 발생한다.
						os.flush();
					} catch (Exception e) {
						try {
							connections.remove(Client.this); // 중첩되어있는 클래스에서 각각
																// 객체를 가르킬때는
																// 클래스명.this
							// 정상,비정상 종료일때 종료된클라이언트 출력
							String message = "[클라이언트 통신 안됨: " + socket.getInetAddress().getHostAddress() + ": "
									+ Thread.currentThread().getName() + "]";
							Platform.runLater(new Runnable() {
								@Override
								public void run() {
									displayText(message);
								}
							});
							socket.close();
						} catch (IOException e1) {
						}
					}

				}
			};
			executorService.submit(runnable);// 작업큐에 넣기
		}
	}

	//////////////////////////////////////////////////////
	TextArea txtDisplay;
	Button btnStartStop;

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		root.setPrefSize(500, 300);

		txtDisplay = new TextArea();
		txtDisplay.setEditable(false);
		BorderPane.setMargin(txtDisplay, new Insets(0, 0, 2, 0));
		root.setCenter(txtDisplay);

		btnStartStop = new Button("start");
		btnStartStop.setPrefHeight(30);
		btnStartStop.setMaxWidth(Double.MAX_VALUE);
		btnStartStop.setOnAction(e -> {
			if (btnStartStop.getText().equals("start")) {
				startServer();
			} else if (btnStartStop.getText().equals("stop")) {
				stopServer();
			}
		});
		root.setBottom(btnStartStop);

		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Server");
		primaryStage.setOnCloseRequest(event -> stopServer());
		primaryStage.show();
	}

	void displayText(String text) {
		txtDisplay.appendText(text + "\n");
	}

	public static void main(String[] args) {
		launch(args);
	}
}