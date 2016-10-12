package ch05.exam03;

import java.util.Scanner;

public class ScoreManagement {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		String[][] students = null; // 총학생수배열]

		while (true) {
			System.out.println("---------------------------------------------------------------------------------");
			if (students == null) {
				System.out.println("| 1.총학생수 || 7. 종료 |");
			} else {
				System.out.println("| 1.총학생수 || 2.목록 || 3.입력 || 4.삭제 || 5.최고 점수 || 6. 평균 || 7. 종료 |");
			}
			System.out.println("---------------------------------------------------------------------------------");
			System.out.print(">선택: ");
			String choice = scanner.nextLine();
			////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			if (choice.equals("1")) {
				System.out.println();
				System.out.print(">총학생수: ");
				int totalNum = Integer.parseInt(scanner.nextLine());
				students = new String[totalNum][]; // 학생수만큼 배열을 만든다. [2]의미는 이름과
													// 점수입력.
				//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			} else if (choice.equals("2")) {
				System.out.println();
				System.out.println("************************************");
				System.out.println("학번\t\t이름\t\t점수");
				System.out.println("************************************");
				for (int i = 0; i < students.length; i++) {
					String[] student = students[i];
					if (student != null) {
						System.out.println(student[0] + "\t\t" + student[1] + "\t\t" + student[2]);
					}
				}
				////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			} else if (choice.equals("3")) {
				System.out.println();
				System.out.println(">이름: ");
				String name = scanner.nextLine();
				System.out.println(">점수: ");
				String score = scanner.nextLine();
				for (int i = 0; i < students.length; i++) {
					if (students[i] == null) {
						String[] student = { String.valueOf(i), name, score };
						students[i] = student;
						break;
					}
				}
				////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			} else if (choice.equals("4")) {
				System.out.println();
				System.out.println(">몇번 학생을 삭제할 건가요?");
				int sno = Integer.parseInt(scanner.nextLine());
				students[sno] = null;
				////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			} else if (choice.equals("5")) {
				int max=0;
				for (String[] student : students) {
					int score = Integer.parseInt(student[1]);
					if (student != null && max < score) {
						max = score;
					}
				}
				System.out.println("************************************");
				System.out.println("학번\t\t이름\t\t점수");
				System.out.println("************************************");
				for (String[] student : students) {
					if (student != null) {
						int score = Integer.parseInt(student[2]);
						if (max == score) {
							System.out.println("번호: " + student[0] + "\t\t이름: " + student[1] + "\t\t점수: " + student[2]);
						}
					}

				}
				////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			} else if (choice.equals("6")) {
				int count = 0, sum = 0;
				for (String[] student : students) {
					if (student != null) {
						count++;
						sum += Integer.parseInt(student[2]);
					}
				}
				System.out.println("평점 :"+ (double)sum/count);

			} else if (choice.equals("7")) {
				System.out.println("프로그램 종료합니다.");
				break;
			}
		}
	}
}