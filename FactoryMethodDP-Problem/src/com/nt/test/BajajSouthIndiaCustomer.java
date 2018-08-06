package com.nt.test;

import com.nt.bike.BajajBike;
import com.nt.factory.BajajChennaiFactory;
import com.nt.factory.BajajGurugramFactory;

public class BajajSouthIndiaCustomer {

	public static void main(String[] args) {
		BajajBike  bike=null;
		
		bike=BajajChennaiFactory.createBike("pulsor");
		bike.drive();
		

	}

}
