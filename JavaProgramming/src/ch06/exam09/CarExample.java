package ch06.exam09;

public class CarExample {

	public static void main(String[] args) {
		Car myCar=new Car();
		
		myCar.setGas(5);

		boolean gasState = myCar.isLeftGas();
		if(gasState==true){
			System.out.println("달린다!!!!!!");
			myCar.run();
		}
		
		if(myCar.isLeftGas()){
			System.out.println("gas를 주입할 필요 없다");
		}else{
			System.out.println("gas주입해라");
		}


	}

}
