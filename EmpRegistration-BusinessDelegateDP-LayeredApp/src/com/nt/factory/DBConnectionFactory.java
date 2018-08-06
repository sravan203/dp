package com.nt.factory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;


import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.log4j.Logger;

public class DBConnectionFactory {
	private static Logger logger=Logger.getLogger(DBConnectionFactory.class);
	private static ResourceBundle bundle=null;
	static{
		try{
		//Locate jdbc.properties file
			bundle=ResourceBundle.getBundle("com/nt/commons/jdbc");
			logger.info("jdbc.properties file is located and loaded");
		}//try
		catch(Exception e){
			logger.fatal("un known problem in locating and loading jdbc.properties file");
		}
	}
	
	public  static  Connection getConnection()throws SQLException,NamingException{
		logger.debug("DBConnectionFactory.getConnection()");
		InitialContext ic=null;
		DataSource ds=null;
		Connection con=null;
		try{
			//create InitialContext
			ic=new InitialContext();
			//get DataSource obj through lookup opeation
			ds=(DataSource) ic.lookup(bundle.getString("dataSource.jndi"));
			System.out.println(bundle.getString("dataSource.jndi"));
			//get Pooled jdbc con object
			con=ds.getConnection();
			logger.info("pooled jdbc con obj is retrieved");
		}//try
		catch(SQLException se){
			logger.error("Probolem in getting pooled jdbc con obj");
			throw se;
		}
		catch(NamingException ne){
			logger.error("Problem in Jndi name related DataSource ");
			throw ne;
		}
		catch(Exception e){
			logger.fatal("UnProblem in gathering Poold jdbc con obj  ");
			throw e;
		}
		return con;
	}//method
}//class
