package ch11.exam10;

import java.io.UnsupportedEncodingException;

public class StrinGetByteExample {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "안녕하세요"; //2바이트씩 10바이트면 표현가능하다.
		
		byte[] bytes1 = str.getBytes();// String-> byte[] 바꾼것
		System.out.println("bytes1.length: "+bytes1.length); //15인 이유는 utf는 3바이트씩이기때문이다.
		
		byte[] bytes2 = str.getBytes("EUC-KR");
		System.out.println("bytes2.length: "+bytes2.length);
		
		byte[] bytes3 = str.getBytes("UTF-8");
		System.out.println("bytes3.length: "+bytes3.length);
	
		String str1 = new String(bytes1); //byte-> String
		System.out.println("str1: "+ str1);
		
		String str2 = new String(bytes2, "EUC-KR");
		System.out.println("str1: "+ str2);
		
		String str3 = new String(bytes3, "UTF-8");
		System.out.println("str3: "+ str3);
		
	}
}
