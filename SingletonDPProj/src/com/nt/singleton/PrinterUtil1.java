package com.nt.singleton;

import java.io.IOException;
import java.io.ObjectInputStream;

import com.nt.util.CommonsUtil;

public class PrinterUtil1 extends CommonsUtil {
	
	
	private PrinterUtil1()throws IllegalArgumentException{
		//no task
	}
	
	public static PrinterUtil1 getInstance(){
		return  MyInnerClass.instance;
	}
	
	public void print(){
		System.out.println("printing on paper.....");
	}
	private static  class MyInnerClass {
		 private static PrinterUtil1 instance=new PrinterUtil1();
		 
	}

}
