package com.nt.test;

import com.nt.factory.CarFactory;
import com.nt.item.Car;
import com.nt.item.LuxoryCar;
import com.nt.item.SportsCar;

public class FactoryDPTest {

	public static void main(String[] args) {
		Car car1=null,car2=null,car3=null;
		
		car1=CarFactory.getCar("sports");
		System.out.println("............................");
		car2=CarFactory.getCar("luxory");
		System.out.println("............................");
		car3=CarFactory.getCar("muv");
		System.out.println("............................");
	}

}
