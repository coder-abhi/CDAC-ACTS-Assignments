package com.acts.shapeMenu;

public class Square implements Shape {
	private double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	public double calcArea() {
		
		return side * side;
	}

	@Override
	public double calcPerimeter() {
		
		return 4 * side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + ", Area=" + calcArea() + ", Perimeter=" + calcPerimeter() + "]";
	}

	

}
