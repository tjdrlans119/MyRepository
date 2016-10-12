package ch18.exam12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class DoubleStreamExample {
	public static void main(String[] args) throws IOException {
		/*InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		while (true) {
			int vlaue = reader.read();
			if (vlaue == 13) break;
			char data = (char) vlaue;
			System.out.print(data);
		}*/

		InputStream is = System.in;
		Reader reader = new InputStreamReader(is); //보조스트림
		BufferedReader br = new BufferedReader(reader); //보조스트림
		String data = br.readLine();
		System.out.println(data);
			
	}
}
