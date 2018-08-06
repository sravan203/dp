package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.nt.bo.LoanDetailsBO;
import com.nt.commons.Log4jInitializer;
import com.nt.factory.ConnectionFactory;

public class LoanDAOImpl implements LoanDAO {
	private static Logger logger=Logger.getLogger(LoanDAOImpl.class);
  private static final String INSERT_LOAN_DETAILS="INSERT INTO LOANDETAILS VALUES(LOANID_SEQ.NEXTVAL,?,?,?,?,?)";
 /* static{
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
	public int insert(LoanDetailsBO bo) throws SQLException {
		logger.debug("insert method");
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		try{
		 //get jdbc con obj from jdbc con pool
			con=ConnectionFactory.getPooledConnection();
		//create PreparedStatment object
			ps=con.prepareStatement(INSERT_LOAN_DETAILS);
			//set values to query params
			ps.setString(1,bo.getCustName());
			ps.setString(2, bo.getCustAddrs());
			ps.setString(3,bo.getBranch());
			ps.setFloat(4,bo.getPrincipleAmt());
			ps.setFloat(5,bo.getIntrAmt());
			//execute Query
			result=ps.executeUpdate();
			logger.info("record inserted");
		}//try
		catch(SQLException se){
			logger.error("SQL problem in record insertion");
			throw se;
		}
		catch(Exception e){
			logger.fatal("unknown problem in record insertion");
			throw e;
		}
		finally{
			//close jdbc objs
			try{
				if(ps!=null){
					ps.close();
					logger.info("PreparedStatement obj is closed");
				}
			}
			catch(SQLException se){
				logger.error(" problem in closing PreparedStatement object");
				throw se;
			}
			try{
				if(con!=null){
					con.close();
					logger.info("Connection obj is closed");
				}
			}
			catch(SQLException se){
				logger.error(" problem in closing jdbc con  object");
				throw se;
			}
		}//finally
		return result;
	}//method
}//class
