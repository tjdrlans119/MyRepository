package ch12.exam01;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) throws InterruptedException {
		Toolkit toolkit = Toolkit.getDefaultToolkit();// getDefaultToolkit()정적
														// 메세지를 통해서 toolkit을 만든다
		Thread thread = new Thread(new Runnable(){
			//Runnable인터페이스로 구현한 객체를 새로 만들고 
			//쓰레드의 메개값을 재정의한다.
			//정리: 런어블인터페이스로 구현한 객체를 만들고
			//        쓰레드 매게값으로 넘겨준다음 
			//        익명객체를 만듬.
			//       Runable이 인터페이스타입이기때문에 추상메소드를 재정의해준다.
			@Override
			public void run() {
				for(int i = 0;i<5;i++){
					toolkit.beep();
					System.out.println("소리: "+Thread.currentThread().getName());
					try{Thread.sleep(500);}	catch(Exception e){}
					}
			}
		});
		thread.start();
		
				for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			System.out.println("출력: "+Thread.currentThread().getName());
			Thread.sleep(500); // 쓰레드를 잠재워라 0.5초 동안
		}
	}
}

		