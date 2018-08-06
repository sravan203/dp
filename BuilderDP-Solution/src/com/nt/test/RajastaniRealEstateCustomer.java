package com.nt.test;

import com.nt.factory.HouseFactory;
import com.nt.product.House;

public class RajastaniRealEstateCustomer {
	public static void main(String[] args) {
		House house=null;
		house=HouseFactory.buildHouse("marble");
		System.out.println(house);
		
	}

}
