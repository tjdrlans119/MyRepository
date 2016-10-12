package ch05.Homework;

import java.util.Scanner;

public class KimoonssBoard {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String[][] boards = null;
		boards = new String[100][];
		int hitNo = 0;

		while (true) {
			System.out.println("-------------------KiMoonss board------------------------");
			System.out.println("--------------------------------------------------------------");
			System.out.println("| 1.목록 || 2.글쓰기 || 3.상세 || 4.수정 || 5.삭제 || 6.종료 |");
			System.out.println("--------------------------------------------------------------");
			System.out.print(">선택: ");
			String choice = scanner.nextLine();
			////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			if (choice.equals("1")) {
				System.out.println("***************게시글 목록***************");
				System.out.println("번호\t\t제목\t\t글쓴이\t\t조회수");
				for (int i = 0; i < boards.length; i++) {
					String[] board = boards[i];
					if (board != null) {
						System.out.println(i + "\t\t" + board[1] + "\t\t" + board[0] + "\t\t" + board[3]);
					}
				}
				System.out.println();
				System.out.println();

				//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			} else if (choice.equals("2")) {
				System.out.println("***글쓰기 입니다***");
				System.out.print("***작성자= ");
				String name = scanner.nextLine();
				System.out.print("***제목= ");
				String title = scanner.nextLine();
				System.out.print("***내용= ");
				String content = scanner.nextLine();
				for (int i = 0; i < boards.length; i++) {
					if (boards[i] == null) {
						String[] board = { name, title, content, String.valueOf(hitNo) };
						boards[i] = board;
						break;
						
					}
				}
				System.out.println();
				System.out.println();

				///////////////////////////////////////////////////////////////////////////
			} else if (choice.equals("3")) {
				
				System.out.println("***상세보기입니다***");
				System.out.print("***원하는 목록번호 입력: ");
				int selectNo = scanner.nextInt();

				if (boards[selectNo] != null) {
					System.out.println("작성자: " + boards[selectNo][0]);
					System.out.println("제목: " + boards[selectNo][1]);
					System.out.println("내용: " + boards[selectNo][2]);

					hitNo = Integer.parseInt(boards[selectNo][3]);
					hitNo++;
					boards[selectNo][3] = String.valueOf(hitNo);
				} else {
					System.out.println(selectNo + "번  게시물이 없습니다.");
				}
				System.out.println();
				System.out.println();

				////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			} else if (choice.equals("4")) {
				System.out.println("***수정하기 입니다***");
				System.out.print("***수정 목록번호 입력: ");
				int revise = Integer.parseInt(scanner.nextLine());
				System.out.print("제목(수정) : ");
				boards[revise][1] = scanner.nextLine();
				System.out.println("내용(수정) : ");
				boards[revise][2] = scanner.nextLine();
				System.out.println();
				System.out.println();

				////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			} else if (choice.equals("5")) {
				System.out.println("***삭제하기 입니다***");
				System.out.print("***삭제 목록번호 입력: ");
				int delNo = Integer.parseInt(scanner.nextLine());
				boards[delNo] = null;
				System.out.println();
				System.out.println();

				////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			} else if (choice.equals("6")) {
				System.out.println("프로그램 종료합니다.");
				break;
			} else {
				System.out.println("Please re-enter");
			}
		}

	}

}
