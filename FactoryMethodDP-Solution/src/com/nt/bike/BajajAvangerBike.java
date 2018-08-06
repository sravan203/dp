package com.nt.bike;

public class BajajAvangerBike extends BajajBike {
	
	public BajajAvangerBike() {
		engineCC="150CC";
		gearCount="5-Speed manual";
	}

	@Override
	public void drive() {
		System.out.println("BajajAvengerBike::: driving "+engineCC+" bike having  "+gearCount);
	}

}
