package ch07.exam01;

public class CellPhone {
	String model;
	String color;
	
	void powerOn(){System.out.println("PowerOn");}
	void powerOff(){System.out.println("PowerOff");}
	void bell(){System.out.println("ring..................ring.................");}
	void sendVoice(String message){System.out.println("Me : "+message);}
	void receiveVoice(String message){System.out.println("You: "+message);}
	void hangUp(){System.out.println("down");}
	
}
