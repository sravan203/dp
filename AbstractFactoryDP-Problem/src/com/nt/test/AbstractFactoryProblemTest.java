package com.nt.test;

import com.nt.dao.DAO;
import com.nt.factory.DBDAOFactory;
import com.nt.factory.ExcelDAOFactory;

public class AbstractFactoryProblemTest {

	public static void main(String[] args) {
		DAO stDao=null,courseDao=null;
		
		stDao=DBDAOFactory.getInstance("student");
		stDao.insert();
		System.out.println("...........................");
		courseDao=ExcelDAOFactory.getInstance("course");
		courseDao.insert();
	}//main
}//class
