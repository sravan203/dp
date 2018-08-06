package com.nt.delegate;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.nt.bo.FinanceEmpBO;
import com.nt.bo.HREmpBO;
import com.nt.dao.AutoEnGeneratorDAOImpl;
import com.nt.dao.AutoEnoGeneratorDAO;
import com.nt.dao.EmpDAO;
import com.nt.dao.EmpDAOFactory;
import com.nt.errors.AutoEmployeeNumberGenerationException;
import com.nt.errors.EmployeeRegistrationException;
import com.nt.factory.DBConnectionFactory;
import com.nt.vo.EmployeeVO;

public class EmployeeMgmtBusinessDelegate {
	private static Logger logger=Logger.getLogger(EmployeeMgmtBusinessDelegate.class);
	
	public String  registerEmp(EmployeeVO  vo)throws EmployeeRegistrationException,AutoEmployeeNumberGenerationException{
		logger.debug("registerEmp(-)");
		Connection con=null;
		AutoEnoGeneratorDAO autoDAO=null;
		int empNo=0;
		HREmpBO hrBO=null;
		FinanceEmpBO financeBO=null;
		EmpDAO  hrDAO=null,financeDAO=null;
		boolean isExcpetionRaised=false;
		String resultMsg=null;
		
	   try{
		   //get Con obj from  DBConnectionFactory
		   con=DBConnectionFactory.getConnection();
		   //create AutoGeneratorDAOImpl class object
		   autoDAO=new AutoEnGeneratorDAOImpl();
		   empNo=autoDAO.getSequenceEmpNo(con);
		   logger.debug("Employee number gathred ");
	   }//try
	   catch(SQLException se){
		   logger.error("problem in auto Eno generation");
		   throw new AutoEmployeeNumberGenerationException("problem in auto Eno generation"); //usecase2
	   }
	   catch(Exception e){
		   logger.fatal("unknown problem in auto Eno generation");
		   throw new AutoEmployeeNumberGenerationException("unknown problem in auto Eno generation"); //usecase2
	   }
	try{
		//convert VO class obj to Two BO class objects //useCase1
		  hrBO=new HREmpBO();
		  hrBO.setEmpName(vo.getEmpName());
		  hrBO.setEmpAddrs(vo.getEmpAddrs());
		  hrBO.setEmpDesg(vo.getEmpDesg());
		  hrBO.setDeptNo(Integer.parseInt(vo.getDeptNo()));
		  
		  financeBO=new FinanceEmpBO();
		  financeBO.setEmpName(vo.getEmpName());
		  financeBO.setEmpAddrs(vo.getEmpAddrs());
		  financeBO.setDeptNo(Integer.parseInt(vo.getDeptNo()));
		  financeBO.setEmpSalary(Float.parseFloat(vo.getEmpSalary()));
		  logger.info("VO class obj is converted into two BOs");
		  //get Both DAO class objects
		  hrDAO=EmpDAOFactory.getInstance("HR");
		  financeDAO=EmpDAOFactory.getInstance("FINANCE");
		  logger.debug("Two DAO are gathered from DAO factory");
		  //Begin Transaction   //use case3
		  con.setAutoCommit(false);
		  hrDAO.insert(con, hrBO, empNo);
		  financeDAO.insert(con, financeBO, empNo);
		  isExcpetionRaised=false;  //usecase3
		  logger.info("Employee registration success");
	  }//try
	  catch(SQLException se){
		  isExcpetionRaised=true;  //usecase3
		  if(se.getErrorCode()==1){
			  logger.error("Employee alredy registred");
			  throw new EmployeeRegistrationException("Employee alredy registred"); //usecase2
		  }
		  else if(se.getErrorCode()==12899){
			  logger.error(se.getMessage());
			  throw new EmployeeRegistrationException(se.getMessage()); //usecase2
			  }
	  }
	 catch(Exception e){
		 isExcpetionRaised=true;
		 logger.fatal("unknown problem is Employee registration");
		 throw new EmployeeRegistrationException("unknown problem is Employee registration"); //usecase2
	 }
	finally{
		try{
			if(isExcpetionRaised){
				con.rollback(); //usecase3
				logger.info("Tx rolledb back- Registration failed ");
				resultMsg="Registration failed";
			}
			else{
				con.commit();//usecase3
				logger.info("Tx committed- Registration succeded ");
				resultMsg="Registration succeded";
			}
		}//try
		catch(SQLException se){
			logger.error("problem in Employee Registration");
			throw new EmployeeRegistrationException("problem in Employee Registration");
		}
		//close jdbc con obj
		try{
			if(con!=null){
				con.close();
				logger.debug("Pooled con obj is closed");
			}
		}
		catch(SQLException se){
			logger.error("problem in closing pooled jdbc con object");
			throw new EmployeeRegistrationException("problem in closing jdbc connection");
		}
	}//finally
	  return resultMsg; 
	}//method
}//class
