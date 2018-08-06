package com.nt.test;

import com.nt.comps.HireDotNetFresher;
import com.nt.comps.HireFresher;
import com.nt.comps.HireJavaFresher;

public class SelectionProcessTest {

	public static void main(String[] args) {
		HireFresher javaFresher=null,dotNetFresher=null;
		boolean result=false;
		//Recruting java fresher
		javaFresher=new HireJavaFresher();
		result=javaFresher.recruitmentProcess();
		if(result)
			System.out.println("Java Fresher Selected");
		else
			System.out.println("Java Fresher not selected");
		System.out.println(".............................................");
		dotNetFresher=new HireDotNetFresher();
		result=dotNetFresher.recruitmentProcess();
		if(result)
			System.out.println("dotNet Fresher Selected");
		else
			System.out.println("dotNet Fresher not selected");

	}//main
}//class
