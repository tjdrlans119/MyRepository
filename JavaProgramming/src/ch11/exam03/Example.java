package ch11.exam03;

public class Example {
	public static void main(String[] args) {
		Data d1 = new Data();
		String d1Str = d1.toString();
		System.out.println(d1Str);
		System.out.println(d1);
		String result = d1 + "맑음";
		System.out.println(result);

		A a = new A();
		System.out.println(a);

		java.util.Date d2 = new java.util.Date();
		String d2Str = d2.toString();
		System.out.println(d2Str);
	}
}
