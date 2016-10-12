package ch12.exam01;

import java.awt.Toolkit;

public class BeepPrintExample3 {
	public static void main(String[] args) throws InterruptedException {		
		Toolkit toolkit = Toolkit.getDefaultToolkit();// getDefaultToolkit()정적
														// 메세지를 통해서 toolkit을 만든다
		
		
		Thread thread = new Thread(){
			//익명 객체를 만들어서 쓰레드의자식객체를 상속하고 
			//재정의해서 만드는것.
			@Override
			public void run() {
				for(int i = 0;i<5;i++){
					toolkit.beep();
					System.out.println(Thread.currentThread().getName());
					try{Thread.sleep(500);}	catch(Exception e){}
					}
			}
		};
		thread.setName("Sound Thread");
		thread.start();

		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			System.out.println("출력:"+Thread.currentThread().getName());
			Thread.sleep(500); // 쓰레드를 잠재워라 0.5초 동안
		}
	}
}

		