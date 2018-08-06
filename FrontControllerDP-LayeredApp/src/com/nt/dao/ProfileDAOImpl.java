package com.nt.dao;

import com.nt.bo.ProfileBO;

public class ProfileDAOImpl implements ProfileDAO {

	@Override
	public ProfileBO getProfile(int pid) {
		ProfileBO bo=null;
		bo=new ProfileBO();
		bo.setId(pid);
		bo.setName("raja");
		bo.setAddrs("hyd");
		bo.setAge(30);
		return bo;
	}

}
