package ch04.exma01;

//import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		int score = 91;
		System.out.println("프로그램 시작");
		// System.out.print("점수입력:");
		// score = in.nextInt();

		if (score > 90) {
			if (score >= 95) {
				System.out.println("A+ 등급");
			} else {
				System.out.println("A 등급");
			}
		} else if (score > 80) {
			System.out.println("B 등급");
		} else {
			System.out.println("기타등급");
		}

		System.out.println("프로그램 종료");

	}

}