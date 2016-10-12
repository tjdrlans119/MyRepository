package ch11.exam06;

public class SystemTimeExample {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		int sum = 0;
		for (int i = 0; i < 1000000000; i++) {
			sum += i;
		}
		
		
		long end = System.currentTimeMillis();
		
		System.out.println((end-start)+"나노초 소요");
	}
}
