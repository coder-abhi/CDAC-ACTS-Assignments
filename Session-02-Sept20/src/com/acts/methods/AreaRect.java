package com.acts.methods;

import java.util.Scanner;

public class AreaRect{
	public static void main(String[] args){
		double l,b,area;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length and breadth of rectangle");
		l= sc.nextDouble();
		b= sc.nextDouble();

		area= l*b;
		System.out.printf("Area of Rectangle =  %.2f", area);

	}
}