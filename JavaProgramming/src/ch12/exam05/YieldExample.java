package ch12.exam05;

public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA(); // 쓰레드 객체를 만든다.
		ThreadB threadB = new ThreadB();

		threadA.start();
		threadB.start();

		try {Thread.sleep(3000);} catch (InterruptedException e) {	} // Thread 3초간 잠재움
		threadA.work = false;// threadA의 work 값을 false로 바꾼다

		try {Thread.sleep(3000);} catch (InterruptedException e) {} // Thread 3초간 잠재움
		threadA.work = true;// threadA의 work 값을 false로 바꾼다

		try {Thread.sleep(3000);} catch (InterruptedException e) {} // Thread 3초간 잠재움
		threadA.stop = true;// threadA 종료
		threadB.stop = true;// threadB 종료 

	}
}
