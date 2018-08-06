package com.nt.factory;

import com.nt.bike.BajajAvangerBike;
import com.nt.bike.BajajBike;
import com.nt.bike.BajajDiscoverBike;
import com.nt.bike.BajajPulsorBike;

public class BajajGurugramFactory {
	private static void assemble(){
		System.out.println("Assembling   Bajaj Bike...");
	}
	
	private  static void paint(){
		System.out.println("Painiting   Bajaj Bike...");
	}
	
	private static void test(){
		System.out.println("Testing   Bajaj Bike...");
	}
	
	public  static  BajajBike  createBike(String  type){
		BajajBike bike=null;
		  if(type.equalsIgnoreCase("pulsor"))
			  bike=new BajajPulsorBike();
		  else if(type.equalsIgnoreCase("discover"))
			  bike=new BajajDiscoverBike();
		  else if(type.equalsIgnoreCase("avenger"))
			  bike=new BajajAvangerBike();
		  else
			  throw new IllegalArgumentException("Invalid bajaj model");
		    paint();
		    assemble();
		    return bike;
	}

}
