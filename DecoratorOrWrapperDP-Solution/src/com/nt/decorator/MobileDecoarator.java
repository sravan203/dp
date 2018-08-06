//MobileDecorator.java (abstract Decorator)
package com.nt.decorator;

import com.nt.component.Mobile;

public abstract class MobileDecoarator implements Mobile {
   private Mobile mobile;
	public MobileDecoarator(Mobile mobile) {
		this.mobile=mobile;
	}
	
	@Override
	public void purchase() {
		mobile.purchase();
	}

}
