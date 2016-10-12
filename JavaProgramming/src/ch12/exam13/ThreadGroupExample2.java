package ch12.exam13;

public class ThreadGroupExample2 {
	public static void main(String[] args) {
		
		Thread thread;
		
		thread = new Thread("t1"){//보모생성자에 스트링 메개값 하나를 호출한다
			@Override
			public void run() {
			while(true){
				System.out.println(getName()+"run...");
				if(isInterrupted())break;
			}
				System.out.println(getName() + ":end...");
			}
		};
		thread.start();
		
		thread = new Thread("t2"){//보모생성자에 스트링 메개값 하나를 호출한다
			@Override
			public void run() {
			while(true){
				System.out.println(getName()+"run...");
				if(isInterrupted())break;
			}
				System.out.println(getName() + ":end...");
			}
		};
		thread.start();
		
		ThreadGroup sub = new ThreadGroup("sub"); //sub 스레드 그룹을만듬
		
		thread = new Thread(sub, "t3"){//보모생성자에 스트링 메개값 하나를 호출한다
			@Override
			public void run() {
			while(true){
				System.out.println(getName()+"run...");
				if(isInterrupted())break;
			}
				System.out.println(getName() + ":end...");
			}
		};
		thread.start();
		
		thread = new Thread(sub, "t4"){//보모생성자에 스트링 메개값 하나를 호출한다
			@Override
			public void run() {
			while(true){
				System.out.println(getName()+"run...");
				if(isInterrupted())break;
			}
				System.out.println(getName() + ":end...");
			}
		};
		thread.start();
		
		try {	Thread.sleep(3000);	} catch (InterruptedException e) {	}
				
		Thread.currentThread().getThreadGroup().interrupt();
				
	}
}
