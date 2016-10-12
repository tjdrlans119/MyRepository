package ch02.exam02;

public class Casting {

	public static void main(String[] args) {
		System.out.println("----------Casting----------");
		long v1 = 300;
		int v2 = (int) v1;
		System.out.println("v2 : " + v2);
		System.out.println("-------------------------------");

		byte v3 = (byte) v1;
		System.out.println("v3 : " + v3);
		System.out.println("-------------------------------");

		char v5 = 'A';
		int v6 = 'A';
		int v7 = 'a';
		System.out.println("v5 : " + v5);
		System.out.println("v6 : " + v6);
		System.out.println("v7 : " + v7);
		System.out.println("-------------------------------");

		int v8 = 65;
		char v9 = (char) v8;
		System.out.println("v9 : " + v9);
		System.out.println("-------------------------------");

		char v10 = 66;
		System.out.println("v10 : " + v10);

	}

}
