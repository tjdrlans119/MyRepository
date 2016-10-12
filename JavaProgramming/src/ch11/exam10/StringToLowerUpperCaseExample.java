package ch11.exam10;

public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {
		String oldStr = "Java Programming";

		String newStr = oldStr.toLowerCase();
		System.out.println(oldStr);
		System.out.println(newStr);
		System.out.println(oldStr == newStr);

		System.out.println("---------------------------------------------------------------------");
		
		System.out.println(oldStr.equals("java programming"));
		System.out.println(oldStr.toLowerCase().equals("java programming".toLowerCase()));
		System.out.println(oldStr.toUpperCase().equals("java programming".toUpperCase()));
		//oldStr을 모두 소문자로 바꾸고 문자열을 리턴한뒤 같은지 비교한다.
		//(같은 문자인지 비교할때, 한개를 모두 대문자 or 소문자로바꿔서 비교한다.)
		
		System.out.println("---------------------------------------------------------------------");
		
		String targetStr = "                  Java Programming          ";
		System.out.println(oldStr==targetStr);
		System.out.println(oldStr.equalsIgnoreCase(targetStr));
		System.out.println(oldStr.equalsIgnoreCase(targetStr.trim()));
		//trim 앞뒤 공백을 잘라낸다(중간공백은못짤라냄)
			
		
	}
}
