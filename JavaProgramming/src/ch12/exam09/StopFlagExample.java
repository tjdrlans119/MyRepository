package ch12.exam09;

public class StopFlagExample {
public static void main(String[] args) {
	
	PrintThread1 printThread1=new PrintThread1();
	
	printThread1.start();
	
	
	try {	Thread.sleep(3000);} catch (InterruptedException e) {}
//	printThread1.stop(); //그냥종료된다.
	printThread1.setStop(true);//안전하게 종료된다
	
	
	
}
}