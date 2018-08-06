package com.nt.component;

public class BankServiceImpl implements BankService {
      
	@Override
	public String withdraw(int acno, float amount) throws IllegalAccessException {
		
		return "withdrawing  amount Rs."+amount +" from account number:"+acno; 
	}

	@Override
	public String deposite(int acno, float amount) throws IllegalAccessException{
		return "depositing  amount Rs."+amount +" to account number:"+acno;
	}

}
