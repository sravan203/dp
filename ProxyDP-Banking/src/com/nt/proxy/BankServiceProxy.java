package com.nt.proxy;

import com.nt.component.BankService;
import com.nt.component.BankServiceImpl;

public class BankServiceProxy implements BankService {
	 BankService service;
	public BankServiceProxy() {
		//real object
		service=new BankServiceImpl();
	}

	@Override
	public String withdraw(int acno, float amount)throws IllegalAccessException {
		 if(amount>=4000)
			 throw  new IllegalAccessException("check amount to be withdrawn");
		 else
			 return service.withdraw(acno, amount);
	}

	@Override
	public String deposite(int acno, float amount)throws IllegalAccessException{
		 if(amount>=200000)
				return "Since amount >=200000, the 30% tax amount will be deducted";
		 else
			 return service.deposite(acno, amount);
			 
	}

}
