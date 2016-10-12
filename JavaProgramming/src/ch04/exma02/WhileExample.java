package ch04.exma02;

public class WhileExample {

	public static void main(String[] args) throws Exception {
		int count=0;
		while(true){
			
			count +=1;
			System.out.println(count);
			Thread.sleep(1000);
			if(count==100){
				
			}
		}

	}

}
