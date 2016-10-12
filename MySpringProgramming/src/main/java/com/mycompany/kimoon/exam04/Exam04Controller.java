package com.mycompany.kimoon.exam04;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam04")
public class Exam04Controller {
private static final Logger logger = LoggerFactory.getLogger(Exam04Controller.class);
	@RequestMapping("/index")
	public String index(){
		logger.info("index 요청 호출");
		return "exam04/index";
	}
	
	
	
}
