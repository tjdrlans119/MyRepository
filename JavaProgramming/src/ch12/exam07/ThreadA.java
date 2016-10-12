package ch12.exam07;

public class ThreadA extends Thread {
	public boolean stop = false;
	public Work work = Work.CONTINUE;

	@Override
	public void run() {
		while (!stop) {
			if (work ==Work.CONTINUE) {
				System.out.println("ThreadA 작업 내용");
				
			} else if(work ==Work.PAUAE) {
					Thread.yield(); //무의미한 무한반복을 막기위해서 yield를 호출한다.
			}
		}
		System.out.println("ThreadA 종료");
	}

}
