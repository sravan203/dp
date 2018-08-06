package com.nt.dao;

import org.apache.log4j.Logger;

public class EmpDAOFactory {
	private static Logger logger=Logger.getLogger(EmpDAOFactory.class);
   public  static EmpDAO getInstance(String type){
	   logger.debug("getInstance() of EmpDAOFactory");
	   if(type.equalsIgnoreCase("FINANCE")){
		   logger.debug("FinanceEmpDAOImpl class obj is created and returned");
		   return  new FinanceEmpDAOImpl();
	   }
	   else if(type.equalsIgnoreCase("HR")){
		   logger.debug("HREmpDAOImpl class obj is created and returned");
		   return  new HREmpDAOImpl();
	   }
	   else{
		   logger.error("Problem in DAO class obj creation in Factory");
		   throw new IllegalArgumentException();
	   }
   }
}
