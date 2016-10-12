package com.mycompany.kimoon.exam09;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceDImpl1 implements ServiceD{
	private static final Logger logger = LoggerFactory.getLogger(Exam09Controller.class);
	
	public ServiceDImpl1(){
		logger.info("serviceDImpl1객체 생성");
	}
	
	@Override
	public void method() {}
	
}

