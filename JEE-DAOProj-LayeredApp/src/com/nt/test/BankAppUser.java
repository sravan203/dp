package com.nt.test;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.nt.commons.Log4jInitializer;
import com.nt.controller.BankController;
import com.nt.dto.LoanDetailsDTO;

public class BankAppUser {
	private static  Logger logger=Logger.getLogger(BankAppUser.class);
	static{
		  try{
		  Log4jInitializer.initializeLog4j();
		   logger.info("Log4j Initialized");
		  }
		  catch(Exception e){
			  logger.fatal("log4j initialization failed");
		  }
	  }//static
	public static void main(String[] args) {
		logger.debug("main(-) method");
		BankController controller=null;
		String result=null,custName=null,custAddrs=null,branch=null;
		float pAmt=0.0f,rate=0.0f,time=0.0f;
        Scanner sc=null;
        LoanDetailsDTO dto=null;
		try{
			//read inputs from enduser
			sc=new Scanner(System.in);
			System.out.println("Customer name::");
			custName=sc.next();
			System.out.println("Customer address");
			custAddrs=sc.next();
			System.out.println("customer Branch");
			branch=sc.next();
			System.out.println("Principle Amount");
			pAmt=sc.nextFloat();
			System.out.println("Rate of  Intrest");
			rate=sc.nextFloat();
			System.out.println("time ::");
			time=sc.nextFloat();
			//prepare LoandDetailsDTO class obj
			dto=new LoanDetailsDTO();
			dto.setCustName(custName);
			dto.setCustAddrs(custAddrs);
			dto.setBranch(branch);
			dto.setPrincipleAmt(pAmt);
			dto.setRate(rate);
			dto.setTime(time);
		//create controller class obj
		controller=new BankController();
		//invoke method
		result=controller.doCustomRegistration(dto);
		System.out.println("Final Result:::"+result);
		logger.info("final result displayed");
		}
		catch(Exception e){
			System.out.println("Internal Problem"+e.getMessage());
			logger.fatal("Problem in displaying final result");
		}
	}//main
}//class
