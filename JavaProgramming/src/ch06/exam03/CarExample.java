package ch06.exam03;

public class CarExample {
	public static void main(String[] args) {
		// Car변수 선언
		Car myCar = null;
		// Car 객체 생성하고 위치정보 얻기
		try {
			myCar = new Car(); // 객체가 있다면 생성 번지의 주소가 myCar에 저장된다.
		} catch (Exception e) {
		}
		// Car 객체가 있는지 조사
		if (myCar != null) {
			System.out.println("Car객체 있음");
		} else {
			System.out.println("Car객체 없음");
		}
		System.out.println("----------------------------------------------");
		// 객체 내부의 필드값을 읽어는다
		System.out.println(myCar.Company);
		// 객체 내부의 필드값을 변경.
		myCar.Company = "KOSA..";
		System.out.println(myCar.Company);
		// 객체 내부의 메소드를 호출한다.
		myCar.run();

	}

}