package ch15.exam03;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		//Map 계열 컬렉션 생성
		Map<String, Integer> map = new Hashtable<String, Integer>();

		//엔트리(Entry) 추가
		map.put("홍길동", 85); //85는 자동으로 Integer 객체로 자동박싱된다.
		map.put("추가을", 90); 
		map.put("홍길동", 95); //홍길동 Key 가 같기때문에 95로 값이 덮어씌어진다.
		map.put("김자바", 100);
		System.out.println(map.size());
		
		//객체(값) 얻기
		int score = map.get("홍길동");
		System.out.println(score);
		
		
		//모든 엔트리 일괄처리
		Set<Entry<String, Integer>> set =map.entrySet();
		for (Entry<String, Integer> entry : set) {
			System.out.println();
			String key = entry.getKey();
			System.out.print(key);
			Integer value = entry.getValue();
			System.out.println(value);
		}
		
		//KeySet을 이용한 처리
		System.out.println("-----------------");
		Set<String>set2 = map.keySet();
		for (String key : set2) {
			int value = map.get(key);
			System.out.println(key+":"+value);
		}
		
		//객체삭제
		map.remove("홍길동");
		System.out.println("-----------------");
		Set<String>set3 = map.keySet();
		for (String key : set3) {
			int value = map.get(key);
			System.out.println(key+":"+value);
		}
		
		
		
		
		
	}
}
