package com.mycompany.kimoon.exam06;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam06")
public class Exam06Controller {
	private static final Logger logger = LoggerFactory.getLogger(Exam06Controller.class);

	@RequestMapping("/index")
	public String index() {
		logger.info("exam06 요청호출");
		return "exam06/index";
	}

	@RequestMapping("/method1")
	public String method1(HttpServletRequest request) {
		logger.info("method1 요청처리");
		// 클라이언트의 IP 얻기
		logger.info("WebCloient IP: " + request.getRemoteAddr());
		// 클라이언트의 브라우저 종류 얻기
		logger.info("WebClient 종류: " + request.getHeader("User-Agent"));
		if (request.getHeader("User-Agent").contains("Chrome")) {
			logger.info("브라우저 종류: 크롬");
		} else if (request.getHeader("User-Agent").contains("Trident/7.0")) {
			logger.info("브라우저 종류: 인터넷 익스플로러 11");
		}
		if (request.getHeader("User-Agent").contains("MSIE")) {
			logger.info("브라우저 종류: 인터넷 익스플로러 10 이하");
		}
		// 요청 파라미터 값 얻기
		logger.info(request.getParameter("mid"));
		logger.info(request.getParameter("mname"));

		// 쿼리문자열 얻기
		logger.info("쿼리: " + request.getQueryString());
		logger.info("요청 URI()" + request.getRequestURI());
		logger.info("요청 URL()" + request.getRequestURL());
		logger.info("요청방식: " + request.getMethod());
		logger.info("시스템 파일 경로: " + request.getRealPath("/WEB-INF/image/photo1.jpg"));
//		logger.info("시스템 파일 경로: " + request.getServletPath()("/WEB-INF/image/photo1.jpg"));
		return "exam06/method1";
	}

	@RequestMapping("/method2")
	public String method2(HttpServletResponse response) {
		logger.info("method1 요청처리");
		return "exam06/method1";
	}

}
