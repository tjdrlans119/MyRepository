package ch06.exam11;

public class StaticMember2 {

	//Static Field
	static String field;
	String field2;
	
	//Static Block
	static{
		System.out.println("static block 실행");
		field = "Java";
		//field2= "Java" 객체가 없기떄문에 안된다.
		}
	
	//Static Method
	static void method(){
		field="Java";
		//field2="Java";
	}
	void method2(){
		field="Java";
		field2="Java";
	}
	
	public static void main(String[] args){  //실행class
		field="Java";
		//field2="java"  객체가 잇어야 사용할수 있다.
		
		method();
		//method2();
		
		StaticMember2 sm = new StaticMember2();
		sm.field2="자바";
		sm.method2();
		
	}
}