package ch12.exam06;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();//SUmThread만들기
		sumThread.start(); //시작대기상태
		
		System.out.println("1~100 합: "+sumThread.getSum());
		//실행이 끝나고 출력되면 5050이나오고
		//실행이 실행중이라면 0이나온다.
		
		try {sumThread.join();} catch (InterruptedException e) {}
		System.out.println("1~100 합: "+sumThread.getSum());
		
		
	}
}
