package com.acts.pattern;

import java.util.Scanner;

public class FactorialRecursion {
	public static int factorial(int n) {
		if(n==1) {
			return 1;
		}		
		return n*(factorial(n-1));

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		System.out.println("Factorial is: "
				+ FactorialRecursion.factorial(num));
	}
}