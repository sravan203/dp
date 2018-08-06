package com.nt.test;

import com.nt.component.AndriodMobile;
import com.nt.component.IOSMobile;
import com.nt.component.Mobile;
import com.nt.decorator.FingerPrintDecorator;
import com.nt.decorator.SelfieDecorator;
import com.nt.decorator.TurboChargerDecorator;

public class HitechCityFakeITEmployeeCustomer {
	public static void main(String[] args) {
		Mobile mobile=null;
		mobile=new TurboChargerDecorator(new FingerPrintDecorator(new SelfieDecorator(new IOSMobile())));
		mobile.purchase();
		System.out.println("................................");
	}

}
