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
			System.out.println("1�� �ݶ�");
			break;
		case 2:
			System.out.println("2�� ���̴�");
			break;
		case 3:
			System.out.println("3�� ȯŸ");
			break;
		case 4:
			System.out.println("4�� �Ƹ޸�ī��");
			break;
		case 5:
			System.out.println("5�� ī����");
			break;
		default:
			System.out.println("6�� ������Ű");
		}

	}

}
