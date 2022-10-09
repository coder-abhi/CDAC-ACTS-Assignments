package com.acts.shapeMenu;
public class ShapeTester {

	public static void main(String[] args) {
		Shape s1 = new Circle(10.2);
		System.out.println(s1.calcArea()); 
		System.out.println(s1.calcPerimeter());
		s1.draw();

		s1 = new Rectangle(10.2,20.2); 
		System.out.println(s1.calcArea()); //runtime polymorphism(line 7 & 11)
		System.out.println(s1.calcPerimeter());	 //runtime polymorphism(line 8 & 12)
		s1.draw();

	}

}
