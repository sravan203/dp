package com.nt.dao;

public class StudentDBDAO implements DAO {

	@Override
	public void insert() {
		System.out.println("StudentDBDAO::Inserting Student Details to DB .....");
	}

}
