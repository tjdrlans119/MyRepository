package ch18.exam16;

import java.io.IOException;
import java.net.InetAddress;

public class InetAddressExample {
	public static void main(String[] args) throws IOException {
		InetAddress MyIA = InetAddress.getLocalHost();
		String myIP = MyIA.getHostAddress();
		System.out.println("내컴퓨터 IP: " + myIP);

		InetAddress[] naverIAs = InetAddress.getAllByName("www.naver.com");
		for (InetAddress ia : naverIAs) {
			System.out.println("NAVER IP주소: " + ia.getHostAddress());
		}

	}
}
