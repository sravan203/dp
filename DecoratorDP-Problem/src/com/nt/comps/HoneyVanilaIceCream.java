package com.nt.comps;

public class HoneyVanilaIceCream extends VanilaIceCream {
	
	public  void addHoney(){
		System.out.println("adding honey");
	}
	public void prepare(){
		super.prepare();
		addHoney();
	}

}
