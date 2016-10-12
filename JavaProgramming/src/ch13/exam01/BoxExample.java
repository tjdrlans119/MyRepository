package ch13.exam01;

import java.util.Date;

public class BoxExample {
public static void main(String[] args) {
	Box box1 = new Box();
	//제네릭 미사용시.
	box1.setItem("홍길동");
	String name = (String)box1.getItem();//오브젝트타입이기때문에 String로 타입변환해야한다
	
	Box box2 =new Box();
	box2.setItem(10);
	int value = (Integer)box2.getItem();//오브젝트타입이기때문에 Integer로 타입변환해야한다
	
	Box box3 = new Box();
	box3.setItem(new Date());
	Date now = (Date) box3.getItem(); //오브젝트타입이기때문에 Date로 타입변환해야한다
	
	
	
}
}
