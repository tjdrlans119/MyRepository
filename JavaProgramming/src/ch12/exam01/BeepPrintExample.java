package ch12.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) throws InterruptedException {
		Toolkit toolkit = Toolkit.getDefaultToolkit();// getDefaultToolkit()정적
														// 메세지를 통해서 toolkit을 만든다
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			System.out.println(Thread.currentThread().getName());
			//Thread란클래스의 정적메소드인 currentThread를 실행.
			Thread.sleep(500); // 쓰레드를 잠재워라 0.5초 동안
		}
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(500); // 쓰레드를 잠재워라 0.5초 동안
			
		}
		
		
		
		
		
		
	}
}
