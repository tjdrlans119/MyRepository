package ch06.exam08;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		myCal.powerOn();
		
		int result1 = myCal.plus(10, 2);
		System.out.println("plus = "+result1);
		
		double result2 = myCal.divide(10,2);
		System.out.println("divde = "+result2);
		
		myCal.powerOff();

	}

}
