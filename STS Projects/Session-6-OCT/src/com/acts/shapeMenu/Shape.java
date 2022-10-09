package com.acts.shapeMenu;

public interface Shape {
	double PI= Math.PI;
	double calcArea();
	double calcPerimeter();

	default void draw() { 
		System.out.println("Shape Drawn");

	}
}

