package com.techment;
import java.io.IOException;


import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Appdemo{
	static Logger logger=Logger.getLogger(Appdemo.class);
	
	public static void main(String[] args) throws IOException{
		//FileAppender fa=new FileAppender(new PatternLayout(),"mylog.txt");
		FileAppender fa=new FileAppender(new HTMLLayout(),"mylog.txt");
		logger.addAppender(fa);
		logger.debug("debug msg");
		logger.error("error msg");
		logger.info("information msg");
		logger.fatal("fatal msg");
		System.out.println("suceessful");
	}

}