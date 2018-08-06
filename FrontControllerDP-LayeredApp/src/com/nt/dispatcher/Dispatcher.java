package com.nt.dispatcher;

import java.util.ResourceBundle;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.commons.ResourceBundleInfo;

public class Dispatcher {

	public static void dispatchToView(String logicalViewName,HttpServletRequest req,HttpServletResponse res)throws Exception{
		String physicalView=null;
		RequestDispatcher rd=null;
		//get physical view name
		physicalView=ResourceBundleInfo.getBundleValue(logicalViewName);
		
		if(physicalView!=null){
			rd=req.getRequestDispatcher(physicalView);
			rd.forward(req,res);
		}
		else{
			rd=req.getRequestDispatcher(ResourceBundleInfo.getBundleValue("error.page"));
			rd.forward(req,res);
		}
	}
}
