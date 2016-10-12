package ch11.exam10;

public class equalsExample {
	public static void main(String[] args) {
		String strVar1 = "moon";  //코드상에서 값을 말할때 리터럴 이라고 한다. /literal은 moon이다.
		String strVar2 = "moon";
		System.out.println(strVar1 == strVar2); // 참조변수가 같은지
		System.out.println(strVar1.equals(strVar2)); // 문자열이 같은지
		
		
		
	}
}
