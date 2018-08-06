package com.nt.factory;

import com.nt.bike.BajajAvangerBike;
import com.nt.bike.BajajBike;
import com.nt.bike.BajajDiscoverBike;
import com.nt.bike.BajajPulsorBike;
import com.nt.factorymethod.BajajFactory;

public class BajajChennaiFactory  extends  BajajFactory{
	
	
	public    BajajBike  createBike(String  type){
		BajajBike bike=null;
		  if(type.equalsIgnoreCase("pulsor"))
			  bike=new BajajPulsorBike();
		  else if(type.equalsIgnoreCase("discover"))
			  bike=new BajajDiscoverBike();
		  else if(type.equalsIgnoreCase("avenger"))
			  bike=new BajajAvangerBike();
		  else
			  throw new IllegalArgumentException("Invalid bajaj model");
		    return bike;
	}

	@Override
	public void paint() {
		System.out.println("BajajChennaiFactory:: paiting bajaj bike");
		
	}

	@Override
	public void assemble() {
		System.out.println("BajajChennaiFactory:: assembling bajaj bike");
		
	}

	@Override
	public void roadTest() {
		System.out.println("BajajChennaiFactory:: roadTesting bajaj bike");
		
	}

}
