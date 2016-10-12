package ch06.exam04;

public class Person {

	// 필드Field
	String name;
	String sex;
	int age;
	double height;
	boolean married;

	// 생성자Constructor
	Person(String name, String sex, int age, double  height, boolean married) {
		this.name=name;
		this.sex=sex;
		this.age = age;
		this.height=height;
		this.married=married;
		
		System.out.println(name+"\t"+sex+"\t"+age+"\t"+height+"\t"+married);
		
	}

	// 메소드Method

}
