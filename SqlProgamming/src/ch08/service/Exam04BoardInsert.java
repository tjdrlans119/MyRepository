package ch08.service;

import java.util.Date;

import ch08.dao.BoardDao;
import ch08.dto.Board;

public class Exam04BoardInsert {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		
		Board board = new Board();
		board.setBno(100);
		board.setBtitle("제목입니다");
		board.setBcontent("내용입니다");
		board.setBwriter("작가 기문");
		board.setBhitcount(100);
		board.setBdate(new Date());
		
		dao.insert(board);
		
	}
}
