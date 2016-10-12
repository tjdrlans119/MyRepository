package ch11.homework.p03;

import java.util.Objects;

public class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {//매개값으로 obj가 학생객체인지 검사
				Student target = (Student) obj;//타입변환을 한다.
				if (studentNum.equals(target.studentNum)) {
					return true;
				}
			}
			return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentNum);//학번을 받아서 해쉬코드 리턴
	}
}
