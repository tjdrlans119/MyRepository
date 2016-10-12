package ch04.exma02;

public class Test1 {
	public static void main(String[] args) {

		while (true) {
			int fir = (int) (Math.random() * 6) + 1;
			int two = (int) (Math.random() * 6) + 1;

			int sum = fir + two;

			if (sum == 10) {
				System.out.println("(" + fir + "," + two + ")");
			}
				break;
						
		}
	}
}
