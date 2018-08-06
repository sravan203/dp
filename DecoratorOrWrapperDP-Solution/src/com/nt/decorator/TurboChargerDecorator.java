package com.nt.decorator;

import com.nt.component.Mobile;

public class TurboChargerDecorator extends MobileDecoarator {

	public TurboChargerDecorator(Mobile mobile) {
		super(mobile);
	}
	
	private void addTurboCharger(){
		System.out.println("adding  Turbo Charger....");
   }
	
	@Override
	public void purchase() {
		super.purchase();
		addTurboCharger();
	}

}
