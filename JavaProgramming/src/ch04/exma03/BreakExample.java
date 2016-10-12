package ch04.exma03;

public class BreakExample {

	public static void main(String[] args) {
		// 주사위의 눈이 6이 나오면 프로그램을 종료하세요.

		/*
		 * while (true) { int dice = (int) (Math.random() * 6) + 1; if (dice ==
		 * 6) { break; } System.out.println(dice); }
		 */

		int dice = 0;
		 do {
		 dice = (int) (Math.random() * 6) + 1;
		 System.out.println(dice);
		 } while (dice != 6);

		

	}

}
