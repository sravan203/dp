package com.nt.comps;

public class HireJavaFresher  extends HireFresher {

	@Override
	public  boolean conductTechnicalTest(){
		System.out.println("Java Technical Test");
		return true;
	}
	
	@Override
	public  boolean conductSystemTest(){
		System.out.println("Java System Test");
		return false;
	}
	
	

}
