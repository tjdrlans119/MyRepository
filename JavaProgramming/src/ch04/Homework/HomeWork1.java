package ch04.Homework;

public class HomeWork1 {
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) { //for문 100번 실행
			int dice1 = (int) (Math.random() * 6) + 1; //주사위1( 1~6 랜덤숫자 발생 )
			int dice2 = (int) (Math.random() * 6) + 1; //주사위2( 1~6 랜덤숫자 발생 )

			int sum = dice1 + dice2; //주사위1,2의 합 저장

			if (sum == 10) { //주사위의 합이 10인지 묻는다.
				System.out.println("(" + dice1 + "," + dice2 + ")"); // 10일때 주사위 1,2 출력
			} // if문 종료
		} //for문 종료
	}
}
