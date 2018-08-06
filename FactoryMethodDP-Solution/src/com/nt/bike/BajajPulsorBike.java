package com.nt.bike;

public class BajajPulsorBike extends BajajBike {
	
	public BajajPulsorBike() {
		engineCC="220CC/180CC";
		gearCount="5-Speed manual";
	}

	@Override
	public void drive() {
		System.out.println("Bajaj Pulsor Bike::: driving "+engineCC+" bike having  "+gearCount);
	}

}
