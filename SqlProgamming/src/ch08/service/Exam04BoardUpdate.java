package ch08.service;

import java.util.Date;

import ch08.dao.BoardDao;
import ch08.dto.Board;

public class Exam04BoardUpdate {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		
		Board board = new Board();
		board.setBtitle("제목(Update)");
		board.setBwriter("user2");

		dao.update(board);
		
	}
}
