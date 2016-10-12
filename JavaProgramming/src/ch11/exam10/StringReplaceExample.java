package ch11.exam10;

public class StringReplaceExample {
public static void main(String[] args) {
	String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";
	
	String newStr = oldStr.replace("자바", "Java");
	System.out.println(oldStr);
	System.out.println(newStr);
	System.out.println(oldStr==newStr); //string 은 값아서 객체가 생성되면 값을 바꿀수 없다.
	//즉 String은 내부의 문자열을 바꿀수없다.
}
}
