package ch04.exma02;

public class WhileExample2 {

	public static void main(String[] args) throws Exception {
		int i=0;
		while(i<=10){
			System.out.println(i);
			Thread.sleep(1000);
			i++;
		}

	}

}
