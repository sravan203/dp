package com.nt.test;

import com.nt.factory.HouseFactory;
import com.nt.product.House;

public class IndianRealEstateCustomer {
	public static void main(String[] args) {
		House house=null;
		house=HouseFactory.buildHouse("brick");
		System.out.println(house);
		
	}

}
