package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class AutoEnGeneratorDAOImpl implements AutoEnoGeneratorDAO {
	private static  Logger logger=Logger.getLogger(AutoEnGeneratorDAOImpl.class);
   private static final String ENO_SEQ="SELECT ENO_SEQ.NEXTVAL FROM DUAL";
	@Override
	public int getSequenceEmpNo(Connection con) throws SQLException {
		logger.debug("getSequenceEmpNo(-) method");
		PreparedStatement ps=null;
		ResultSet rs=null;
		int count=0;
		try{
			ps=con.prepareStatement(ENO_SEQ);
			rs=ps.executeQuery();
			rs.next();
			count=rs.getInt(1);
			logger.info("Sequence number is generated");
		}
		catch(SQLException se){
			logger.error("problem in sequence based eno generation");
			throw se;
		}
		catch(Exception e){
			logger.fatal("unproblem in sequence based eno generation");
			throw e;
		}
		finally{
			//close jdbc objs
			try{
				if(rs!=null){
					rs.close();
					logger.info("RS is closed");
				}
			}
			catch(SQLException se){
				logger.error("Problem in closing RS");
				throw se;
			}
			
			try{
				if(ps!=null){
					ps.close();
					logger.info("PS is closed");
				}
			}
			catch(SQLException se){
				logger.error("Problem in closing PS");
				throw se;
			}
		}//finally
		return count;
	}//method

}//class
