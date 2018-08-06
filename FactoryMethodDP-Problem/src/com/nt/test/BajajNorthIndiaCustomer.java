package com.nt.test;

import com.nt.bike.BajajBike;
import com.nt.factory.BajajGurugramFactory;

public class BajajNorthIndiaCustomer {

	public static void main(String[] args) {
		BajajBike  bike=null;
		
		bike=BajajGurugramFactory.createBike("pulsor");
		bike.drive();
		

	}

}
