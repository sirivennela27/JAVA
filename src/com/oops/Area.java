package com.oops;

public class Area {
	public int lenght;
	public int breadth;
	
	public Area(int lenght, int breadth) {
		System.out.println("parametised constructor");
		this.lenght = lenght;
		this.breadth = breadth;
	}
	public void getArea()
	{
		int area=lenght*breadth;
		System.out.println("Area:"+ area); 
	}

	
	

}
