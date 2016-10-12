package ch04.exma02;

public class WhileExample3 {

	public static void main(String[] args) throws Exception {
		while (true) {
//			System.out.println("입력하세요: ");
			int num = System.in.read();
			if (num != 13 && num != 10) {
				System.out.println((char) num + "의 유니코드=" + num);
			}
		}
	}
}
/*
 * if (num != 13) { if (num != 10) { System.out.println((char) num + "의 유니코드=" +
 * num); } }
 */