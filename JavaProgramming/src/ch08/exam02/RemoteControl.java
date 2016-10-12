package ch08.exam02;

public interface RemoteControl {

	//상수(Constant)  //특정값을 사용할때 상수를 사용하면 코드 가독성에 좋다.
	int MAX_VOLUME=10;  //static final 생략가능.
	int MIN_VOLUME=1;
		
	//추상메소드(Abstract Method)
	void turnOn();  //public abstract 생략가능.
	void turnOff();
	void setVolume(int volume);
	
	//디폴트메소드(Default Method)
	default void setMute(boolean mute){ //public 생략
		if(mute){
			System.out.println("무음설정");
		}else{
			System.out.println("무음해제");
		}
	}
	
	//정적메소드(Static Method)
	static void changeBattery(){  //인터페이스마다 추가적인 기능이 필요할때 , 객체없이 사용가능.
		System.out.println("건전지 교체");
	}
}
