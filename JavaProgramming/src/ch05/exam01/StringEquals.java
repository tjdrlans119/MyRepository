package ch05.exam01;

public class StringEquals {

	public static void main(String[] args) {
		String name1 ="기문";
		String name2 ="기문";
		String name3 = new String("기문");
		System.out.println("String name1 ="+"기문");
		System.out.println("String name2 ="+"기문");
		System.out.println("String name3 = new String("+"기문)");
		System.out.println();
		System.out.println(name1==name2);
		System.out.println(name1==name3);
		System.out.println(name1.equals(name3));
		

	}

}
