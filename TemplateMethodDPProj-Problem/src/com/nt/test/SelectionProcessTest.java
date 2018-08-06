package com.nt.test;

import com.nt.comps.HireJavaFresher;

public class SelectionProcessTest {

	public static void main(String[] args) {
		HireJavaFresher javaFresher=null;
		boolean result=false;
		//Recruting java fresher
		javaFresher=new HireJavaFresher();
		result=javaFresher.conductAptitudeTest();
		if(result)
			result=javaFresher.conductGDTest();
		if(result)
			 result=javaFresher.conductTechnicalTest();
		if(result)
			result=javaFresher.conductSystemTest();
		if(result)
			 result=javaFresher.conductHRInterview();
		
		if(result)
			System.out.println("candidate Selected");
		else
			System.out.println("Candidate not selected,Try after six monthds");
		

	}

}
