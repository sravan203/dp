package com.nt.comps;

public class HoneyDryFruitVanilaIceCream extends VanilaIceCream{
	
	public  void addDryFruits(){
		System.out.println("adding dry fruits");
	}
	
	public  void addHoney(){
		System.out.println("adding honey");
	}


	public void prepare(){
		super.prepare();
		addDryFruits();
		addHoney();
	}

}
