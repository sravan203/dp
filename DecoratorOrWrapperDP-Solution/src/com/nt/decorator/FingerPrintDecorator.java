package com.nt.decorator;

import com.nt.component.Mobile;

public class FingerPrintDecorator extends MobileDecoarator {

	public FingerPrintDecorator(Mobile mobile) {
		super(mobile);
	}
	
	private void addFingerPrintSecurity(){
		System.out.println("adding  FingerPrint Security....");
   }
	
	@Override
	public void purchase() {
		super.purchase();
		addFingerPrintSecurity();
	}

}
