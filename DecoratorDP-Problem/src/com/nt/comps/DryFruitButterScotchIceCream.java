package com.nt.comps;

public class DryFruitButterScotchIceCream extends ButterScotchIceCream{
	
	public  void addDryFruits(){
		System.out.println("adding dry fruits");
	}
	public void prepare(){
		super.prepare();
		addDryFruits();
	}

}
