package ch08.exam07;

public class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("bus run.....");
		
	}
	
	public void checkFare(){
		System.out.println("checkFare");
	}
}
