package com.nt.singleton;

import java.io.IOException;
import java.io.ObjectInputStream;

import com.nt.util.CommonsUtil;

public class PrinterUtil extends CommonsUtil {
	private static final long  serialVersionUID=234342424244L;
	private static PrinterUtil instance;
	private static boolean isInstanitated=false;
	
	static{
		instance=new PrinterUtil();
	}
	
	private PrinterUtil()throws IllegalArgumentException{
		  if(isInstanitated)
			  throw new IllegalArgumentException("Object already created");
		isInstanitated=true;
		
		//no task
	}
	
	/*public synchronized  static PrinterUtil  getInstance(){
		
	      if(instance==null){
	    	  try{
	    		  Thread.sleep(5000);
	    	  }
	    	  catch(Exception e){
	    		  e.printStackTrace();
	    	  }
	    	  instance=new PrinterUtil();
	      }
	      
	      return instance;
	}*/
	
	public   static PrinterUtil  getInstance(){
	 if(instance==null){  //1st null check
		synchronized (PrinterUtil.class) {
			 if(instance==null){   //2nd null check
		    	  try{
		    		  Thread.sleep(5000);
		    	  }//try
		    	  catch(Exception e){
		    		  e.printStackTrace();
		    	  }//catch
		    	  instance=new PrinterUtil();
		      }//if
		  }//synchronized
		}//if
	     
	      
	      return instance;
	}
	
	/*public static  PrinterUtil getInstance(){
		try{
		Thread.sleep(3000);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return instance;
		
	}*/
	
	
/*	@Override
	public Object clone() throws CloneNotSupportedException {
	   return instance;
	}*/
	
	@Override
	public Object clone() throws CloneNotSupportedException {
	  throw new CloneNotSupportedException("This Singleton class has got  protection from Cloning");
	}
	
	public  Object readResolve(){
		System.out.println("read Resolve(-)");
		return instance;
	}
	
	/*public Object  readResolve()throws IOException{
		System.out.println("readResolve()");
		throw new IOException("DeSerialization is protected");
	}*/
	
	
	public void print(){
		System.out.println("printing on paper.....");
	}

}
