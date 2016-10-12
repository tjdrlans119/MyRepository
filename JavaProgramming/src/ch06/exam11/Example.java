package ch06.exam11;

public class Example {

	public static void main(String[] args) {
		
		// Instace Member 사용
		InstanceMember im = new InstanceMember();
		im.field="자바";
		im.method();
		
		// StaticMember 사용
		StaticMember sm= new StaticMember();
		StaticMember.field="자바";
		StaticMember.method();
		
		}

}
