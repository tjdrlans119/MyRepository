package ch11.exam01;

public class Board {

	private int bno;
	private String title;
	private String content;

	public Board(int bno, String title, String content) {
		super();
		this.bno = bno;
		this.title = title;
		this.content = content;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Board) { // 좌측의 객체가 우측의 클래스로부터 만들어진건가? 라는의미이다.
			Board target = (Board) obj; //강제타입변환
			if (bno == target.bno) {
				return true;
			}
		}
		return false;
	}
	
	
}