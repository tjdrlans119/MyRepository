package ch09.exam05;

public class A {
	int field = 10;
	static int field2 = 5;
	
	static B b = new B(); //A객체 없이도 B객체를 만들수있기 때문에 가능하다
	
	public A(){
		B b = new B();
	}
	
	void method(){ //A객체 없이도 실행가능한 코드가와야한다
		B b = new B();  //A없이도 사용가능
	}
	
	static void method2(){
		B b =  new B();
	}
	
	
	public static class B { //A객체 없이도 B를만들수있다.

		void method(){
//			field = 0;
		}
		int field1;
		static int field2;

		void method1(){}
		static void method2(){}
		
	}

}
