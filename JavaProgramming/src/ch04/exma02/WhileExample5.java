package ch04.exma02;


public class WhileExample5 {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;

		while (run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("---------------------------");
				System.out.println("1.증속 || 2.감속 || 3.멈춤");
				System.out.println("---------------------------");
				System.out.print("선택:");
			}

			keyCode = System.in.read();
			if (keyCode == 49) {
				speed+=10;
				System.out.println("증속합니다" );
				System.out.println("속도 = "+ speed);
				System.out.println("");
				continue;
			} else if (keyCode == 50) {
				speed-=10;
				System.out.println("감속합니다");
				System.out.println( "속도 = "+ speed);
				System.out.println("");
				continue;
			} else if (keyCode == 51) {
				speed = 0;
				System.out.println("멈춥니다");
				System.out.println("속도 = "+ speed);
				run = false;
//				break;

			}

		}
	}
}

