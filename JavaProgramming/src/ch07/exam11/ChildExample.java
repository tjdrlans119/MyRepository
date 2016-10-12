package ch07.exam11;

public class ChildExample {
public static void main(String[] args) {
	Parent parent = new Child();
	parent.field1="data1";
	parent.method1();
	parent.method2();
	
/*
	parent.field2 = "data2";    자식타입이 부모타입이 됫을때 부모타입
	parent.method3();			껏만 사용할 수 있기 때문에 안된다.
*/
	
	
	Child child = (Child) parent;  //강제타입변환을통해 자식껏 까지 사용가능하다.
	child.filed2 = "data2";
	child.method3();
		
	
}
}
