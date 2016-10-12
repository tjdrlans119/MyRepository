package ch13.exam02;

import java.util.Date;

public class BoxExample {
public static void main(String[] args) {
	//제네릭 사용
	Box<String> box1 = new Box<String>(); //T에 String타입을 말한것이다.
	box1.setItem("홍길동");
	String name = box1.getItem();
	
	Box<Integer> box2 =new Box<Integer>();
	box2.setItem(10);
	int value = box2.getItem();
	
	Box<Date> box3 = new Box<>();//뒤에 Date를 다시안넣어도 앞에서
	                                              //Date가 있기때문에 앞에타입을 참조해서 들어간다.
	box3.setItem(new Date());
	Date now = box3.getItem();
	
	//T를 구체적인 타입을 저장안하면
	//오브젝트를 붙힌다.
	
	
}
}
