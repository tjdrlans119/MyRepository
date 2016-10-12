package ch06.exam14;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("920619-1111111","kimoonss");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "usa";
//		p1.ssn="000000-0000000";
		p1.name="KIMOONSS";
		System.out.println(p1.name);	
	}

}
