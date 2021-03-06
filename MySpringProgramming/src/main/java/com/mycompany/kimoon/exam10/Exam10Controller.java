package com.mycompany.kimoon.exam10;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam10")
public class Exam10Controller {
	private static final Logger logger = LoggerFactory.getLogger(Exam10Controller.class);
	
	private G g;
	@Autowired
	public void setG(G g) {
		logger.info("setG() ?€?"); 
		this.g = g;
	}
	
	private H h;
	@Autowired
	public void setH(H h) {
		logger.info("setH() ?€?"); 
		this.h = h;
	}
	
	private Service service;
	//@Autowired --> Type?Όλ‘? μ£Όμ
	//@Resource --> ?±λ‘μ΄λ¦μΌλ‘? μ£Όμ
	@Resource(name="serviceImpl2")
	public void setService(Service service) {
		logger.info("setService() ?€?");
		this.service = service;
	}
	
	private I i;
	@Autowired
	public void setI(I i) {
		logger.info("setI() ?€?");
		this.i = i;
	}
	
	private J j;
	@Autowired
	public void setJ(J j) {
		logger.info("setJ() ?€?");
		this.j = j;
	}	
	
	@Autowired
	private K k;
	
	@RequestMapping("/index")
	public String index() {
		logger.info("index μ²λ¦¬");
		return "exam10/index";
	}
	
	@RequestMapping("/method1")
	public String method1() {
		logger.info("method1 μ²λ¦¬");
		g.method();
		h.method();
		service.method();
		return "redirect:/exam10/index";
	}
	
	@RequestMapping("/method2")
	public String method2() {
		logger.info("method2 μ²λ¦¬");
		i.method();
		j.method();
		return "redirect:/exam10/index";
	}
	
	@RequestMapping("/method3")
	public String method3() {
		logger.info("method3 μ²λ¦¬");
		k.method();
		return "redirect:/exam10/index";
	}
}
