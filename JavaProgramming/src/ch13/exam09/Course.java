package ch13.exam09;

public class Course<T> {
	private String name;
	private T[] students;

	public Course(String name, int capacity) {
		this.name = name;
		this.students = (T[]) new Object[capacity];
		// 타입이 결정안된 그런 타입으로 생성된 파라메타를 오브젝트로만들어놓고 타입변환한다.
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}

	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {  //배열에 null이 들어잇는곳을 찾아서 넣는다.
				students[i] = t;
				break;
			}
			
		}
	}

}
