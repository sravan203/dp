package com.nt.test;

import com.nt.component.BankService;
import com.nt.factory.BankServiceFactory;

public class Customer2AfterDemonitization {
   public static void main(String[] args) {
	   BankService service=null;
	   service=BankServiceFactory.getInstance(false);
	   System.out.println("service obj class::"+service.getClass());
	   System.out.println("Customer3.....");
	   try{
	   System.out.println(service.deposite(1003,2000000));
	   }
	   catch(IllegalAccessException iae){
		    iae.printStackTrace();
	   }
	   System.out.println(".................................................");
	   try{
	   System.out.println(service.withdraw(1003, 500000));
	   }
	   catch(IllegalAccessException iae){
		   iae.printStackTrace();
	   }
	   
   }

}
