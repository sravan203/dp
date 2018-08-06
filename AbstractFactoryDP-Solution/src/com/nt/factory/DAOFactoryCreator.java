package com.nt.factory;

//Abstract FactoryDP
public class DAOFactoryCreator {
	
	public static  DAOFactory  buildDAOFactory(String store){
		DAOFactory  dFactory=null;
		if(store.equalsIgnoreCase("DB"))
			dFactory=new DBDAOFactory();
		else if(store.equalsIgnoreCase("Excel"))
			dFactory=new ExcelDAOFactory();
		else
			throw new IllegalArgumentException("Invalid storage......");
		return dFactory;
	}

}
