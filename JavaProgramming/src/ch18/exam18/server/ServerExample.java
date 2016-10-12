package ch18.exam18.server;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		System.out.println("서버시작");
		ServerSocket serverSocket = null;
		try {
			// 서버의 어떤 IP라도 접근할 수 있도록 한 것.
			serverSocket = new ServerSocket(5001);

			for (int i = 0; i < 10; i++) {
				// 클라이언트의 연결을 수락하고 통신용 Socket을 생성
				Socket socket = serverSocket.accept();

				// 클라이언트에서 보낸 데이터 받기
				InputStream is = socket.getInputStream();
				Reader reader = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(reader);
				String data = br.readLine();
				System.out.print(data);
								
				//클라이언트로 에코 보내기
				OutputStream os = socket.getOutputStream();
				PrintStream ps = new PrintStream(os);
				ps.print("서버>"+data);
				ps.flush();
				
				// 클라이언트의 연결을 끊음
				socket.close();
			}

		} catch (Exception e) {
		}
		System.out.println("서버종료");
	}
}
