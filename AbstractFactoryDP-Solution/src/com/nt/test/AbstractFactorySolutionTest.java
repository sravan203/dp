package com.nt.test;

import com.nt.dao.DAO;
import com.nt.factory.DAOFactory;
import com.nt.factory.DAOFactoryCreator;
import com.nt.factory.DBDAOFactory;
import com.nt.factory.ExcelDAOFactory;

public class AbstractFactorySolutionTest {

	public static void main(String[] args) {
		DAO stDao=null,courseDao=null;
		DAOFactory dFactory=null;
		dFactory=DAOFactoryCreator.buildDAOFactory("DB");
		stDao=dFactory.getInstance("student");
		courseDao=dFactory.getInstance("course");
		stDao.insert();
		courseDao.insert();
   System.out.println(".....done ......");		
	

	}//main
}//class
