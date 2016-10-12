package ch06.exam07Car;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	// 생성자 중복코드 수정.
	Car() {
	}

	Car(String model) {
		this(model, null, 0);
	}

	Car(String model, String color) {
		this(model, color, 0);
	}

	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
