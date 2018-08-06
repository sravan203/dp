package com.nt.test;

import com.nt.bike.BajajBike;
import com.nt.factory.BajajChennaiFactory;
import com.nt.factory.BajajGurugramFactory;
import com.nt.factorymethod.BajajFactory;

public class BajajSouthIndiaCustomer {

	public static void main(String[] args) {
		BajajFactory  factory=null;
		BajajBike  bike=null;
		
		factory=new BajajChennaiFactory();
		bike=factory.orderBajajBike("pulsor");
		bike.drive();
		
		

	}

}
