package com.mycompany.kimoon.exam10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ServiceImpl1 implements Service {
	private static final Logger logger = LoggerFactory.getLogger(ServiceImpl1.class);
	
	public ServiceImpl1() {
		logger.info("ServiceImpl1 Í∞ùÏ≤¥ ?Éù?Ñ±");
	}
	
	@Override
	public void method() {
		logger.info("method ?ã§?ñâ");
	}
}
