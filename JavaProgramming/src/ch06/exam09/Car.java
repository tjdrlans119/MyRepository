package ch06.exam09;

public class Car {

	// Field
	int gas;
	// Constructor

	// Method
	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas없다");
			return false;
		} else {
			System.out.println("gas있다");
			return true;
		}
	}
	
	void run(){
		while(true){
			if(gas>0){
				System.out.println("달립니다.(gas 잔량:"+gas+")");
				gas--;
			}else{
				System.out.println("멈춥니다.(gas 잔량:"+gas+")");
				return;
			}
		}
	}

}
