package hancom_pre_test.test1;

import java.io.IOException;
import java.util.Scanner;

public class drawTriangle {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("> ");
		int lineNumber = scan.nextInt();

		drawTriangle(lineNumber);

	}

	private static void drawTriangle(int lineNumber) {
		int count = 0;
		int[] number = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int i = 0, j = 0;
		for (i = 0; i < lineNumber - 1; i++) {
			for (j = i; j < lineNumber - 1; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < 2 * i + 1; j++) {
				if (j == 0 | j == 2 * i) {
					if (count < 10) {
						System.out.print(number[count]);
					} else {
						count = 0;
						System.out.print(number[count]);
					}
					count++;
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (j = 0; j < 2 * i + 1; j++) { 

			if (count != 10) {
				System.out.print(number[count]);
			} else if (count == 10) {
				count = 0;
				System.out.print(number[count]);
			}
			count++;
		}
	}
}