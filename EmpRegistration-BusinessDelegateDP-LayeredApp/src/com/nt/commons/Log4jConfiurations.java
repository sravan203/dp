package com.nt.commons;

import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

import org.apache.log4j.PropertyConfigurator;

public class Log4jConfiurations {
	
	public static  void configure(){
		ResourceBundle bundle=null;
		Set<String> keys=null;
		Properties props=null;
		try{
			//Locate log4j.properties file
			bundle=ResourceBundle.getBundle("com/nt/commons/log4j");
			//get all keys from properties file
			keys=bundle.keySet();
			//Place Properties file into to java.util.Properties class obj
			props=new java.util.Properties();
			for(String key:keys){
				props.put(key,bundle.getString(key));
			}
			//Enable log4j
			PropertyConfigurator.configure(props);
		}
		catch(Exception e){
			System.out.println("Probolem in activating  log4j ");
			e.printStackTrace();
		}
	}//configure()
}//class
