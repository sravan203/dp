package com.nt.comp;

public class Square implements Shape {
	private String label; //instrinsic state
	
	
	public Square(){
		label = "square";
		System.out.println("Square::0-param constructor");
	}

	
	@Override          // all params are extrinsic state
	public void draw(int side, String fillColor, String lineStyle) {
		System.out.println("Drawing square with Label="+label+" ,side="+side+" fillColor="+fillColor+" lineStyle="+lineStyle);
		
	}

}
