package com.swapnil;

public class Area extends Shape{

	@Override
	public int rectangleArea(int length, int breadth) {
		int area=2*(length*breadth);
		
		return area;
	}

	@Override
	public int squareArea(int side) {
		int area=4*side;
		
		return area;
	}

	@Override
	public int circleArea(int radius) {
		// TODO Auto-generated method stub
		int area=(int)(2*3.14*radius);
		return area;
	}

}
