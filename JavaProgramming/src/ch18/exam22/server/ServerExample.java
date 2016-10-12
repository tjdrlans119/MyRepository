package ch18.exam22.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerExample {

	private static ServerSocket serverSocket;
	private static boolean stop;
	private static ExecutorService executorService; // 스레드풀 생성 선언

	public static void main(String[] args) {
		System.out.println("서버시작");
		try {
			// 스레드 풀 생성
			executorService = Executors.newFixedThreadPool(50);

			// 서버의 어떤 ip라도 접근할 수 있도록 한것
			serverSocket = new ServerSocket(5001);

			// 클라이언트의 연결을 수락하는 작업 생성
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					waitAndAccept();
				}
			};

			// 작업을 스레드풀의 작업풀에 넣기
			executorService.submit(runnable);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("명령어 입력: ");
			String command = scanner.nextLine();
			if (command.equals("stop")) {
				stop = true; // 작업 스레드 중지(클라이언트의 연결 수락을 중지)
				try {
					serverSocket.close();
					executorService.shutdown(); // 스레드풀 종료
				} catch (IOException e) {
				}
				System.out.println("서버종료");
				System.exit(0); // 서버 Process를 종료
			}
		}
	}

	private static void waitAndAccept() {
		try {
			while (!stop) {
				// 클라리언트의 연결을 수락하고 통신용 소켓을 생성
				Socket socket = serverSocket.accept(); // accept()에서 블로깅이됨.
														// 클라이언트의 연결을 기다리기 때문에
														// 클라이언트가 연결을 하지 않으면
				// 통신을 담당하는 객체(client 객체) 생성
				Client client = new Client(socket);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static class Client {
		Socket socket;

		public Client(Socket socket) {
			this.socket = socket;
			recieve();
		}

		public void recieve() {
			// 클라이언트의 데이터를 받고 에코 보내기를 하는 작업 생성
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					try {
						while(true){
							// 클라이언트에서 보낸 데이터를 받기
							InputStream is = socket.getInputStream();
							byte[] recieveValue = new byte[1024];
							int byteNum = is.read(recieveValue);
								if (byteNum != -1) {
									String data = new String(recieveValue, 0, byteNum, "UTF-8");
									// 다시 클라리언트로 에코 보내기
									OutputStream os = socket.getOutputStream();
									byte[] sendValues = data.getBytes("UTF-8"); // UTF-8로 강제
																				// 변환
									os.write(sendValues);
									os.flush();
								} else {
									break;
							}
						}
					} catch (IOException e) {}
					// 클라리언트의 연결을 끊음
					try {
						socket.close();
					} catch (IOException e) {}
				}
			};
			//작업을 스레드풀의 작업큐에 넣기
			executorService.submit(runnable);
		}
	}
}
