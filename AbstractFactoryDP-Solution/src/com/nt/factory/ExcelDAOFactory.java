package com.nt.factory;

import com.nt.dao.CourseExcelDAO;
import com.nt.dao.DAO;
import com.nt.dao.StudentExcelDAO;
//Factory DP
public class ExcelDAOFactory implements  DAOFactory {
	
	public    DAO   getInstance(String type){
		  DAO dao=null;
		  if(type.equalsIgnoreCase("student"))
			  dao=new StudentExcelDAO();
		  else if(type.equalsIgnoreCase("course"))
			  dao=new CourseExcelDAO();
		  else
			  throw  new IllegalArgumentException("invalid dao type");
		  return dao;
	}

}
