package ch04.exma02;


public class WhileExample6 {
	public static void main(String[] args) throws Exception {
		int acoount = 0;
		int keyCode = 0;

		while (true) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("---------------------------");
				System.out.println("1.예금 || 2.출금 || 3.종료");
				System.out.println("---------------------------");
				System.out.print("선택:");
			}

			keyCode = System.in.read();
			if (keyCode == 49) {
				acoount+=1000;
				System.out.println("1000원 예금합니다" );
				System.out.println("잔액 = "+ acoount);
				System.out.println("");
				continue;
			} else if (keyCode == 50) {
				acoount -=1000;
				System.out.println("1000원 출금");
				System.out.println( "잔액 = "+ acoount);
				System.out.println("");
				continue;
			} else if (keyCode == 51) {
				System.out.print("프");
				Thread.sleep(500);
				System.out.print("로");
				Thread.sleep(500);
				System.out.print("그");
				Thread.sleep(500);
				System.out.print("램");
				Thread.sleep(500);
				System.out.print("종");
				Thread.sleep(500);
				System.out.print("료");
				Thread.sleep(500);
				break;
				
//				run = false;
//				break;

			}

		}
	}
}

