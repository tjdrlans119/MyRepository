package ch13.exam09;

public class WildCardExample {
public static void registerCourse1(Course<?> course){}
public static void registerCourse2(Course<? extends Student> course){}
public static void registerCourse3(Course<? super Worker> course){}
	
	public static void main(String[] args) {
		Course<Person> c1 = new Course<Person>("일반인과정",5);
		registerCourse1(c1);
//		registerCourse2(c1); (X) = Student를 상속한 하위객체만올수있다. person은안됨.
		registerCourse3(c1);
		
		Course<Worker> c2 = new Course<Worker>("직장인과정",5);
		registerCourse1(c2);
//		registerCourse2(c2); (X) = Student를 상속한 하위객체만올수있다. Worker은안됨.
		registerCourse3(c2);
		
		Course<Student> c3 = new Course<Student>("학생과정",5);
		registerCourse1(c3);
		registerCourse2(c3);
//		registerCourse3(c3); Worker의 부모에 Student 가 없다.
		
		Course<HighStudent> c4 = new Course<HighStudent>("고등학생과정",5);
		registerCourse1(c4);
		registerCourse2(c4);
//		registerCourse3(c4); Worker의 부모에 Student 가 없다.
		
		
		
		

	}
}
