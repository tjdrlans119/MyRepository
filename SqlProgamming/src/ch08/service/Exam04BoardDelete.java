package ch08.service;

import ch08.dao.BoardDao;

public class Exam04BoardDelete {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		dao.deleteByWriter("문");
		
	}
}
