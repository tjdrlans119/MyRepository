package ch11.exam10;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];

		System.out.print("input>");
		int readByteNo = System.in.read(bytes);
//		String str = new String(bytes);
		String str = new String(bytes,0,readByteNo-2);
		System.out.println(str);
		

	}
}
