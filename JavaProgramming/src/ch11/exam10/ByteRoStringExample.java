package ch11.exam10;

import java.io.UnsupportedEncodingException;

public class ByteRoStringExample {
	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 }; //byte타입의 배열을 만든다.
		//ASCII코드이다
		
		String str1 = new String(bytes); //new면 생성자 호출이다.  
		System.out.println(str1); // System클래스에서 '.'(점) 정적메소드,정적필드를 의미한다. / out.
		//out은 PrintSstream 타입이다.
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
		
		System.out.println("------------------------------------------------------------------------");
		String str3 = "홍길동";
		byte[] strBytes3 = str3.getBytes(); //홍길동 문자열을 byte배열로 바꾸고나서
		String str4 = new String(strBytes3); //다시 byte배열을 str4에 복원한다.
		System.out.println(str4);
		//위 생성자는 하나의 배열을 
		
		System.out.println("------------------------------------------------------------------------");
		String str5 = "홍길동";
		byte[] strBytes5 = str5.getBytes("EUC-KR"); //Encoding
		String str6  =new String(strBytes5, "UTF-8");	// String은 2바이트를 읽고 2바이트로 바꾸려고한다. //Decoding
		System.out.println(str6);
		String str7 = new String(strBytes5, 1,3, "UTF-8");
		System.out.println(str7);
		
		/*UTF-8은 3바이트로 인코딩, 디코딩한다.
		EUC-KR은 2바이트로 인코딩, 디코딩한다.
		네트워크할때 모든 데이터는 바이트로 전송된다.
		
		
/*		System.out.println("------------------------------------------------------------------------");
		String str7 ="ab홍길동";
		byte[] strBytes7 = str6.getBytes("EUC-KR"); //Encoding
		String str8  =new String(strBytes7, "UTF-8");	//Decoding
		System.out.println(str8);
		
		System.out.println("------------------------------------------------------------------------");
		String str9 ="ab홍길동";
		byte[] strBytes9 = str6.getBytes("EUC-KR"); //Encoding
		String str10  =new String(strBytes9, "UTF-8");	//Decoding
		String str11 = new String(strBytes10, 2, 2 "EUC-KR");
		System.out.println(str11);
*/		
		
	}
}
