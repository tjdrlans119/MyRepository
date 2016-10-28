package com.mycompany.myweb.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.myweb.dto.FreeBoard;
import com.mycompany.myweb.service.FreeBoardService;

@Controller
@RequestMapping("/freeboard")
public class FreeBoardController {

	@Autowired
	private FreeBoardService freeBoardService;
	
	@RequestMapping("/list")
	public String list(String pageNo, Model model, HttpSession session){// String 페이지넘버가 3이들어오게되면  &&null일경우
		int intPageNo = 1; //모든조건에 안맞으면 pageNo은 1이다.
		if(pageNo==null){//3이 라 만족안됨.                       &&페이지넘버가 아무것도안오면
			pageNo=(String)session.getAttribute("pageNo");  // &&세션에 pageno으로 등록되어잇으면 가져와라
			if(pageNo!=null){//&&페이지넘버가 잇다면
				intPageNo=Integer.parseInt(pageNo); //&&intPageNo에 넣어라.			
				}
		}else{//이조건에 만족
			intPageNo=Integer.parseInt(pageNo);//3을 숫자로 바꿔서 저장
		}
		session.setAttribute("pageNo",String.valueOf(intPageNo));//그리고 세션에다가 pageNo이라는 이름으로 저장한다.
		
		
		
		   int rowsPerPage = 10;
		   int pagesPerGroup = 5;
		   
		   int totalBoardNo = freeBoardService.getCount();
		   
		   int totalPageNo = totalBoardNo/rowsPerPage + ((totalBoardNo%rowsPerPage!=0)?1:0);
		   int totalGroupNo = (totalPageNo/pagesPerGroup) + ((totalPageNo%pagesPerGroup!=0)?1:0);
		   
		   int groupNo = (intPageNo-1)/pagesPerGroup + 1;
		   int startPageNo = (groupNo-1)*pagesPerGroup + 1;
		   int endPageNo = startPageNo + pagesPerGroup - 1;
		   if(groupNo == totalGroupNo) { endPageNo = totalPageNo; }
		   
	      List<FreeBoard>list = freeBoardService.list(intPageNo, rowsPerPage);
	      
	      model.addAttribute("pageNo",  intPageNo);
	      model.addAttribute("rowsPerPage",  rowsPerPage);
	      model.addAttribute("pagesPerGroup",  pagesPerGroup);
	      model.addAttribute("totalBoardNo",  totalBoardNo);
	      model.addAttribute("totalPageNo",  totalPageNo);
	      model.addAttribute("totalGroupNo",  totalGroupNo);
	      model.addAttribute("groupNo",  groupNo);
	      model.addAttribute("startPageNo",  startPageNo);
	      model.addAttribute("endPageNo",  endPageNo);
	      model.addAttribute("list",list);
	      return "freeboard/list";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String write(FreeBoard freeBoard, HttpSession session){
		String mid = (String) session.getAttribute("login");
		freeBoard.setBwriter(mid);
		int result = freeBoardService.write(freeBoard);
		if(result == FreeBoardService.WRITE_FAIL){
			return "freeboard/write";
		}else{
			return "redirect:/freeboard/list";			
		}
		
	}
	
	@RequestMapping(value="/write", method=RequestMethod.GET)
	   public String write() {
		   return "freeboard/write";
	   }
	   
	   @RequestMapping("/info")
	   public String info(int bno, Model model){
		   FreeBoard freeBoard = freeBoardService.info(bno);
		   freeBoard.setBhitcount(freeBoard.getBhitcount()+1);
		   freeBoardService.modify(freeBoard);
		   model.addAttribute("freeboard",freeBoard);
		   return "freeboard/info";
	   }
	
	   @RequestMapping(value="/modify", method=RequestMethod.GET)
	   public String modifyForm(int bno, Model model){
		   FreeBoard freeBoard = freeBoardService.info(bno);
		   model.addAttribute("freeboard",freeBoard);		   
		   return "freeboard/modify";
	   }
	   
	   @RequestMapping(value="/modify", method=RequestMethod.POST)
	   public String modify(FreeBoard freeBoard){
		   FreeBoard dbFreeBoard = freeBoardService.info(freeBoard.getBno());
		   freeBoard.setBhitcount(dbFreeBoard.getBhitcount());
		   freeBoardService.modify(freeBoard);
		   return "redirect:/freeboard/list";
	   }
	   
	  
	   @RequestMapping("/remove")
	   public String remove(int bno){
		   freeBoardService.remove(bno);
		   return "redirect:/freeboard/list";
	   }
   
}





















