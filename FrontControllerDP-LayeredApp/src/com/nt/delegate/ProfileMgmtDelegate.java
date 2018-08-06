package com.nt.delegate;

import com.nt.bo.ProfileBO;
import com.nt.dao.ProfileDAO;
import com.nt.dao.ProfileDAOImpl;
import com.nt.vo.ProfileVO;

public class ProfileMgmtDelegate {
    public ProfileVO   fetchProfile(int pid){
    	ProfileDAO dao=null;
    	ProfileBO bo=null;
    	ProfileVO vo=null;
    	//use DAO
    	dao=new ProfileDAOImpl();
    	bo=dao.getProfile(pid);
    	//convert  bo to vo
    	vo=new ProfileVO();
    	vo.setId(String.valueOf(bo.getId()));
    	vo.setName(bo.getName());
    	vo.setAddrs(bo.getAddrs());
    	vo.setAge(String.valueOf(bo.getAge()));
    	return vo;
    }//method
}//class
