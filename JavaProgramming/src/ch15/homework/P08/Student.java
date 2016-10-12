package ch15.homework.P08;

public class Student {
	public int studentNum;
	public String name;

	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	//동등객체를 확인하기 위해서 hashCode와 Equals를 재정의한다.
	
	@Override
	public int hashCode() {
		return studentNum;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student){
			Student student = (Student) obj;
			return student.studentNum==studentNum;
		}else{
			return false;
		}
	}
}
