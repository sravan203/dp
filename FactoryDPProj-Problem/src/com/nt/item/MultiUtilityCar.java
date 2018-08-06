package com.nt.item;

public class MultiUtilityCar extends Car {
	private String  space;
	private int seatsCount;
	
	@Override
	public void assemble() {
		System.out.println("MultiUtilityCar:: assembled");

	}

	@Override
	public void roadTest() {
		System.out.println("MultiUtilityCar:: roadTesting");

	}

	@Override
	public void deliver() {
		System.out.println("MultiUtilityCar:: delivery");

	}

}
