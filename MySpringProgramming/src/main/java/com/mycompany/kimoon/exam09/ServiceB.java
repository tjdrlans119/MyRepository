package com.mycompany.kimoon.exam09;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mycompany.kimoon.exam04.Exam04Controller;

public class ServiceB {
	private static final Logger logger = LoggerFactory.getLogger(Exam04Controller.class);
public ServiceB(){
	logger.info("ServiceB객체 생성");
}
public void method(){
	logger.info("method실행");
}
}
