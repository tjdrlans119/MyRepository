package ch07.exam05;

public class Machine {
	public void work() {
		System.out.println("Machine-work 실행");
	}
	
	public final void powerOn() {
		System.out.println("전원 ON");
	}
	
	public final void powerOff() {
		System.out.println("전원 OFF");
	}
}
