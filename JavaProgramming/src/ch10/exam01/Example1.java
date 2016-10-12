package ch10.exam01;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("입력:>");
				String data = scanner.nextLine();
				int value = Integer.parseInt(data);
				System.out.println(value);
			} catch (Exception e) {
				System.out.println("type miss");
			} finally {
				System.out.println("RUnRUn");
			}

		}
	}
}
