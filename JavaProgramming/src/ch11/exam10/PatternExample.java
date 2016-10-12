package ch11.exam10;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {

		String tel1 = "010-123-1234";
		String tel2 = "013-123-1234";
		String tel3 = "010-1232-1234";
		String tel4 = "010-1232-120";
		String regExp = "(010|011)-\\d{3,4}-\\d{4}"; // 정규표현식

		System.out.println(Pattern.matches(regExp, tel1));
		System.out.println(Pattern.matches(regExp, tel2));
		System.out.println(Pattern.matches(regExp, tel3));
		System.out.println(Pattern.matches(regExp, tel4));
		System.out.println("-------------------------------------------------------");
		String email1 = "hong@naver.com";
		String email2 = "hong\naver.co.kr";
		String email3 = "hong@naver";
		String reqExp2 = "\\w+@+\\w+\\.(\\w+)?";

		System.out.println(Pattern.matches(reqExp2, email1));
		System.out.println(Pattern.matches(reqExp2, email2));
		System.out.println(Pattern.matches(reqExp2, email3));

	}

}
