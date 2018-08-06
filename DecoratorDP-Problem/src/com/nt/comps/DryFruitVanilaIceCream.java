package com.nt.comps;

public class DryFruitVanilaIceCream extends VanilaIceCream{
	
	public  void addDryFruits(){
		System.out.println("adding dry fruits");
	}
	public void prepare(){
		super.prepare();
		addDryFruits();
	}

}
