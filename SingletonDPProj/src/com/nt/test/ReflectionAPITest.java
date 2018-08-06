package com.nt.test;

import java.lang.reflect.Constructor;

import com.nt.singleton.PrinterUtil;

public class ReflectionAPITest {

	public static void main(String[] args) {
		PrinterUtil pu=null,pu1=null;
		Constructor cons[]=null;
		
		//get Object of Singleton Java class
		pu=PrinterUtil.getInstance();
		// create Object for Singleton using Reflection API by accessing private
		//constructor outside the java class.
		try{
		     //Load the class
			Class c=Class.forName("com.nt.singleton.PrinterUtil");
			//get All Delcared constructors of class
			cons=c.getDeclaredConstructors();
			//Get Access to 0-param consturctor
			cons[0].setAccessible(true);
			pu1=(PrinterUtil)cons[0].newInstance(null);
			System.out.println("Object created through  Reflection api");
			System.out.println(pu.hashCode()+"  "+pu1.hashCode());
			System.out.println("pu==pu1?"+(pu==pu1));
		}
		catch(InstantiationException  iae){
			iae.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
			
		     
		
		

	}

}
