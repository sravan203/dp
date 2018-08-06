package com.nt.comp;

public class Circle implements Shape {
	private String label;
	private float radius;
	private String fillColor;
	private  String lineStyle;
	
	public Circle(String label, float radius, String fillColor, String lineStyle) {
		System.out.println("Circle::4-param constructor");
		this.label = label;
		this.radius = radius;
		this.fillColor = fillColor;
		this.lineStyle = lineStyle;
	}

	@Override
	public void draw() {
	  System.out.println("Drawing circle with Label="+label+" ,radius="+radius+" fillColor="+fillColor+" lineStyle="+lineStyle);

	}

}
