package ch04.exma01;

public class SwitchExample {

	public static void main(String[] args) {

		/*
		 * double d = Math.random(); 	//0.0 <= random() < 1.0 
		 * d = d * 6; 					//0.0 <= * d < 6.0 
		 * int num = (int)d; 			//0 <= num < 6 
		 * num = num + 1; 					//1,2,3,4,5,6
		 * System.out.println(num);
		 */

		int num = (int) (Math.random() * 6) + 1;
		
		switch (num) {
		case 1:
			System.out.println("1번 콜라");
			break;
		case 2:
			System.out.println("2번 사이다");
			break;
		case 3:
			System.out.println("3번 환타");
			break;
		case 4:
			System.out.println("4번 아메리카노");
			break;
		case 5:
			System.out.println("5번 카페라뗑");
			break;
		default:
			System.out.println("6번 초코쿠키");
		}

	}

}
