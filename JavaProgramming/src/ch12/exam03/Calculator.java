package ch12.exam03;

public class Calculator {

	// Field
	private int memory;

	// Constructor

	// Method

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) { // 메소드 전체를 락거는것
		this.memory = memory;
		try {
			Thread.sleep(2000);// 현재 이것을 실행하는 thread를 2초동안 일시정지 시켜라
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}

	/*
	 * public void setMemory1(int memory) { synchronized (this) { //메소드의 일 부분만
	 * 락을걸때 this.memory = memory; try { Thread.sleep(2000);// 현재 이것을 실행하는
	 * thread를 2초동안 일시정지 시켜라 } catch (InterruptedException e) { }
	 * System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	 * } }
	 */
}
