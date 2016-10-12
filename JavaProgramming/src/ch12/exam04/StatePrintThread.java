package ch12.exam04;

public class StatePrintThread extends Thread {	
	private Thread targetThread;

	public StatePrintThread(Thread targetThread) { //생성자 매개값을 스레드객체로받고
		this.targetThread = targetThread; //받은걸 필드로 초기화함
	}

	public void run() { 
		while(true) {
			Thread.State state = targetThread.getState();
			//Thread클래스 안에 선언된 State클래스
			//를 state로 선언하고 그안에는
			//targetThread 의 상태를 저장한다.
			System.out.println("타겟 스레드 상태: " + state);
			if(state == Thread.State.NEW) {// 저장된 상태가 new라면 
				targetThread.start(); //해당 스레드 실행
			}
			if(state == Thread.State.TERMINATED) {//저장된 상태가 terminated라면
				break;//종료
			}
			try {
				//0.5초간 일시 정지
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}
}