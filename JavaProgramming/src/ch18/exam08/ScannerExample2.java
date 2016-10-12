package ch18.exam08;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("src/ch18/exam08/data.txt");
		Scanner scanner1 = new Scanner(is); // InputStream에 자식객체가 들어온다
		
		
		String name = scanner1.nextLine();
		int age =Integer.parseInt(scanner1.nextLine());
		double height =Double.parseDouble(scanner1.next());

		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
	}
}
