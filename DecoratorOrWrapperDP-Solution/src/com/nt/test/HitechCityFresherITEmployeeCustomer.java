package com.nt.test;

import com.nt.component.AndriodMobile;
import com.nt.component.Mobile;
import com.nt.decorator.SelfieDecorator;

public class HitechCityFresherITEmployeeCustomer {
	public static void main(String[] args) {
		Mobile mobile=null;
		mobile=new SelfieDecorator(new AndriodMobile());
		mobile.purchase();
		System.out.println("................................");
	}

}
