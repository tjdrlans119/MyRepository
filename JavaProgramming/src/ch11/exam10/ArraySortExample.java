package ch11.exam10;

import java.util.Arrays;
public class ArraySortExample {
	public static void main(String[] args) {
		// 기본타입을 정렬할때
		int[] scores = { 99, 97, 98 };
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));

		// 맴버객체가왓을때,
		Member2[] members = { new Member2("홍길동", 99), new Member2("박동수", 97), new Member2("김민수", 80) };

		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
	}
}
class Member2 implements Comparable {// 비교하기 위해서는 comparable을 implemnets해야함
	String name;
	int score;

	Member2(String name, int score) {
		this.name = name;
		this.score = score;	}

	@Override // 이거 엄청
				// 중요함!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public int compareTo(Object o) { // 음수면 앞으로 리턴, 영이면 똑같은것, 양수가오면 뒤에로 리턴
		System.out.println("How many CompareTo...");
		Member2 target = (Member2) o;
		// return -name.compareTo(target.name);
		return score - target.score; // 음수면 앞으로 리턴, 영이면 똑같은것, 양수가오면 뒤에로 리턴
	}
	@Override
	public String toString() {
		return name;	}
}