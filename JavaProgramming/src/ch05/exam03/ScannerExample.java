package ch05.exam03;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		// 학생입력
		System.out.println("학생수: ");
		String strNum = scanner.nextLine();
		int num = Integer.parseInt(strNum);

		int[] scores = new int[num];

		// 점수입력
		for (int i = 0; i < scores.length; i++) {
			System.out.print("점수: ");
			String data = scanner.nextLine();
			int score = Integer.parseInt(data);
			scores[i] = score;
		}

		String[] names = new String[num];
		// 이름입력
		for (int i = 0; i < scores.length; i++) {
			System.out.print("이름: ");
			String name = scanner.nextLine();
			names[i] = name;

		}

		// 합계,평균 출력
		int sum = 0;
		for (int s : scores) {
			sum += s;
		}
		System.out.println("합계: " + sum);
		System.out.println("평균: " + sum / scores.length);
	}

}