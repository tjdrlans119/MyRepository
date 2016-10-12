package ch13.exam02;

public class Box<T> {
	private T item;// item에 다양한 타입의 Object를 저장하겟다
	// T라는건 결정이안된 타입을 의미한다.

	
	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

}
