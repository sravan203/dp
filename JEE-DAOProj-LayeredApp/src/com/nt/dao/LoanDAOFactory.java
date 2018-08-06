package com.nt.dao;

import org.apache.log4j.Logger;

import com.nt.commons.Log4jInitializer;

public class LoanDAOFactory {
	private static Logger logger=Logger.getLogger(LoanDAOFactory.class);
	/*static{
		  try{
		  Log4jInitializer.initializeLog4j();
		   logger.info("Log4j Initialized");
		  }
		  catch(Exception e){
			  logger.fatal("log4j initialization failed");
		  }
	  }//static
*/	public  static final  LoanDAO getInstance(String persistenceType)throws Exception{
		logger.debug("getInstance() of DAOFactory"); 
		 if(persistenceType.equalsIgnoreCase("JDBC")){
			 logger.debug("LoanDAOImpl class obj is created for JDBC");
			 return new LoanDAOImpl();
		 }
		 else{
			 return null;
		 }
	}//method
}//class
