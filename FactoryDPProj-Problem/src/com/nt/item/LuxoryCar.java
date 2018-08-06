package com.nt.item;

public class LuxoryCar extends Car {
	private String  acType;
	private String  entertainment;

	@Override
	public void assemble() {
		System.out.println("LuxoryCar:: assembled");

	}

	@Override
	public void roadTest() {
		System.out.println("LuxoryCar:: roadTesting");

	}

	@Override
	public void deliver() {
		System.out.println("LuxoryCar:: delivery");

	}

}
