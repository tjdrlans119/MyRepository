package ch07.exam01;

public class Machine {

	// Field
	public String kind;
	public String maker;
	
	// COnstrutor
	public Machine(){
		System.out.println("Machine() 실행됨");
	}
	
	// Method
	void turnOn() {
		System.out.println(maker +"."+ kind+"On");
	}

	void turnOff() {
		System.out.println(maker +"."+ kind+"Off");
	}
}
