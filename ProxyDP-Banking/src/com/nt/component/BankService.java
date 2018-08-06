package com.nt.component;

public interface BankService {
    public String withdraw(int acno, float amount)throws IllegalAccessException;
    public  String deposite(int acno,float amount)throws IllegalAccessException;
}
