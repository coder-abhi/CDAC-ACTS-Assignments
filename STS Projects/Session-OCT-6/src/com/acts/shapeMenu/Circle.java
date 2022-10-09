package com.acts.shapeMenu;

public class Circle implements Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		return PI*radius*radius;
	}

	@Override
	public double calcPerimeter() {
		return 2*PI*radius;
	}
	
	@Override
	public void draw( ) {
		System.out.println("Circle drawn");
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", Area =" + calcArea() + ", Perimeter=" + calcPerimeter() + "]";
	}
	
	

}
