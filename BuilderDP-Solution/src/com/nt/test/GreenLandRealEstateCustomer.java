package com.nt.test;

import com.nt.factory.HouseFactory;
import com.nt.product.House;

public class GreenLandRealEstateCustomer {
	public static void main(String[] args) {
		House house=null;
		house=HouseFactory.buildHouse("igloo");
		System.out.println(house);
		
	}

}
