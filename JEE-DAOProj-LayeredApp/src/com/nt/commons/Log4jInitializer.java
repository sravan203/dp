package com.nt.commons;

import org.apache.log4j.PropertyConfigurator;

public class Log4jInitializer {
	
	public  static  void initializeLog4j()throws Exception{
		PropertyConfigurator.configure("src/com/nt/commons/log4j.properties");
	}
}
