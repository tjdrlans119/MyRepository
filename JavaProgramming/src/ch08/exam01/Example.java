package ch08.exam01;

public class Example {
	
	public static void powerOn(RemoteControl rc) {
		rc.turnOn();  //rc에 들어오는 값에 따라서 값이 바뀌기 떄문에 다향성이 성립된다.
	}

	public static void main(String[] args) {
		int max = RemoteControl.MAX_VOLUME;
		int min = RemoteControl.MIN_VOLUME;

		// RemoteControl.turnOn(); 객체가 없기때문에 안된다.
		// RemoteControl.turnOff(); ex/집에 tv없는데 리모컨을 조작 하는 것처럼
		// RemoteControl.setVolume(5); 추상메소드이기때문에

		// RemoteControl.setMute(true); 디폴트 메소드도 객체가 없기 때문에 사용할수 없다.

		RemoteControl.changeBattery();

		/*
		 * 인터페이스는 4가지 구성멤버를 가진다. 상수와 정적메소드는 인터페이스만 잇으면된다. 추상메소드와 디폴트메소드는 구현객체가
		 * 잇어야한다.
		 */

		// ------------------------------------------------------------------------
		Television tv = new Television();
		tv.turnOn(); // 리모컨을 사용안하고 tv변수를 가지고 사용한거다.

		RemoteControl rc = tv;
		rc.turnOff(); // 리모컨 인터페이스를 가지고 사용한거다.

		Audio audio = new Audio();
		rc = audio;
		rc.turnOff();
		// ------------------------------------------------------------------------;
		System.out.println("------------------------------------------------------------------------");
		powerOn(new Television());
		powerOn(new Audio()); 
		
	}
}
