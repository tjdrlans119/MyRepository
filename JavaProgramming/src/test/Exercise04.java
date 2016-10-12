package test;

public class Exercise04 {

	public static void main(String[] args) {
		while (true) {
			int a1 = (int) ((Math.random() * 6) + 1);
			int a2 = (int) ((Math.random() * 6) + 1);
			// 합이 5이면 실행을 멈추는 코드
			if (a1 + a2 == 5) {
				System.out.println("(" + a1 + ", " + a2 + ")");
			}
			
		}
	}
}
