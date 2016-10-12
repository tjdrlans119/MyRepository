package ch11.homework.p11;

public class IntegerCompareExample {
public static void main(String[] args) {
	//자동 Boxing
	Integer obj1 = 100;
	Integer obj2 = 100;
	Integer obj3 = 300;
	Integer obj4 = 300;
	
	//true: -128~127사이의 값을 비교시 true,
	//같은 객체를 공유하기때문에.
	System.out.println(obj1==obj2);
	
	//false:서로 다른객체이기 때문에.
	System.out.println(obj3==obj4);
	
	//값만 비교시
	System.out.println(obj3.equals(obj4));
	System.out.println(obj3.intValue()==obj4.intValue());
	
}
}
