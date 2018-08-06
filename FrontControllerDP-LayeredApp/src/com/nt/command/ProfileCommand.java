package com.nt.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.delegate.ProfileMgmtDelegate;
import com.nt.vo.ProfileVO;

public class ProfileCommand implements Command {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ProfileMgmtDelegate delegate=null;
		int pid=0;
		ProfileVO vo=null;
		//use Delegate
		delegate=new ProfileMgmtDelegate();
		pid=Integer.parseInt(req.getParameter("pid"));
		vo=delegate.fetchProfile(pid);
		//keep result vo in scope
		req.setAttribute("profileInfo",vo);
        //return logical view name		
		return "view_profile";
	}

}
