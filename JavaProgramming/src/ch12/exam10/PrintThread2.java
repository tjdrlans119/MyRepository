package ch12.exam10;

public class PrintThread2 extends Thread {

	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("실행중...");
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {	}
		System.out.println("자원장리");
		System.out.println("실행종료");
	}
}
