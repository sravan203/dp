package com.nt.service;

import org.apache.log4j.Logger;

import com.nt.bo.LoanDetailsBO;
import com.nt.commons.Log4jInitializer;
import com.nt.dao.LoanDAO;
import com.nt.dao.LoanDAOFactory;
import com.nt.dto.LoanDetailsDTO;

public class LoanServicesImpl implements LoanService {
	private static Logger logger=Logger.getLogger(LoanServicesImpl.class);
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
	@Override
	public String registerCustomer(LoanDetailsDTO dto) throws Exception {
		logger.debug("registerCustmer(-)");
		LoanDAO dao=null;
		float intrAmt=0.0f;
		float totalAmt=0.0f;
		LoanDetailsBO bo=null;
		int count=0;
		try{
		//write b.logic to calc intramount
		intrAmt=(dto.getPrincipleAmt()*dto.getRate()*dto.getTime())/100.0f;
		logger.debug("intr amount calculated");
		//get total Amount
		totalAmt=dto.getPrincipleAmt()+intrAmt;
		//prepare BO class obj having Persitable Data
		bo=new LoanDetailsBO();
		bo.setCustName(dto.getCustName());
		bo.setBranch(dto.getBranch());
		bo.setCustAddrs(dto.getCustAddrs());
		bo.setPrincipleAmt(dto.getPrincipleAmt());
		bo.setIntrAmt(intrAmt);
		//get DAO
		dao=LoanDAOFactory.getInstance("JDBC");
		logger.debug("DAOImpl calss obj gathered from factory");
		//use DAO
		count=dao.insert(bo);
		//return result
		if(count==0){
			 logger.info("problem in Customer registration");
			  return "Customer Registration failed and total Amount::"+totalAmt;
			 
		}
		else{
			logger.info("success in customer registration");
			 return "Customer Registration successful and total Amount::"+totalAmt;
		  }
		}//try
		catch(Exception e){
			logger.fatal("problem in Customer registration");
			throw e;
		}
		
	}//method
}//class
