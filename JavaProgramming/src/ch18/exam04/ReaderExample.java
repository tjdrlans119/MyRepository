package ch18.exam04;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {
	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("src/ch18/exam04/data.txt");
		String data = "";
		int value = -1;
		while ((value = reader.read()) != -1) {
			char ch = (char) value;
			data += ch;
		}
		reader.close();
		System.out.println(data);

		reader = new FileReader("src/ch18/exam04/data.txt");
		data = "";
		char[] values = new char[3];
		int charNum;
		while ((charNum = reader.read(values)) != -1) {
//			data += new String(values);
			//마지막 글자가 2개읽어오고 1개가남는데 전에 읽엇던 '지' 가 한번더나온다.
			//출력: 아~ 가을이네요. 독서의 계절이지요.지 (이렇게)
			data += new String(values,0,charNum);
//			System.out.print("("+data+")");
//			System.out.println(values[0]);
			System.out.println(values[2]);
		}
		reader.close();

	}
}
