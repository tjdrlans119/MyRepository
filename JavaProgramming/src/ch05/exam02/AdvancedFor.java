package ch05.exam02;

public class AdvancedFor {

	public static void main(String[] args) {
		int[] scores = { 90, 92, 95 };

		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(sum);

		System.out.println("-------------------------------------");
		//위에 내용을 조금더 간단하게 하기위해
		//향상된 for문 사용
		sum=0;
		for (int score:scores){
					sum += score;	
		}
		System.out.println(sum);
		
		System.out.println("-------------------------------------");
		String[] names = {"자바","C언어", "파이썬"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);			
		}
		
		
		//향상된 for문사용
		System.out.println("-------------------------------------");
		for (String name:names){
			System.out.println(name);			
		}
		
		
		
		
		
		
	}

}
