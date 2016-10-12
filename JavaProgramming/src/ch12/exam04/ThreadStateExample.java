package ch12.exam04;

public class ThreadStateExample {
	public static void main(String[] args) {
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		//변수선언                                          객체생성              생성자매개값으로 객체를준다.
		statePrintThread.start();
		//StatePrintThread는 쓰레드를 상속한 자식객체이다
		
	}
}
