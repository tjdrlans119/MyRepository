package com.mycompany.kimoon.exam11.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.kimoon.exam11.dao.Exam11BoardDao;
import com.mycompany.kimoon.exam11.dto.Board;



@Component
public class Exam11BoardService {
	private static final Logger logger = LoggerFactory.getLogger(Exam11BoardService.class);
	
	@Autowired
	private Exam11BoardDao boardDao;
	
	public void write(Board board){
		logger.info("write 처 리");
		boardDao.insert(board);
	}	
	public List<Board>getList(){
		logger.info("getList 처리");
		List<Board>list= boardDao.selectList();
		return list;
	}
}
