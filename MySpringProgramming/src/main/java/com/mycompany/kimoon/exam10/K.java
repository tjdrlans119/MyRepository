package com.mycompany.kimoon.exam10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class K {
	private static final Logger logger = LoggerFactory.getLogger(K.class);
	
	@Autowired
	private G g;
	
	@Autowired
	private H h;
	
	public K() {
		logger.info("K Í∞ùÏ≤¥ ?Éù?Ñ±");
	}
	
	public void method() {
		logger.info("method ?ã§?ñâ");
		g.method();
		h.method();
	}
}
