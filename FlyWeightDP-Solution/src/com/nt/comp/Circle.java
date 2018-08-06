package com.nt.comp;

public class Circle implements Shape {
	private String label; //instrinsic state
	
	
	public Circle(){
		label = "circle";
		System.out.println("Circle::0-param constructor");
	}

	
	@Override
	public void draw(int radius, String fillColor, String lineStyle) {
		System.out.println("Drawing circle with Label="+label+" ,radius="+radius+" fillColor="+fillColor+" lineStyle="+lineStyle);
		
	}

}
