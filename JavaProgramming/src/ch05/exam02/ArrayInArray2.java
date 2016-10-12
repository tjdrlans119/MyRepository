package ch05.exam02;

public class ArrayInArray2 {

	public static void main(String[] args) {
		int[][] scores = new int[2][]; // 첫번째 배열의 길이는 2짜리 배열이다.

		scores[0] = new int[2];
		scores[1] = new int[3];
		
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		
		System.out.println("------------------------------------");
		for(int i1=0;i1<scores.length; i1++){
			for(int i2=0; i2<scores.length; i2++){
				System.out.println(scores[i1][i2]);
			}
		}

	}

}
