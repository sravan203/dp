package com.nt.command;

import javax.servlet.http.HttpServletRequest;

import com.nt.commons.ResourceBundleInfo;

public class CommandHelper {
	
	public static  Command  getCommand(HttpServletRequest req)throws Exception{
	   String path=null;
	   String commandClass=null;
	   Command cmd=null;
		//get Request uri path
	   path=req.getServletPath();
	   //get command class from properties 
	   commandClass=ResourceBundleInfo.getBundleValue(path);
	   //create and return Command class obj
	   cmd=(Command) Class.forName(commandClass).newInstance();
	   return cmd;
	}

}
