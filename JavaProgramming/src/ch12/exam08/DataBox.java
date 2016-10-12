package ch12.exam08;

public class DataBox {
	private String data;

	public synchronized String getData() {
		if (this.data == null) {
			try {	wait();	} catch (InterruptedException e) {	}
			}
		String returnValue = data;
		System.out.println("consumer이 읽은데이터: " + returnValue);
		this.data = null;
		notify();
		return returnValue;
	}

	public synchronized void setData(String data) {
		if (this.data != null) {
			try {	wait();	} catch (InterruptedException e) {	}
		}
		this.data = data;
		System.out.println("producerThread가 생성한 데이터: " + data);
		notify();
	}
}