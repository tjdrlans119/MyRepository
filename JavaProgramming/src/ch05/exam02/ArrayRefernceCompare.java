package ch05.exam02;

public class ArrayRefernceCompare {
	public static void main(String[] args) {
		String[] names = new String[3];
		
		names[0]="홍길동";
		names[1]="홍길동";
		names[2]=new String("홍길동");
		
		//같은 객체내용이기 때문에 같은 객체를 이용한다.
		System.out.println(names[0]== names[1]);
		//new를 썻기 때문에 새로운 객체로 만들어진다
		System.out.println(names[0]== names[2]);
		
		//문자열비교할때.
		System.out.println(names[0].equals(names[1]));
		System.out.println(names[0].equals(names[2]));
		
		
		
		

	}

}
