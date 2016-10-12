package ch08.exam02;

public class Television implements RemoteControl { // RemoteControl을 구현한 Television 구현 클래스이다.
													// Audio는RemoteControl인터페이스로 사용할수있다.
	private int volume;

	@Override // RemoteControl 인터페이스에 있는 설명서와 선언된 추상메소드가 같은지 컴파일러에서 확인하라.
	public void turnOn() {// 추상메소드 //여기는 public을 생략하면안된다. public을 생략하면
							// default로되고
							// 접근제한을 더 강하게 Override 못한다.
		System.out.println("TV ON");
	}

	@Override
	public void turnOff() {// 추상메소드
		System.out.println("TV OFF");
	}

	@Override
	public void setVolume(int volume) {// 추상메소드
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME){
			this.volume=RemoteControl.MIN_VOLUME;
		}else{
			this.volume=volume;
		}
		System.out.println("Volume: "+volume);
	}

}
