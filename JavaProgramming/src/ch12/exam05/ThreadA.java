package ch12.exam05;

public class ThreadA extends Thread {
	public boolean stop = false;
	public boolean work = true;

	@Override
	public void run() {
		while (!stop) {
			if (work) {
				System.out.println("ThreadA 작업 내용");
				
			} else {
					Thread.yield(); //무의미한 무한반복을 막기위해서 yield를 호출한다.
			}
		}
		System.out.println("ThreadA 종료");
	}

}
