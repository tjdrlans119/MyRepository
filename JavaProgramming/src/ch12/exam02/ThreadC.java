package ch12.exam02;

public class ThreadC extends Thread{
public ThreadC(int num){
	setName("threadC-"+num);
}
@Override
	public void run() {
	for (int i = 0; i < 200000000; i++) {
		String str = "a";
		str+="b";
		str +="c";
	}
	System.out.println(getName()+"종료");
	}
}
