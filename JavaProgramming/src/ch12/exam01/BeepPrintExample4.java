package ch12.exam01;

import java.awt.Toolkit;

public class BeepPrintExample4 {
	public static void main(String[] args) throws InterruptedException {
		Toolkit toolkit = Toolkit.getDefaultToolkit();// getDefaultToolkit()정적
														// 메세지를 통해서 toolkit을 만든다

		
		//외부에 쓰레드를 만들어놓고 객체를생성해서 사용
		Thread thread = new SoundThread();//자식객체 타입변환 thread객체 만드는것.
		thread.start();  //start를 실행하게되면 SoundThread가 가지고있는 run이 실행된다.

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			System.out.println("출력:" + Thread.currentThread().getName());
			Thread.sleep(500); // 쓰레드를 잠재워라 0.5초 동안
		}
	}
}
