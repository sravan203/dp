package com.nt.test;

import com.nt.comps.DryFruitButterScotchIceCream;
import com.nt.comps.IceCream;
import com.nt.comps.VanilaIceCream;

public class DecoratorProblemTest {
	public static void main(String[] args) {
		
	
	IceCream cream1=null,cream2=null;
	cream1=new VanilaIceCream();
	cream1.prepare();
	System.out.println(".....................");
	cream2=new DryFruitButterScotchIceCream();
	cream2.prepare();
	System.out.println("...........................");
	}

}
