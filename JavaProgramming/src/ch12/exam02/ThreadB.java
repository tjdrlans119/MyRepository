package ch12.exam02;

public class ThreadB extends Thread {

	// Field

	// Constructor

	// Method
	@Override
	public void run() {
		for (int i = 1; i <= 200000000; i++) {
		}
		System.out.println("ThreadB종료");
	}

}
