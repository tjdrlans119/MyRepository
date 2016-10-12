package ch07.exam13;

public abstract class Phone {

	public String number;

	public abstract void ring();

	public void sendVoice() {
		System.out.println("send Voice");
	}

	public void receiveVoice() {
		System.out.println("receive Voice");
	}

}
