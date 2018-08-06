package com.nt.builder;

import com.nt.product.ConcreteBasement;
import com.nt.product.ConcreteRoof;
import com.nt.product.ConcreteStructure;
import com.nt.product.House;
import com.nt.product.IceBasement;
import com.nt.product.IceInterior;
import com.nt.product.IceRoof;
import com.nt.product.IceStructure;
import com.nt.product.MarbleInterior;
import com.nt.product.MarbleRoof;
import com.nt.product.WoodenInterior;

public class IglooHouseBuilder implements HouseBuilder {
	 private House house;
	 
	 public IglooHouseBuilder(House house) {
		 this.house=house;
		
	}
	

	@Override
	public void buildBasement() {
	  house.setBasement(new IceBasement());
	}

	@Override
	public void buildStructure() {
	house.setStrucutre(new IceStructure());
	}

	@Override
	public void buildRoof() {
		house.setRoof(new IceRoof());

	}

	@Override
	public void buildInterior() {
		house.setInteriror(new IceInterior());

	}

	@Override
	public House getHouse() {
		return house;
	}

}
