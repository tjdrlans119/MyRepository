package hancom_pre_test.test2;

import java.util.Scanner;

public class findCodon {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String acgtSequence = scan.nextLine();
		String codon = scan.nextLine();
		findCodon(acgtSequence, codon);

	}

	private static void findCodon(String acgtSequence, String codon) {
		int count = 0;
		int index = 0;
		int compare = index;

		while (compare < acgtSequence.length() - codon.length() + 1) {
			for (int compare_index = 0; compare_index < codon.length(); compare_index++) {
				if (codon.charAt(compare_index) == acgtSequence.charAt(compare_index + compare)) {
					count++;
				}

			}
			if (count == codon.length()) {
				System.out.println(compare);
				count = 0;
				compare = compare + 3;
			}
			count = 0;
			compare++;
		}

	}
}