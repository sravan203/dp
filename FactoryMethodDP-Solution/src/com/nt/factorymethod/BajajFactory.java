package com.nt.factorymethod;

import com.nt.bike.BajajBike;

public abstract class BajajFactory {
     public abstract void paint();
     
     public abstract void assemble();
     
     public abstract void roadTest();

     public  abstract  BajajBike createBike(String type);
	
     //Factory method design Pattern
     public     BajajBike orderBajajBike(String type){
    	       BajajBike bike=null;
    	       bike=createBike(type);
    	       assemble();
    	       paint();
    	       roadTest();
    	    return bike;
     }
    
    
     
	
}
