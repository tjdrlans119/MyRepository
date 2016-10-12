package ch07.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","검정",10);
		
		System.out.println("model : "+ dmbCellPhone.model);//상속받은거임
		System.out.println("color : "+ dmbCellPhone.color);  //상속받은것임
		System.out.println("channel : " + dmbCellPhone.channel);//DmbCellPhon 내부를 출력함

		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보숑");
		dmbCellPhone.receiveVoice("나야나");
		System.out.println();
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
		dmbCellPhone.powerOff();
		
	}

}
