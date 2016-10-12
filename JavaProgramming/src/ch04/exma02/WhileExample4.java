package ch04.exma02;

public class WhileExample4 {

	public static void main(String[] args) throws Exception {
		System.out.println("프로그램 시작");
		
		int num = 0;
		
		while(num !=113){
			num=System.in.read();
			if(num != 10 && num !=13){
				System.out.println(num);
			}
		}
		
		System.out.println("프로그램종료");
	}
}