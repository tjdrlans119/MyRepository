package ch18.exam17;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class ClientExample {
	public static void main(String[] args) {

		for (int a = 0; a < 1000; a++) {
			// 소켓 생성
			Socket socket = new Socket();
			// 연결 요청하기
			try {
				SocketAddress sa = new InetSocketAddress("192.168.0.48", 5001);
				socket.connect(sa);
				System.out.println("[seuses connect!]");
			} catch (IOException e) {
			}

			// 서버의 연결을 끊음
			try {
				socket.close();
			} catch (IOException e) {
			}

		}
	}
}
