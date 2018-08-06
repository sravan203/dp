package com.nt.test;

import com.nt.comp.Circle;
import com.nt.comp.Shape;

public class FlyWeithDPProblemTest {

	public static void main(String[] args) {
		Shape shape=null;
		for(int i=1;i<=500;++i){
			shape=new Circle("circle",i+10,"red","dashed");
			shape.draw();
		}
		

	}

}
