package com.nt.factory;

import com.nt.item.Car;
import com.nt.item.LuxoryCar;
import com.nt.item.MultiUtilityCar;
import com.nt.item.SportsCar;

public class CarFactory {
	
	public static Car  getCar(String type){
		  Car car=null;
		if(type.equalsIgnoreCase("sports"))
			car=new SportsCar();
		else if(type.equalsIgnoreCase("luxory"))
			car=new LuxoryCar();
		else if(type.equalsIgnoreCase("muv"))
			car=new MultiUtilityCar();
		else
			throw new IllegalArgumentException("Invalid Car Type");
		 car.assemble();
		 car.roadTest();
		 car.deliver();
		 System.out.println(type+"  car is ready");
		return car;	
	}

}
