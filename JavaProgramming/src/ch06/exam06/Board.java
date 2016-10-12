package ch06.exam06;

public class Board {

	
	//Field필드
	int no,hitCount;
	String title,content,witer;
	
	//Constructor생성자
	//Constructor Overloading;
	//1.매개변수의 수가 달라야 한다.
	//2.매개변수의 타입이 달라야 한다.
	Board(){}
	Board(int no){}
	Board(String Title){}//타입이 다르기때문에 만들어진다.
	Board(int no, String title){}	
	Board(String title, int no ){} //이건 매개변수의 수가 다르기 때문에 만들어진다.
	Board(int no, int hitCount){} //이건 타입이 다르기때문에 만들어진다.	
	Board(int no, String title, String content){}
	Board(int no, String title, String content, String witer){}
	Board(int no, String title, String content, String witer,int hitCount){}
	
	//Method메소드
	
}
