package ch06.homework3Board;

import java.util.Scanner;

public class KimoonssBoard{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Board[] Boards= new Board[30];
		String no = null, title = null, content = null, name = null;
		int changeNo=0, selectNo=0, count = 0;

		while (true) {
			System.out.println("----------------------------------------------------------------------");
			System.out.println("1.목록 | 2.글쓰기 | 3.상세보기 | 4.수정하기 | 5.삭제하기 | 6.종료");
			System.out.println("----------------------------------------------------------------------");
			System.out.print("선택> ");
			String choice = scanner.nextLine();
			
			if (choice.equals("1")) {
				System.out.println("*******************************************************************");
				System.out.println("번호\t\t게시물 제목\t\t글쓴이\t\t조회수");
				System.out.println("*******************************************************************");
				for (Board boarder : Boards) {
					if (boarder != null) {
						System.out.println(boarder.no + "\t\t" + boarder.title + "\t\t" + boarder.name + "\t\t" + boarder.count);
					}
				}
			} else if (choice.equals("2")) { // 글쓰기
				System.out.println("*******************************************************************");
				System.out.print("글쓴이: ");
				name = scanner.nextLine();
				System.out.print("제목: ");
				title = scanner.nextLine();
				System.out.print("내용: ");
				content = scanner.nextLine();
				System.out.println("***SAVE OK***");
				for (int i = 0; i < Boards.length; i++) {
					if (Boards[i] == null) {
						no = String.valueOf(i);
						Boards[i] = new Board(no, title, name,content);
						break;
					}
				}
			} else if (choice.equals("3")) { // 상세보기

				System.out.println("*******************************************************************");
				System.out.println("번호\t\t제목\t\t내용\t\t조회수");
				System.out.println("*******************************************************************");

				if (no != null) {
					System.out.print("선택> ");
					selectNo = Integer.parseInt(scanner.nextLine());
						if (Boards[selectNo] != null) {
							System.out.println("작성자: " + Boards[selectNo].name);
							System.out.println("제목: " + Boards[selectNo].title);
							System.out.println("내용: " + Boards[selectNo].content);
							
							count = Boards[selectNo].count;
							count++;
							Boards[selectNo].count = count;
					}
				} else
					System.out.println("등록된 글이 없습니다.");
				
			} else if (choice.equals("4")) { // 수정
				if (Boards != null) {
					System.out.print("수정할 번호> ");
					changeNo = Integer.parseInt(scanner.nextLine());
					if (Boards[changeNo] != null) {
						System.out.print("수정할 제목> ");
						title = scanner.nextLine();
						System.out.print("수정할 내용> ");
						content = scanner.nextLine();
						Boards[changeNo].title = title;
						Boards[changeNo].content = content;
					}
				} else
					System.out.println("목록이 없습니다.");
				
			} else if (choice.equals("5")) { // 삭제
				if (Boards != null) {
					System.out.print("삭제할 번호> ");
					int remove = Integer.parseInt(scanner.nextLine());
					if (Boards[remove] != null) {
						Boards[remove] = null;
					}
				} else
					System.out.println("목록이 없습니다.");
			} else if (choice.equals("6")) {
				System.out.println("***Program exit***");
				break;
			}
		}

	}

}