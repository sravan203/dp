package com.nt.factory;

import java.util.HashMap;
import java.util.Map;

import com.nt.comp.Circle;
import com.nt.comp.Shape;
import com.nt.comp.Square;

public class ShapeFactory {
	private static  Map<String,Shape> shapeCache=new HashMap();
	
	public  static  Shape getShape(String shapeType){
		Shape shape=null;
		if(!shapeCache.containsKey(shapeType)){
			 if(shapeType.equalsIgnoreCase("square")){
				 shape=new Square();
				 shapeCache.put(shapeType, shape);
			 }
			 else if(shapeType.equalsIgnoreCase("circle")){
				 shape=new Circle();
				 shapeCache.put(shapeType, shape);
			 }
			 else{
				 throw new IllegalArgumentException("Invalid shape");
			 }
		}//if
		return shapeCache.get(shapeType);
	}//method
}//class
