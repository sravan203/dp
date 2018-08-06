package com.nt.test;

import com.nt.item.Car;
import com.nt.item.LuxoryCar;
import com.nt.item.SportsCar;

public class FactoryDPTest {

	public static void main(String[] args) {
		 Car car1=null,car2=null;
		 car1=new SportsCar();
		 car1.assemble();
		 car1.roadTest();
		 car1.deliver();
		 System.out.println("Sports Car is ready");
		 System.out.println("......................................");
		 car2=new LuxoryCar();
		 car2.assemble();
		 car2.roadTest();
		 car2.deliver();
		 System.out.println("Luxory Car is ready");
		 System.out.println("......................................");

	}

}
