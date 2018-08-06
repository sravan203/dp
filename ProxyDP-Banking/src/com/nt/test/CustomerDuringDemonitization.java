package com.nt.test;

import com.nt.component.BankService;
import com.nt.factory.BankServiceFactory;

public class CustomerDuringDemonitization {
   public static void main(String[] args) {
	   BankService service=null;
	   service=BankServiceFactory.getInstance(true);
	   System.out.println("service obj class::"+service.getClass());
	   System.out.println("Customer1.....");
	   try{
	   System.out.println(service.deposite(1001,20000));
	   }
	   catch(IllegalAccessException iae){
		    iae.printStackTrace();
	   }
	   System.out.println("...........................................");
	   try{
	   System.out.println(service.withdraw(1001, 2000));
	   }
	   catch(IllegalAccessException iae){
		    iae.printStackTrace();
	   }
	   
	   
   }

}
