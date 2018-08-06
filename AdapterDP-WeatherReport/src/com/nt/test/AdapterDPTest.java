package com.nt.test;

import com.nt.service.FBDayWelcomeService;
import com.nt.service.FBDayWelcomeServiceImpl;

public class AdapterDPTest {

	public static void main(String[] args) {
		FBDayWelcomeService service=null;
		
		//create FBService class obj
		service=new FBDayWelcomeServiceImpl();
		//invoke method
		System.out.println("Temp of hyderabad city (india)::"+service.getTemparature("hyderabad","india")+" 'c");

	}//main
}//class
