package com.mycompany.kimoon.exam10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class H {
	private static final Logger logger = LoggerFactory.getLogger(H.class);
	
	public H() {
		logger.info("H Í∞ùÏ≤¥ ?Éù?Ñ±");
	}
	
	public void method() {
		logger.info("method ?Éù?Ñ±");
	}
}
