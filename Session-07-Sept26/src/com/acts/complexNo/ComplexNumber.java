package com.acts.complexNo;

import java.util.Scanner;

public class ComplexNumber {

	private int real;
	private int img;


	public ComplexNumber() {
		System.out.println("Default Constructor Called"); 
		real = 0;
		img = 0; 
	}


	public ComplexNumber(int i, int j) {
		System.out.println(" Parameterized Constructor Called"); 
		real = i;
		img = j; 
	}


	public void accept() { 
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n Please enter Real:"); 
		real = scanner.nextInt();

		System.out.println("\n Please enter Imaginary:"); 
		img = scanner.nextInt();
		scanner.close(); 
	}

	public String getString() {
		System.out.println(this);
		return "\n ComplexNumber[ real:" + real + ",img:" + img +"]";
	}
}