package com.nt.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface AutoEnoGeneratorDAO {
	public  int getSequenceEmpNo(Connection con)throws SQLException;

}
