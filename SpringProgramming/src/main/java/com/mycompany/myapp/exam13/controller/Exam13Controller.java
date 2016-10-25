package com.mycompany.myapp.exam13.controller;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.myapp.exam13.dto.Member;
import com.mycompany.myapp.exam13.service.Exam13MemberService;


@Controller
@RequestMapping("/exam13")
public class Exam13Controller {
	private static final Logger logger = LoggerFactory.getLogger(Exam13Controller.class);
	
	@Autowired
	private Exam13MemberService exam13MemberService;
	
	@RequestMapping("/index")
	public String index() {
		logger.info("index처리");
		return("exam13/index");
	}
	
	@RequestMapping(value="/memberjoin", method=RequestMethod.GET)
	public String memberjoinForm(){
		logger.info("joinForm처리");
		return "exam13/memberJoinForm";
	}
	
	@RequestMapping(value="/memberjoin", method=RequestMethod.POST)
	public String memberjoin(Member member){
		logger.info("join처리");
		exam13MemberService.join(member);
		return "redirect:/exam13/index";
	}
	
	@RequestMapping("/memberInfo")
	public String memberInfo(String mid, Model model){
		logger.info("Info처리");
		Member member = exam13MemberService.info(mid);
		model.addAttribute("member",member);
		return "exam13/memberInfo";
	}
	
	
	
	
	
	
	
	
}
