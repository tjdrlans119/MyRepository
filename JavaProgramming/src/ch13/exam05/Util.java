package ch13.exam05;

import ch13.exam02.Box;

public class Util {
	
	/*public static <Date> Box<Date> boxing1(Date t) {
		Box<Date> box = new Box<Date>();
		box.setItem(t);
		return box;
	}
	위 방법은 여러개를 만들어야한다.*/
	
	public static <T> Box<T> boxing(T t) { 
		//타입파라메타로서 T를 사용하겟다. 
		//T는 타입이 결정되지않았다.
		Box<T> box = new Box<T>();
		box.setItem(t);
		return box;
	}
	
	
	
	
	
}
