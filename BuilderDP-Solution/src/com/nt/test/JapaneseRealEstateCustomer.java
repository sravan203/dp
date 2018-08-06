package com.nt.test;

import com.nt.factory.HouseFactory;
import com.nt.product.House;

public class JapaneseRealEstateCustomer {
	public static void main(String[] args) {
		House house=null;
		house=HouseFactory.buildHouse("wooden");
		System.out.println(house);
		
	}

}
