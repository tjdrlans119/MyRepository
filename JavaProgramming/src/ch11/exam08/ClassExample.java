package ch11.exam08;

public class ClassExample {
	public static void main(String[] args) throws ClassNotFoundException {
		// Class classCar = Car.class;  //이미 로딩이 되어있는 클래스를 가져와라
//		Class classCar = Class.forName("ch11.exam08.Car");  //로딩된거랑 상관없다
	
		Car car = new Car();
		Class classCar = car.getClass();
		System.out.println(classCar.getName());
		System.out.println(classCar.getSimpleName());
		System.out.println(classCar.getPackage().getName());

	}
}
