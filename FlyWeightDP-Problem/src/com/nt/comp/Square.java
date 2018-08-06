package com.nt.comp;

public class Square implements Shape {
	private String label;
	private float side;
	private String fillColor;
	private  String lineStyle;
	
	public Square(String label, float side, String fillColor, String lineStyle) {
		System.out.println("Circle::4-param constructor");
		this.label = label;
		this.side = side;
		this.fillColor = fillColor;
		this.lineStyle = lineStyle;
	}

	@Override
	public void draw() {
	  System.out.println("Drawing Square with Label="+label+" ,side="+side+" fillColor="+fillColor+" lineStyle="+lineStyle);
	}

}
