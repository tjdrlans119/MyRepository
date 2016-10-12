package ch11.exam09;

public class NewInstanceExample {
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("ch11.exam09." + args[0]);
		clazz.newInstance();
		Object obj = clazz.newInstance();
		Action action = (Action) obj; //args객체를 참조한다. args로 clazz만들엇다. 
		action.execute();
	}
}
