package com.nt.factory;

import com.nt.component.BankService;
import com.nt.component.BankServiceImpl;
import com.nt.proxy.BankServiceProxy;

public class BankServiceFactory {
   public static BankService  getInstance(boolean RBIMonitoring){
	     BankService service=null;
	       if(RBIMonitoring)
	    	    service=new BankServiceProxy();
	       else
	    	   service=new BankServiceImpl();
	       return service;
	    	   
	   
   }
}
