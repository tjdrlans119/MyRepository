package ch09.exam06;

public class A {
	int field = 10;

	public void method() {
		final int local = 10; //final 붙히는 이유 : 컴파일 1.7이하버전에서 컴파일이 안됨.;
		class B { // 로컬클래스
			void method() {
				field = 5;
				//local = 5;
				int result = local + field;
			}
		}
		B b = new B();
	}
}
