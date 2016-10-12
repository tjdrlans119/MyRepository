package ch08.exam03;

public class Example {
	public static void main(String[] args) {
		
		//RemoteControl.setMute(true);//RemoteControl이 참고하는 객체가 없기 때문에 사용 못함.
		
		RemoteControl rc = new Television();  //객체 만듬.
		rc.setMute(true);//RemoteControl 에 디폴트메소드로 선언되어있고, 객체가 있어서 실행가능하다.
		rc.setVolume(200);
		
		
		RemoteControl.changeBattery();
		
		
	}
}
