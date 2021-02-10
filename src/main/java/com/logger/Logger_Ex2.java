package com.logger;

import org.apache.log4j.Logger;

public class Logger_Ex2 {

	static Logger logger = Logger.getLogger(Logger_Ex2.class);
	
	public static void main(String[] args) {
		
		for(int i=0;i<100000;i++) {
		logger.debug("Hello");
		}
	}
}
