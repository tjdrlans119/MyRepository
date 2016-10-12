package ch09.exam04;


public class A {
	
//	static B b = new B(); 정적멤버는 B없이도 사용할수 있어야하는데 B를 써서 에러난다.
	
	public A(){ //생성자
		B b = new B();
	}
	
	void method(){  //생성자가 객체 사용 준비가 완료됫기 때문에 호출가능.
		B b = new B();
	}
	
	static void method2(){  
	// B b = new B();	  static 은 객체 없이도 호출할수 있어야 하기 때문에 에러남
	}
	
	
	public class B { //A객체없이는 B를만들수없다.
		int field1;
		void method1(){}
	}
	
}
