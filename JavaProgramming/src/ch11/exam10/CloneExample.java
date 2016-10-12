package ch11.exam10;

import java.util.Arrays;

public class CloneExample{

	public static void main(String[] args) throws CloneNotSupportedException {
		int[] arr1 = { 1, 2, 3 };

		int[] arr2 = arr1.clone();

		System.out.println(arr1 == arr2);
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr2));
		System.out.println("----------------------------------------");
		
		Member m1 = new Member("hong","길동");		
		System.out.println(m1);
		
//		Member m2 = m1.clone();  //클론은 오브젝트를 리턴하는데 멤버로 받앗기 때문에 안된다
		Member m2 = (Member)m1.clone();
		System.out.println(m1==m2);
		System.out.println(m2);
	}
}

class Member implements Cloneable { //clone이라는 인터페이스를사용하라는 개발자의 지시를 jvm에게 알려주기 위해서이다.
	String mid;
	String mname;
	int age;
	String[] hobbys;

	Member(String mid, String mname) {
		this.mid = mid;
		this.mname = mname;
	}

	@Override
	public String toString() {
		return mid + mname;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
} 