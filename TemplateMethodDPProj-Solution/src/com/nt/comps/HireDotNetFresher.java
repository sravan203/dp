package com.nt.comps;

public class HireDotNetFresher  extends HireFresher{
	
	
	
	@Override
	public  boolean conductTechnicalTest(){
		System.out.println("DotNet Technical Test");
		return true;
	}
	
	@Override
	public  boolean conductSystemTest(){
		System.out.println("DotNet System Test");
		return true;
	}
	
	

}
