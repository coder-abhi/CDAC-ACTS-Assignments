package com.acts.methods;

import java.util.Scanner;

public class BasePow{
	public static void main(String[] args){
		double base,power,ans;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Base and Power of rectangle");
		base= sc.nextDouble();
		power= sc.nextDouble();

		ans= Math.pow(base, power);
		System.out.printf("%.2f to the power of %.2f is = %.2f", base, power, ans);

	}
}