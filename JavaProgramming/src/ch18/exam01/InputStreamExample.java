package ch18.exam01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
	public static void main(String[] args) throws IOException {

		String filePath = InputStreamExample.class.getResource("data.txt").getPath();
		System.out.println(filePath);

		InputStream is = new FileInputStream(filePath);

		System.out.println();

		int count = 0;
		while (true) {
			int value = is.read();
			if (value == -1)
				break;
			System.out.print(value + ", ");
			count++;
		}
		System.out.println("읽은 횟수:" + count);

		System.out.println();

		count = 0;
		is = new FileInputStream(filePath);
		int vlaue = -1;
		while ((vlaue = is.read()) != -1) {
			System.out.print(vlaue + ", ");
			count++;
		}
		System.out.println("읽은 횟수:" + count);
		is.close();

	}
}
