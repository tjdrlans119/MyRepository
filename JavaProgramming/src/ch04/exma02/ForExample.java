package ch04.exma02;

public class ForExample {

	public static void main(String[] args) {
		int total = 0;
		float avg = 0;
		for (int i = 1; i <= 3; i++) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			total += num;
			avg = (float)total/3;
		}
		System.out.println("ÃÑÇÕ = "+total+"   /   ÃÑÆò±Õ = "+avg);

		/*
		 * for (int a = 1; a <= 5; a++) { for (int i = 1; i <= a; i++) {
		 * System.out.print("*"); } System.out.println(); }
		 */
	}

}
