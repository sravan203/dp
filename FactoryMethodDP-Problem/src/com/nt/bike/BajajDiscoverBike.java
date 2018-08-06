package com.nt.bike;

public class BajajDiscoverBike extends BajajBike {
	
	public BajajDiscoverBike() {
		engineCC="125CC";
		gearCount="4-Speed manual";
	}

	@Override
	public void drive() {
		System.out.println("BajajDiscoverBike::: driving "+engineCC+" bike having  "+gearCount);
	}

}
