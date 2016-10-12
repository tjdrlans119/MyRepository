package ch06.exam07;

public class Board {

	// Field필드
	int no, hitCount;
	String title, content, witer;

	// Constructor생성자
	// Constructor Overloading;
	//생성자 중복코드 수정
	Board() {
	}

	Board(int no) {
		this(no, null, null, null, 0);
	}

	Board(int no, String title) {
		this(no, title, null, null, 0);
	}

	Board(String title, int no) {
		this(no, null, null, null, 0);
	}

	Board(int no, String title, String content) {
		this(no, title, content, null, 0);
	}

	Board(int no, String title, String content, String witer) {
		this(no, title, content, witer, 0);
	}

	Board(int no, String title, String content, String witer, int hitCount) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.witer = witer;
		this.hitCount = 0;
	}

	// Method메소드

}
