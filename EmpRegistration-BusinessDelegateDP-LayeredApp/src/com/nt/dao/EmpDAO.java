package com.nt.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.nt.bo.BaseEmpBO;
import com.nt.bo.HREmpBO;

public interface EmpDAO {
   public void insert(Connection con,BaseEmpBO bo,int autoEno)throws SQLException;
}
