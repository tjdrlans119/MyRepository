package com.mycompany.kimoon.exam09;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class A {
	private static final Logger logger = LoggerFactory.getLogger(Exam09Controller.class);
public A(){
	logger.info("A객체 생성");
}
public void method(){
	logger.info("method실행");
}
}
