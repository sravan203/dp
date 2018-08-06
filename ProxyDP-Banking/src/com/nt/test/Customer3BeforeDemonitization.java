package com.nt.test;

import com.nt.component.BankService;
import com.nt.factory.BankServiceFactory;

public class Customer3BeforeDemonitization {
   public static void main(String[] args) {
	   BankService service=null;
	   service=BankServiceFactory.getInstance(false);
	   System.out.println("service obj class::"+service.getClass());
	   System.out.println("Customer4.....");
	   try{
	   System.out.println(service.deposite(1004,2000));
	   }
	   catch(IllegalAccessException iae){
		    iae.printStackTrace();
	   }
	   System.out.println(".................................................");
	   try{
	   System.out.println(service.withdraw(1004, 5000));
	   }
	   catch(IllegalAccessException iae){
		   iae.printStackTrace();
	   }
	   
   }

}
