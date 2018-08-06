package com.nt.director;

import com.nt.builder.HouseBuilder;
import com.nt.product.House;

public class CivilEngineer {
	private HouseBuilder builder;
	
	public  CivilEngineer(HouseBuilder builder){
		this.builder=builder;
	}
	
	public House getHouse(){
		return builder.getHouse();
	}
	
	//mainly  builder DP Appears here
	public void constructHouse(){
		builder.buildBasement();
		builder.buildStructure();
		builder.buildRoof();
		builder.buildInterior();
	}

}
