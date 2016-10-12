package ch12.exam08;

public class WorkObject {
	

	
	//Method
	public synchronized void MethodA() {//하나의 쓰레드만 사용할수 있게 보장.(synchronized)
		System.out.println("ThreadA의 MethodA()잡업 실행");
		notify();
		try {wait();} catch (InterruptedException e) {}
		
	}

	public synchronized void MethodB() {
		System.out.println("ThreadB의 MethodB()잡업 실행");
		notify();
		try {wait();} catch (InterruptedException e) {}

	}
	

}
