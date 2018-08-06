package com.nt.decorator;

import com.nt.component.Mobile;

public class SelfieDecorator extends MobileDecoarator {

	public SelfieDecorator(Mobile mobile) {
		super(mobile);
	}
	
	private void addSelfieCamera(){
		System.out.println("adding Selfie Camera....");
   }
	
	@Override
	public void purchase() {
		super.purchase();
		addSelfieCamera();
	}

}
