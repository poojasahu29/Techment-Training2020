package com.techment;

import org.apache.log4j.Logger;

public class LogExample {
	
	static Logger log =Logger.getLogger("LogExample.class");
	
	public static void main(String[] args) {
		
		log.info("this is info");
		log.debug("this is debug message");
		log.error("this is error message");
		log.fatal("this is fatal message");
		
	}
}