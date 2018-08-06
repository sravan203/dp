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
import com.nt.product.WoodenRoof;
import com.nt.product.WoodenStructure;

public class WoodenHouseBuilder implements HouseBuilder {
	 private House house;
	 
	 public WoodenHouseBuilder(House house) {
		 this.house=house;
		
	}
	

	@Override
	public void buildBasement() {
	  house.setBasement(new ConcreteBasement());
	}

	@Override
	public void buildStructure() {
	house.setStrucutre(new WoodenStructure());
	}

	@Override
	public void buildRoof() {
		house.setRoof(new WoodenRoof());

	}

	@Override
	public void buildInterior() {
		house.setInteriror(new WoodenInterior());

	}

	@Override
	public House getHouse() {
		return house;
	}

}
