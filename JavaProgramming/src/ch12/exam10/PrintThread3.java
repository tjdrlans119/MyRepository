package ch12.exam10;

public class PrintThread3 extends Thread {

	@Override
	public void run() {
		while (true) {
			System.out.println("실행중...");
			if (isInterrupted()) { // 외부에서 인터럽트가 되엇는지 검사한다.
//				                         인스턴스메소드
//				if(Thread.interrupted()) //이건 정적메소드 위 방법과 같다.
				break;
			}
		}
		System.out.println("자원장리");
		System.out.println("실행종료");
	}
}