package ch07.exam14;

public class Dog extends Animal {
	public Dog() {
		this.kind = "멍멍이";
	}

	@Override
	public void sound() {
		System.out.println("멍멍멍멍");
	}
}
