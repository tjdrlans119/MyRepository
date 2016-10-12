package ch15.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		//List 계열의 컬렉션 생성
		//List <String>list = new Vector<>();
		//List <String>list = new LinkedList<>();
				
		List <String>list = new ArrayList<>();
		//	String 타입에 ArrayList객체를 만들어준다(list인터페이스로 구현한)
		
		
		//객체저장
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Datbase");
		list.add("iBatis");
		list.add(null);
		
		//저장된 객체수 얻기
		int size = list.size();
		System.out.println("총 객체수: " + size);
		System.out.println();
		
		//객체 찾기
		String skill = list.get(2);
		System.out.println("2:"+skill);
		
		//전체 객체를 일괄 처리
		for (int i = 0; i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i+""+str);			
		}
		System.out.println();
		
		for (String str : list) {
			System.out.println(str);
		}System.out.println();
		
		//객체삭제
		list.remove(2);
		list.remove(2);
		list.remove(new String("iBatis"));  //Equals 메소드를 이용해서 비교한다 
		System.out.println(list.size());
		
	}

}
