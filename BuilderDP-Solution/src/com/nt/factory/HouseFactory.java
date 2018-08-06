package com.nt.factory;

import javax.print.attribute.standard.MediaSize.Engineering;

import com.nt.builder.BrickHouseBuilder;
import com.nt.builder.HouseBuilder;
import com.nt.builder.IglooHouseBuilder;
import com.nt.builder.MarbleHouseBuilder;
import com.nt.builder.WoodenHouseBuilder;
import com.nt.director.CivilEngineer;
import com.nt.product.House;

public class HouseFactory {
	
	public  static  House   buildHouse(String type){
		HouseBuilder builder=null;
		House house=null;
		CivilEngineer engineer=null;
		//construct Builder obj based on house type
		house=new House();
		if(type.equalsIgnoreCase("brick"))
			builder=new BrickHouseBuilder(house);
		else if(type.equalsIgnoreCase("wooden"))
			builder=new WoodenHouseBuilder(house);
		else if(type.equalsIgnoreCase("marble"))
			builder=new MarbleHouseBuilder(house);
		else  if(type.equalsIgnoreCase("igloo"))
			builder=new IglooHouseBuilder(house);
		else
			throw new IllegalArgumentException("Invalid House type");
		//create Director object
		engineer=new CivilEngineer(builder);
		engineer.constructHouse();
		return engineer.getHouse();
		
	}

}
