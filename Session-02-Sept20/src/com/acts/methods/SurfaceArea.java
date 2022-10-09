package com.acts.methods;

public class SurfaceArea {
	double radius;

	public SurfaceArea(double radius){
		this.radius = radius;
	}


	double area(){
		return 4*3.14*(radius * radius);
	}

}