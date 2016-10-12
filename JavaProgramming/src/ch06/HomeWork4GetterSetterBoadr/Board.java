package ch06.HomeWork4GetterSetterBoadr;

public class Board {
	//Field
	private String no,title,content,name;
	private int count;
	
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	Board(String no, String title, String name, String content){
		this.no=no;
		this.title=title;
		this.name=name;
		this.content=content;
	}
}	
