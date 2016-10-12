package com.mycompany.kimoon.exam02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {
	private static final Logger logger = LoggerFactory.getLogger(Exam02Controller.class);

	@RequestMapping("/index")
	public String index() {
		logger.info("index() 요청 호출");
		return "exam02/index";
	}

	/*
	 * @RequestMapping("/join") public String join(String mid, String mname,
	 * String mage){ logger.info("Join() 요청처리"); logger.info("mid: "+mid);
	 * logger.info("manme: "+mname); logger.info("mage: "+mage); return
	 * "exam02/index"; }
	 */
	@RequestMapping("/join")
	public String join(Member member) {
		logger.info("Join() 요청처리");
		logger.info("mid: " + member.getMid());
		logger.info("manme: " + member.getMname());
		logger.info("mage: " + member.getMage());
		return "exam02/index";
	}

	@RequestMapping("/login")
	public String join(@RequestParam("id") String mid, @RequestParam("password") String mpassword) {
		logger.info("login() 요청처리");
		logger.info("id: " + mid);
		logger.info("password: " + mpassword);
		return "exam02/index";
	}

	@RequestMapping("/order")
	public String order(String pid, String pname, String pprice, String pcompany) {
		logger.info("oder() 요청처리");
		logger.info("pid:" + pid);
		logger.info("pname:" + pname);
		logger.info("pprice:" + pprice);
		logger.info("pcompnay:" + pcompany);
		return "exam02/index";
	}

	@RequestMapping("/write")
	public String write(@RequestParam(defaultValue = "1") int bno, String title, String content,
			@RequestParam(defaultValue = "0") int hitcount) {
		logger.info("write 요청처리");
		logger.info("bno: " + bno);
		logger.info("title: " + title);
		logger.info("content: " + content);
		logger.info("hitcount: " + hitcount);
		return "exam02/index";
	}

	@RequestMapping("/update")
	public String update(@RequestParam(defaultValue = "1") int bno, String title, String content,
			// @RequestParam(value="count", defaultValue="0")
			@RequestParam(value = "count") int hitcount) {
		logger.info("update 요청처리");
		logger.info("bno: " + bno);
		logger.info("title: " + title);
		logger.info("content: " + content);
		logger.info("hitcount: " + hitcount);
		return "exam02/index";
	}

	@RequestMapping("/send")
	public String send(Board board) {
		logger.info("send 요청처리");
		logger.info("bno: " + board.getBno());
		logger.info("title: " + board.getTitle());
		logger.info("content: " + board.getContent());
		logger.info("hitcount: " + board.getHitcount());
		return "exam02/index";
	}
}
