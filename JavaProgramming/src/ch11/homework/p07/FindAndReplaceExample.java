package ch11.homework.p07;

public class FindAndReplaceExample {
public static void main(String[] args) {
	String str = "모든 프로그램은 자바 언어로 개발될 수 있다.";
	int index = str.indexOf("자바");
	//str문자열에서 자바가 포함되어있다면 해당위치의 인덱스번호 리턴
	//없다면 -1이 리턴된다
	if(index==-1){
		System.out.println("자바 문자열이 없습니다");
	}else{
		System.out.println("자바 문자열이 있습니다.");
		str=str.replace("자바", "Java");
		System.out.println("-->"+str);
	}
}
}
