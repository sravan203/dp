package com.nt.test;

import com.nt.singleton.PrinterUtil;

public class TicketBookingServlet implements Runnable {

	@Override
	public void run() {
	  PrinterUtil pu=null;
	  pu=PrinterUtil.getInstance();
	  System.out.println("Thread name::"+Thread.currentThread().getName()+"hashcode ::  "+pu.hashCode());
	}

}
