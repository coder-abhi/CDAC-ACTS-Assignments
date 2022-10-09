package com.acts.shapeMenu;

public class Rectangle implements Shape{
	private double length;
	private double breadth;
	
	public Rectangle(double length, double breadth) { // Tight Encapsulation i.e. object cannot be created without passing field as there is no default constructor
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", Area =" + calcArea() + ", Perimeter ="
				+ calcPerimeter() + "]";
	}

	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public double calcArea() {
		return length*breadth ;
	}

	@Override
	public double calcPerimeter() {
		return 2*(length + breadth);
	}
	

}
