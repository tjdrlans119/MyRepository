package ch07.exam09.test;

public class Car {
	Tire[] Tire  = { new Tire("앞왼쪽", 6),
			new Tire("앞오른쪽", 2),
			new Tire("뒤왼쪽", 3),
			new Tire("뒤오른", 4) };

	// Constructor

	// Method
	
	int run() {
		System.out.println("자동차가 달립니다.");
		for (int i = 0; i < Tire.length; i++) {
			if (Tire[i].roll() == false) {	stop();return (i+1);}	
		}
	return 0;
	}
	
	void stop() {
		System.out.println("차량정지");
	}
}
