package com.nt.dao;

import java.sql.SQLException;

import com.nt.bo.LoanDetailsBO;

public interface LoanDAO {
	public  int insert(LoanDetailsBO bo)throws SQLException;

}
