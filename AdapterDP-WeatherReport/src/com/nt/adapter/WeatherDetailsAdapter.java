package com.nt.adapter;

import com.nt.external.WeatherReportComp;
import com.nt.external.WeatherReportCompImpl;

public class WeatherDetailsAdapter {
	private static WeatherDetailsAdapter adapter;
	
	private WeatherDetailsAdapter() {
		// no task
	}
	
	public static WeatherDetailsAdapter  getAdapter(){
		if(adapter==null)
			adapter=new WeatherDetailsAdapter();
		return adapter;
	}

	public  float   getTemparatureAdapter(String cityName,String countryName )throws IllegalArgumentException{
		float temp=0.0f;
		int cityCode=0,countryCode=0;
		WeatherReportComp extComp=null;
		//convert cityName  to city code
		if(cityName.equalsIgnoreCase("hyderabad"))
			cityCode=1000;
		else  if(cityName.equalsIgnoreCase("bengaluru"))
			cityCode=1001;
		else  if(cityName.equalsIgnoreCase("pune"))
			cityCode=1002;
		else  if(cityName.equalsIgnoreCase("chennai"))
			cityCode=1003;
		else if(cityName.equalsIgnoreCase("delhi"))
			cityCode=1004;
		else if(cityName.equalsIgnoreCase("ca"))
			cityCode=2000;
		else if(cityName.equalsIgnoreCase("la"))
			cityCode=2001;
		else if(cityName.equalsIgnoreCase("dallas"))
			cityCode=2002;
		else if(cityName.equalsIgnoreCase("dc"))
			cityCode=2003;
		else 
			throw new IllegalArgumentException("Invalid City");
		
		//convert countryName  to country code
		if(countryName.equalsIgnoreCase("india"))
			countryCode=100;
		else if(countryName.equalsIgnoreCase("usa"))
			countryCode=101;
		else
			throw new IllegalArgumentException("invalid country");
		//invoke external service comp
		 extComp=WeatherReportCompImpl.getInstance();
		 //invoke method
		 temp=extComp.getTemperature(cityCode, countryCode);
		 //convert  Fahrenheit degres to Celcius degrees
		 temp=((temp-32)/9) *5;
		 return temp;
	}
	
}
