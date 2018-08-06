package com.nt.commons;

import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class ResourceBundleInfo {
	private static Properties props=null;
	static{

		ResourceBundle bundle=null;
		Set<String> keys=null;
		//load config.properties info java.util.Properties class object
		props=new Properties();
		bundle=ResourceBundle.getBundle("com/nt/commons/config");
		keys=bundle.keySet();
		for(String key:keys){
			props.put(key,bundle.getString(key));
		}
	}//static
	
	public static  String  getBundleValue(String key){
		return props.getProperty(key);
	}

}
