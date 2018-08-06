package com.nt.factory;

import com.nt.dao.CourseDBDAO;
import com.nt.dao.DAO;
import com.nt.dao.StudentDBDAO;
//Factory DP
public class DBDAOFactory {
	
	public  static  DAO   getInstance(String type){
		  DAO dao=null;
		  if(type.equalsIgnoreCase("student"))
			  dao=new StudentDBDAO();
		  else if(type.equalsIgnoreCase("course"))
			  dao=new CourseDBDAO();
		  else
			  throw  new IllegalArgumentException("invalid dao type");
		  return dao;
	}

}
