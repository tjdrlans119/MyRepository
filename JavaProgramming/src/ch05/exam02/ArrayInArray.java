package ch05.exam02;

public class ArrayInArray {

	public static void main(String[] args) {
		int[][] scores = new int[2][3];
		
		System.out.println("배열의 길이");
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		
		System.out.println("-------------------------------");
		for(int i1=0;i1<scores.length; i1++){
			for(int i2=0; i2<scores.length; i2++){
				System.out.println("["+i1+"]"+" ["+i2+"]");
			}
		}
		
		System.out.println("-------------------------------");
		scores[0][1] = 50;
		 System.out.println(scores[0][1]);
		
		
		
		
	}

}

