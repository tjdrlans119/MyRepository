package ch15.exam02;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {

		// Set 계열 컬렉션 생성
		Set<String> set = new LinkedHashSet<String>();

		// 객체 저장
		set.add("Servet/JSP");
		set.add("Java");
		set.add("JDBC");
		set.add("Java");
		set.add("iBATIS");
		System.out.println(set.size());

		// 객체를 일괄 처리하기
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			if (str.equals("JDBC")) {
				iterator.remove(); //지울때는 꼭 iterator.remove를 사용해서 지워야한다.
			}
			System.out.println(str);
		}
		System.out.println();
		
		// 향상된for문사용
		for (String str : set) {
			System.out.println(str);
		}

	}
}
