package com.nt.comps;

public abstract class HireFresher {
	public  boolean conductAptitudeTest(){
		System.out.println("Aptitude Test");
		return true;
	}
	
	public  boolean conductGDTest(){
		System.out.println("GD Test");
		return true;
	}
	
	public  abstract boolean conductTechnicalTest();
	
	public abstract boolean conductSystemTest();
	
	public  boolean conductHRInterview(){
		System.out.println("HR Interview");
		return true;
	}
	
	//Template method defination
	public  final boolean recruitmentProcess(){
		boolean result=false;
		result=conductAptitudeTest();
		if(result)
			result=conductGDTest();
		if(result)
			result=conductTechnicalTest();
		if(result)
			result=conductSystemTest();
		if(result)
			result=conductHRInterview();
		return result;
	}
	

}
