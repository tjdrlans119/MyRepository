package com.mycompany.kimoon.exam07;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.kimoon.exam02.Board;

	@Controller
	@RequestMapping("/exam07")
	public class Exam07Controller {
		@RequestMapping("/index")
		public String index(){
			return "exam07/index";
		}
		
		@RequestMapping("/method1")
		public String method1(HttpServletRequest request){
			request.setAttribute("data1", "value1");
			request.setAttribute("data2", "value2");
			return "exam07/usedata";
		}
		
		@RequestMapping("/method2")
		public String method2(HttpSession session){
			session.setAttribute("data1", "value1");
			session.setAttribute("data2", "value2");
			return "exam07/usedata";
		}

		@RequestMapping("/method3")
		public String method3(Model model){
			model.addAttribute("dara1","value1");
			model.addAttribute("dara2","value2");
			return "exam07/usedata";
		}
		
	
		

	}
