package com.nt.test;

import com.nt.component.BankService;
import com.nt.factory.BankServiceFactory;

public class Customer1DuringDemonitization {
   public static void main(String[] args) {
	   BankService service=null;
	   service=BankServiceFactory.getInstance(true);
	   System.out.println("service obj class::"+service.getClass());
	   System.out.println("Customer2.....");
	   try{
	   System.out.println(service.deposite(1002,2000000));
	   }
	   catch(IllegalAccessException iae){
		    iae.printStackTrace();
	   }
	   System.out.println(".................................................");
	   try{
	   System.out.println(service.withdraw(1002, 500000));
	   }
	   catch(IllegalAccessException iae){
		   iae.printStackTrace();
	   }
	   
   }

}
