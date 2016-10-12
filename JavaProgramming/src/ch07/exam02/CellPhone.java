package ch07.exam02;

public class CellPhone {
	//Field
	String model;
	String color;

	//Constructor
//	public CellPhone(){}//자식생성자에서 호출함
	public CellPhone(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	//Method	
	void powerOn(){System.out.println("PowerOn");}
	void powerOff(){System.out.println("PowerOff");}
	void bell(){System.out.println("ring..................ring.................");}
	void sendVoice(String message){System.out.println("Me : "+message);}
	void receiveVoice(String message){System.out.println("You: "+message);}
	void hangUp(){System.out.println("down");}
	
}
