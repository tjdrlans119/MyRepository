package ch04.Homework;

public class HomeWork2 {

	public static void main(String[] args) {

		for (int x = 1; x <= 10; x++) { // x값 1~10까지
			for (int y = 1; y <= 10; y++) {  // y값 1~10까지.
				if ((4 * x) + (5 * y) == 60) // 만약 (4*x) + (5*y) 합이 60 이라면,
					System.out.println("(" + x + "," + y + ")"); // x,y값을 출력하라.
			} //for문 종료.
		} //for문 종료..
	}

}
