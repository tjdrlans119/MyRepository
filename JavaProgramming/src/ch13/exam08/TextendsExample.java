package ch13.exam08;

public class TextendsExample {
	public void method1(C1<Integer> arg){}
	public void method2(C1<? extends Number>args){}
	public C1<? extends Number> method3(){return null;}
	
}


class C1<T>{}  //T를 새로운 파라메타로 선언
class C2<T extends Number>{}
class C3{
	public <T> void method(T t){}  //타입파라메타로 <T>를 새로선언한다.
	public <T extends Number> void method(T t){}
// public <? extends Number> void method(T t){} 기존의 제네릭타입이 없기때문에 안됨
}

