package com.nt.item;

public class SportsCar extends Car {
	private String power;

	@Override
	public void assemble() {
		System.out.println("SportsCar:: assembled");

	}

	@Override
	public void roadTest() {
		System.out.println("SportsCar:: roadTesting");

	}

	@Override
	public void deliver() {
		System.out.println("SportsCar:: delivery");

	}

}
