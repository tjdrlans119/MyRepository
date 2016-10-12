package ch18.exam07;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class SystemInExample {
	public static void main(String[] args) throws IOException {
//		한개의 키만 읽기
		InputStream is = System.in;
		
/*		System.out.println("키 하나만 입력: ");
		int keyCode = is.read();
		System.out.println(keyCode + ":"+(char)keyCode);
		*/
		//한글과 같은 여러키의 조합을 읽기
		System.out.println("키 여러개 입력: ");
		byte[] vlaues = new byte[100];
		int byteNum = is.read(vlaues);
		System.out.println(Arrays.toString(vlaues));
		String data = new String(vlaues, 0, byteNum-2);
		System.out.println(data);
	}
}
