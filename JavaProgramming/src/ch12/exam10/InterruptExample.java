package ch12.exam10;

public class InterruptExample {
public static void main(String[] args) {
	
	PrintThread3 printThread1=new PrintThread3();
	
	printThread1.start();
	
	try {	Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
//	printThread1.stop(); //그냥종료된다.
	printThread1.interrupt();
	
	
}
}