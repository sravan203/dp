package com.nt.external;

public class WeatherReportCompImpl implements WeatherReportComp{
	private static WeatherReportComp instance;
	
	private WeatherReportCompImpl(){
		//no task
	}
	
	public static  WeatherReportComp  getInstance(){
		  if(instance==null){
			  synchronized (WeatherReportComp.class) {
				   if(instance==null)
					   instance=new WeatherReportCompImpl();
			}//synchronized
		  }//if
		  return instance;
	}//method
	
	public  float  getTemperature(int cityCode,int countryCode)throws IllegalArgumentException{
		  float temp=0.0f;
		  if(countryCode==100){
			 if(cityCode==1000)
				  temp=93.2f;
			 else if(cityCode==1001)
				 temp=80.6f;
			 else if(cityCode==1002)
				 temp=81.6f;
			 else if(cityCode==1003)
				 temp=104.6f;
			 else if(cityCode==1004)
				 temp=105.6f;
			 else 
				 throw new IllegalArgumentException("invalid city");
		 }
		 else if(countryCode==101){
			 if(cityCode==2000)
				 temp=93.3f;
			 else if(cityCode==2001)
				 temp=89.4f;
			 else if(cityCode==2002)
				 temp=67.55f;
			 else if(cityCode==2003)
				 temp=56.7f;
			 else
				 throw  new  IllegalArgumentException("Invalid city");
		 }
		 else{
			 throw new  IllegalArgumentException("Invalid country");
		 }
		 return temp;
	}//method
}//class
