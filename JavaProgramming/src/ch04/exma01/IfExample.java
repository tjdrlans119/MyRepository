package ch04.exma01;

//import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		int score = 91;
		System.out.println("���α׷� ����");
		// System.out.print("�����Է�:");
		// score = in.nextInt();

		if (score > 90) {
			if (score >= 95) {
				System.out.println("A+ ���");
			} else {
				System.out.println("A ���");
			}
		} else if (score > 80) {
			System.out.println("B ���");
		} else {
			System.out.println("��Ÿ���");
		}

		System.out.println("���α׷� ����");

	}

}