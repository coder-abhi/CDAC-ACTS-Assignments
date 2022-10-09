package com.acts.complexNo;
import java.util.Scanner;

public class ComplexNumberTester {

	public static void main(String[] args) {
		
		
		ComplexNumber c1 = new ComplexNumber(); 
		System.out.println(c1.getString());
		
		ComplexNumber c2 = new ComplexNumber(5,4); 
		System.out.println(c2.getString());

		Scanner scanner = new Scanner(System.in);
		System.out.println("\n Please enter real:"); 
		int i = scanner.nextInt();

		System.out.println("\n Please enter img:");
		int j = scanner.nextInt();

		ComplexNumber c3 = new ComplexNumber(i, j);
		System.out.println(c3);
		System.out.println(c3.getString());
		

		ComplexNumber c4 = c2; 
		System.out.println(c3);
		System.out.println(c3.getString());
		
		ComplexNumber c5;
		c4 = c1; 
		System.out.println(c4);
		System.out.println(c4.getString());
		
		scanner.close(); 
	}

}