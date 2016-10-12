package ch07.exam13;

public class SmartPhone extends Phone {
	public void internet() {
		System.out.println("internet...");
	}

	@Override
	public void ring() {
		System.out.println("SmartPhone Bellllllllllll");
	}
}
