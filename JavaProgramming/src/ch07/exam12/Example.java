package ch07.exam12;

public class Example {

	public static void main(String[] args) {
		Theater cgv = new Theater();
		
		Adult a = new Adult();
		a.ssn="920619-1111111";
		Student s = new Student();
		s.sno="2011211737";
		
		
		
		cgv.check(a);
		cgv.check(s);
		
		

	}

}
