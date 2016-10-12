package ch09.exam07;

public class A {
	int field = 5;

	public void method() {
		class B { // 로컬클래스
		int field = 10;	
			B() {
				field = 20;
				this.field=30;
				A.this.field=40;  //중첩된 클래스,메소드에서 바깥쪽에 접근할때 사용.
			}
		}
		B b = new B();
		
		System.out.println("B의 필드: "+ b.field);
		System.out.println("A의 필드: "  + field);
	}
}
