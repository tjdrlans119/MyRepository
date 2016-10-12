package ch12.exam02;

public class ThreadA extends Thread {

	// Field

	// Constructor

	// Method
	@Override
	public void run() {
		for (int i = 1; i <= 1000000000; i++) {
		}
		System.out.println("ThreadA종료");
	}

}
