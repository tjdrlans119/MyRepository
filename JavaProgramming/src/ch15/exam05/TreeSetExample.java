package ch15.exam05;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();

		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);

		//점수찾기
		System.out.println("가장낮은점수: " + scores.first());
		System.out.println("가장높은점수: " + scores.last());
		System.out.println();
		System.out.println("95아래 근접한 점수: "+ scores.lower(95));
		System.out.println("95이상 근접한 점수: "+ scores.higher(95));
		System.out.println();
		System.out.println("95와 같거나 하위 점수: " + scores.floor(95));
		System.out.println("95와 같거나 상위 점수: "+ scores.ceiling(95));
		System.out.println();
		
		//정렬
		System.out.println(scores.toString());

		NavigableSet<Integer> desendingSet = scores.descendingSet();
		for (Integer score : desendingSet) {
			System.out.print(score+",");
		}
		
		System.out.println();
		NavigableSet<Integer>acendingSet = desendingSet.descendingSet();
		for (Integer score : acendingSet) {
			System.out.print(score+",");
		}System.out.println();
		
		System.out.println("---------------------------------------------------------------");
		//범위검색
		TreeSet<String>words = new TreeSet<>();
		words.add("20");
		words.add("100");
		words.add("apple");
		words.add("apply");
		words.add("forever");
		words.add("description");
		words.add("ever");
		words.add("zoo");
		words.add("base");
		words.add("guess");
		words.add("cherry");
		System.out.println("내림차순검색  : ");
		System.out.println(words.toString());
		NavigableSet<String> ns = words.descendingSet().descendingSet();
		System.out.println("내림차순검색  : ");
		for (String word : ns) {
			System.out.print(word+",");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------");
		
		//C를 포함한 것부터 F가 포함되기 전까지 검색 - C, D, E, 로 시작되는 단어검색.
		System.out.println(words.subSet("c", true, "f", false));
		
		
		
		
		
}
}
