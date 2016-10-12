package ch09.exam08;

public class A {
	
	interface B{}//A객체가 잇어야 사용가능하다
	class BImple implements B{
		
	}
	
	
	
	static interface C{} //A가 없어도 사용가능하다.
	class CImple implements C{
		
	}
	
	
}
