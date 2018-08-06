package com.nt.locator;

import java.util.HashMap;
import java.util.Map;

import com.nt.sessionfacade.CrickterDetailsFinderCompSessionFacadeImpl;
import com.nt.sessionfacade.CrickterDetailsFinderSessionFacadeComp;

public class CrickterDetailsFinderSessionFacadeCompServiceLoator {
	private static CrickterDetailsFinderSessionFacadeCompServiceLoator instance;
	private Map<String,CrickterDetailsFinderSessionFacadeComp> cacheMap;
  private CrickterDetailsFinderSessionFacadeCompServiceLoator() {
	   cacheMap=new HashMap();
    }
    
    public static  CrickterDetailsFinderSessionFacadeCompServiceLoator  getInstance(){
    	 if(instance==null){
    		 synchronized (CrickterDetailsFinderSessionFacadeCompServiceLoator.class) {
				   if(instance==null){
					   instance=new CrickterDetailsFinderSessionFacadeCompServiceLoator();
				   }//if
			}//synchronized
    	 }//if
    	 return instance;
    }//method
    
    public  CrickterDetailsFinderSessionFacadeComp  getSessionFacadeComp(String jndiName){
    	CrickterDetailsFinderSessionFacadeComp facadeComp=null;
    	if(!cacheMap.containsKey(jndiName)){
    		facadeComp=new CrickterDetailsFinderCompSessionFacadeImpl();
    		cacheMap.put(jndiName, facadeComp);
    	}
    	return cacheMap.get(jndiName);
    }//method
}//class
