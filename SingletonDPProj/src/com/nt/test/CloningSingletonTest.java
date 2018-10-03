package com.nt.test;

import com.nt.singleton.PrinterUtil;

public class CloningSingletonTest {

	public static void main(String[] args) {
	   PrinterUtil pu1=null,pu2=null;
	   
	   pu1=PrinterUtil.getInstance();
	   try{
	   pu2=(PrinterUtil)pu1.clone();
	   System.out.println(pu1.hashCode()+"   "+pu2.hashCode());
	   System.out.println("pu1==pu2?"+(pu1==pu2));
	   System.out.println("hlo");
	   }
	   catch(CloneNotSupportedException cnse){
		   cnse.printStackTrace();
	   }
	   

	}

}
