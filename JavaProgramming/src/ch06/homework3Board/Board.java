package ch06.homework3Board;

public class Board {
	//Field
	String no,title,content,name;
	int count;
	
	//Constructor
	Board(int count){
		this.count=count;
	}
	Board(String no, String title, String name, String content){
		this.no=no;
		this.title=title;
		this.name=name;
		this.content=content;
	}
}	
