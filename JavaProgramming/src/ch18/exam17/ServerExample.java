package ch18.exam17;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		int count = 0;
		ServerSocket serverSocket = null;
		try {
			// 서버의 어떤 IP라도 접근할 수 있도록 한 것.
			serverSocket = new ServerSocket(5001);

			// 서버의 특정 IP로 접근할 수 있도록 한 것.
			/*
			 * serverSocket = new ServerSocket(); SocketAddress sa = new
			 * InetSocketAddress("192.168.0.31",5001); serverSocket.bind(sa);
			 */

			// client의 연결을 수락하고 통신용 Socket을 생성
			for(int i = 0; i<10;i++){
				System.out.println("[please wait...socket...]");
				Socket socket = serverSocket.accept();
				count++;
				System.out.println(count + "번 클라이언트 접속완료");
				
				// 클라이언트의 IP정보 얻기
				String clientIP = socket.getInetAddress().getHostAddress();
				System.out.println("[클라이언트{" + clientIP + "의 연결을 수락함]");
				
				//클라이언트의 연결을 끊음
				socket.close();
			}

		} catch (IOException e) {
			//
		}
		
		try {
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
