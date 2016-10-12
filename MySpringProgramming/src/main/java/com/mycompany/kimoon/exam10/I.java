package com.mycompany.kimoon.exam10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class I {
	private static final Logger logger = LoggerFactory.getLogger(I.class);
	
	private H h;
	
	@Autowired
	public I(H h) {
		logger.info("I Í∞ùÏ≤¥ ?Éù?Ñ±");
		this.h = h;
	}
	
	public void method() {
		logger.info("method ?ã§?ñâ");
		h.method();
	}
}
