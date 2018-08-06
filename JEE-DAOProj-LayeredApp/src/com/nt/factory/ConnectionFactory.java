package com.nt.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.nt.commons.Log4jInitializer;

public class ConnectionFactory {
	private static  Logger logger=Logger.getLogger(ConnectionFactory.class);
	private static Properties props;
	private static BasicDataSource bds=null;
	static{
		InputStream is=null;
		
		try{
		/*	//initialize log4j
			Log4jInitializer.initializeLog4j();*/
			logger.info("log4j is initialized");
		  //load jdbc properites file
		   is=new FileInputStream("src/com/nt/commons/jdbc.properties");
		   //load jdbc properties file content to java.util.Properties class obj
		   props=new Properties();
		   props.load(is);
		   logger.info("log4j and jdbc properties are loaded");
		}
		catch(IOException ioe){
			logger.error("problem in loading log4j, jdbc properties files");
		}
		catch(Exception e){
			logger.fatal("unproblem in loading log4j, jdbc properties files");
		}
		finally{
		   try{	
			if(is!=null)
				is.close();
		   }
		   catch(IOException ioe){
			   logger.error("problem closing inputstream that loads jdbc.properties file" );
		   }
		}//finally
		try{
			//initialize ApacheDBCP2 jdbc con pool
			bds=new BasicDataSource();
			bds.setDriverClassName(props.getProperty("jdbc.driver"));
			bds.setUrl(props.getProperty("jdbc.url"));
			bds.setUsername(props.getProperty("jdbc.user"));
			bds.setPassword(props.getProperty("jdbc.pwd"));
			logger.info("Apache DBCP2 jdbc con pool is initialized");
		}//try
		catch(Exception e){
          logger.fatal("Apache DBCP2 jdbc con pool is not initialized");			
		}
	}//static
	
	public  static  Connection getPooledConnection()throws SQLException{
		Connection con=null;
		logger.debug("ConnectionFactory.getPooledConnection() ");
		try{
		 	con=bds.getConnection();
		 	logger.info("jdbc con obj is returned ");
		}
		catch(SQLException se){
			logger.error("Problem in gathering jdbc con obj from jdbc con pool ");
		}
		catch(Exception e){
			logger.fatal("UnProblem in gathering jdbc con obj from jdbc con pool");
		}
		return con;
	}//method
	
}//class
