package ch07.exam02;

public class DmbCellPhone extends CellPhone {
	// Field
	int channel;

	// Constructor
	public DmbCellPhone(String model, String color, int channel) {
		super(model,color); //부모생성자를 말한다.
		this.channel = channel;
	}

	// Method
	void turnOnDmb(){
		System.out.println("채널"+this.channel+"번  DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel){
		this.channel=channel;
		System.out.println("채널"+channel+"번으로바꿉니다.");
	}
	
	void turnOffDmb(){
		System.out.println("DMB방송 수신을 멈춥니다.");
	}
	

}
