package ch11.homework.p09;

public class StringBuilderExample {
	public static void main(String[] args) {
		String str = "";
		for (int i = 1; i <= 100; i++) {
			str += i; //계속해서 스트링 객체가 참조됨.
		}
		System.out.println(str);
		
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			sb.append(i);//i값 누적
		}
		str = sb.toString();
		System.out.println(str);
	}
}
