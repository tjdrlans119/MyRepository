package ch07.exam05;

public class Robot extends Machine {
	@Override
	public void work() {
		System.out.println("Machine-work 실행");
		super.work();
	}
	
}
