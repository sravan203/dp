package com.nt.test;

import com.nt.comp.Circle;
import com.nt.comp.Shape;
import com.nt.factory.ShapeFactory;

public class FlyWeightDPSolutionTest {

	public static void main(String[] args) {
		Shape shape=null;
		shape=ShapeFactory.getShape("circle");
		for(int i=1;i<=500;++i){
			if(i%10==0)
			  shape.draw(i+1,"red","dotted");
			else if(i%100==0)
				shape.draw(i+1,"blue","dashed");
			else
				shape.draw(i+1, "black","bold");
		}//for
		System.out.println("......................................");
		shape=ShapeFactory.getShape("square");
		for(int i=1;i<=500;++i){
			if(i%10==0)
			  shape.draw(i+1,"red","dotted");
			else if(i%100==0)
				shape.draw(i+1,"blue","dashed");
			else
				shape.draw(i+1, "black","bold");
		}//for
	}//main
}//class
