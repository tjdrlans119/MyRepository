package ch18.exam08;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {

		Scanner scanner1 = new Scanner(System.in); // InputStream에 자식객체가 들어온다

		System.out.print("나이>");
		int age = scanner1.nextInt();

		System.out.print("이름>");
		String name = scanner1.nextLine();

		System.out.print("키>");
		double height = scanner1.nextDouble();
		System.out.println();
		System.out.println("당신은 :" + name + "이군요\n" + "나이는 :" + age + "살이네요\n" + "키는 : " + height + "cm네요");

	}
}
