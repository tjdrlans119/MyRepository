package ch05.exam01;

public class ValueRefenceCompare {

	public static void main(String[] args) {

		//값비교
		int v1= 100;
		int v2= 100;
		System.out.println("값비교="+(v1==v2));
		
		//참조비교
		String r1 = new String("a");
		String r2 = new String("a");
		System.out.println("참조비교="+(r1==r2));
		System.out.println("참조비교="+(r1!=r2));
		
		String r3 = "자바";
		String r4="자바";
		System.out.println(r3==r4);
		System.out.println(r3!=r4);
		
		
	}

}
