package com.mycompany.myweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycompany.myweb.dto.FreeBoard;
import com.mycompany.myweb.service.FreeBoardService;

@Controller
@RequestMapping("/freeboard")
public class FreeBoardController {

	@Autowired
	private FreeBoardService freeBoardService;
	
	@RequestMapping("/list")
	public String list(@RequestParam(defaultValue="1")int pageNo, Model model){
		int rowsPerPage =10;
		int pagesPerGroup=5;
		int totalBoardNo= freeBoardService.getCount();
		
		int totalPageNo=totalBoardNo/rowsPerPage+((totalBoardNo%rowsPerPage!=0)?1:0);
		int totalGroupNo=totalBoardNo/pagesPerGroup+((totalBoardNo%rowsPerPage!=0)?1:0);
		
		int groupNo = (pageNo-1)/pagesPerGroup+1;
		
		int startPageNo = (groupNo-1)*pagesPerGroup+1;
		int endPageNo = groupNo+pagesPerGroup;
		if(groupNo==totalGroupNo){endPageNo=totalPageNo;}

		List<FreeBoard>list = freeBoardService.list(pageNo,rowsPerPage);

		model.addAttribute("rowsPerPage",rowsPerPage);
		model.addAttribute("pagesPerGroup",pagesPerGroup);
		model.addAttribute("totalBoardNo",totalBoardNo);
		model.addAttribute("totalGroupNo",totalGroupNo);
		model.addAttribute("groupNo",groupNo);
		model.addAttribute("startPageNo",startPageNo);
		model.addAttribute("endPageNo",endPageNo);
		
		model.addAttribute("list",list);
		return "freeboard/list";
	}
	
}





















