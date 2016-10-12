package ch07.exam09.test;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();

		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			if (problemLocation != 0) {
				System.out.println(car.Tire[problemLocation - 1].location + "HankookTire로교체");
				car.Tire[problemLocation - 1] = new HankookTire(car.Tire[problemLocation - 1].location, 15);
			}
			System.out.println("-----------------------------------------");

		}
	}
}
