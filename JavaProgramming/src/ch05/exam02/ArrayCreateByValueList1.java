package ch05.exam02;

public class ArrayCreateByValueList1 {

	public static void main(String[] args) {
		// how1
		int[] scores1 = { 83, 90, 87 };

		// how2
		int[] scores2;
		scores2 = new int[] { 33, 32, 31 };

		System.out.println(scores1[0]);
		// System.out.println(scores1[4]);
		// ArrayIndexOutOfBoundsException:4 오류.

		int arrayLength = scores1.length;
		System.out.println("배열의길이 = " + arrayLength);

		for (int i = 0; i < scores1.length; i++) {
			System.out.println(scores1[1]);
		}

		int sum = 0;
		for (int i = 0; i < scores1.length; i++) {
			sum += scores1[i];
		}

		System.out.println("전체합 = " + sum);
		double avg = (double) sum / scores1.length;
		System.out.println("전체평균 = " + avg);

		sum(new int[] { 12, 32, 4 });
	}

	public static void sum(int[] arr) {

	}
}
