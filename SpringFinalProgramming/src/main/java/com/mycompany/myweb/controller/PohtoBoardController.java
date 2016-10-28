package com.mycompany.myweb.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.myweb.dto.PhotoBoard;
import com.mycompany.myweb.service.PhotoBoardService;

@Controller
@RequestMapping("/photoboard")
public class PohtoBoardController {
	
	@Autowired
	private PhotoBoardService photoBoardService;
	//-------------------LIST------------------------------------------------
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
		
		   int rowsPerPage = 8;
		   int pagesPerGroup = 5;
		   
		   int totalBoardNo = photoBoardService.getCount();
		   
		   int totalPageNo = totalBoardNo/rowsPerPage + ((totalBoardNo%rowsPerPage!=0)?1:0);
		   int totalGroupNo = (totalPageNo/pagesPerGroup) + ((totalPageNo%pagesPerGroup!=0)?1:0);
		   
		   int groupNo = (intPageNo-1)/pagesPerGroup + 1;
		   int startPageNo = (groupNo-1)*pagesPerGroup + 1;
		   int endPageNo = startPageNo + pagesPerGroup - 1;
		   if(groupNo == totalGroupNo) { endPageNo = totalPageNo; }
		   
	      List<PhotoBoard>list = photoBoardService.list(intPageNo, rowsPerPage);
	      
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
	      
	      return "photoboard/list";
	}
	//-------------------WRITE------------------------------------------------
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String write() {
	   return "photoboard/write";
	}
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String write(PhotoBoard photoBoard, HttpSession session){
		try{
			String mid = (String) session.getAttribute("login");
			photoBoard.setBwriter(mid);
			
			//Originalfile, saveedfile(중복이름이나오면안된다), mimetype 셋팅.
			photoBoard.setOriginalfile(photoBoard.getPhoto().getOriginalFilename());
			//파일이름을 유일하게 하기위해 getTime을 통해 중복이안되게 한다.(getTime은long이 리턴됨으로 유일해짐)
			String savedfile = new Date().getTime() + photoBoard.getPhoto().getOriginalFilename();
			//저장할 파일에 절대 파일시스템 경로를 얻는다.
			String realpath = session.getServletContext().getRealPath("/WEB-INF/photo/"+savedfile);
			photoBoard.getPhoto().transferTo(new File(realpath));
			photoBoard.setSavedfile(savedfile);	
			
			//multipart타입의 photoBoard에서 getCOntentType:파일의 종류를 알아낸다.
			photoBoard.setMimetype(photoBoard.getPhoto().getContentType());
			
			int result = photoBoardService.write(photoBoard);
			
			return "redirect:/photoboard/list";
			
		}catch(Exception e){
			e.printStackTrace();
			return "photoboard/write";
		}
		
	}
	
	@RequestMapping("/showPhoto")
	public void showPhoto(String savedfile, HttpServletResponse response, HttpServletRequest request){
		try{
			String fileName = savedfile;
			/*
			 * 브라우저에서 보여주지 않고 강제로 다운로드 할 경우
			fileName = URLEncoder.encode(fileName, "UTF-8");
			response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
			 */
			
			//확장자를 getmimeType를 찾아서 리턴해주고, 해당 타입을 지정해준다.
			String mimeType=request.getServletContext().getMimeType(fileName);
			response.setContentType(mimeType);		
			
			OutputStream os = response.getOutputStream();
			String filePath = request.getServletContext().getRealPath("/WEB-INF/photo/"+fileName);
			InputStream is = new FileInputStream(filePath);
			byte[] values = new byte[1024];
			int byteNum = -1;
			while((byteNum = is.read(values)) != -1) {
				os.write(values, 0, byteNum);
			}
			os.flush();
			is.close();
			os.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}


	
	 @RequestMapping("/info")
	 public String info(int bno, Model model){
		   PhotoBoard photoBoard = photoBoardService.info(bno);
		   photoBoard.setBhitcount(photoBoard.getBhitcount()+1);
		   photoBoardService.modify(photoBoard);
		   model.addAttribute("photoboard",photoBoard);
		   return "photoboard/info";
	   }

	   @RequestMapping(value="/modify", method=RequestMethod.GET)
	   public String modifyForm(int bno, Model model){
		   PhotoBoard photoBoard = photoBoardService.info(bno);
		   model.addAttribute("photoboard",photoBoard);
		   return "photoboard/modify";
	   }
	   
	   @RequestMapping(value="/modify", method=RequestMethod.POST)
	   public String modify(PhotoBoard photoboard){
		   PhotoBoard dbPhotoBoard = photoBoardService.info(photoboard.getBno());
		   photoboard.setBhitcount(dbPhotoBoard.getBhitcount());
		   photoBoardService.modify(photoboard);
		   return "redirect:/photoboard/list";
	   }
	   
	
	   @RequestMapping("/remove")
	   public String remove(int bno){
		   photoBoardService.remove(bno);
		   return "redirect:/photoboard/list";
	   }
}
