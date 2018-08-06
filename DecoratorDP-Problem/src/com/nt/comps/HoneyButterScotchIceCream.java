package com.nt.comps;

public class HoneyButterScotchIceCream extends ButterScotchIceCream{
	
	public  void addHoney(){
		System.out.println("adding honey");
	}
	public void prepare(){
		super.prepare();
		addHoney();
	}

}
