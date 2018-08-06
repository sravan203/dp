package com.nt.controller;

import java.beans.Customizer;

import org.apache.log4j.Logger;

import com.nt.commons.Log4jInitializer;
import com.nt.dto.LoanDetailsDTO;
import com.nt.service.LoanService;
import com.nt.service.LoanServicesImpl;

public class BankController {
	private static Logger logger=Logger.getLogger(BankController.class);
	/*static{
		  try{
		  Log4jInitializer.initializeLog4j();
		   logger.info("Log4j Initialized");
		  }
		  catch(Exception e){
			  logger.fatal("log4j initialization failed");
		  }
	  }//static
*/
	public String  doCustomRegistration(LoanDetailsDTO dto)throws Exception{
		 logger.debug("doCustomRegistration(-)");
		LoanService service=null;
		String result=null;
		try{
		//get Service class obj
		service=new LoanServicesImpl();
		//invoke method
		result=service.registerCustomer(dto);
		logger.debug("Service class b.method invoked");
		}
		catch(Exception e){
			logger.fatal("unknown problem invoking b.method");
			throw e;
		}
		return result;
	}//method
}//class
