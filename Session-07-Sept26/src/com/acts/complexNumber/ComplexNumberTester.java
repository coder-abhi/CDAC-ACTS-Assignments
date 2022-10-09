package com.acts.complexNumber;

public class ComplexNumberTester {

	public static void main(String[] args) {
		ComplexNumber c1 = new ComplexNumber(10,20);
		System.out.println("First ComplexNumber");
		System.out.println(c1.getString());
		ComplexNumber c2 = new ComplexNumber(11,21);
		System.out.println("Second ComplexNumber");
		System.out.println(c2.getString());
		ComplexNumber c3 = new ComplexNumber(12,22);
		System.out.println("Third ComplexNumber");
		System.out.println(c3.getString());
		ComplexNumber c4 = new ComplexNumber(13,23);
		System.out.println("Fourth ComplexNumber");
		System.out.println(c4.getString());
		ComplexNumber result = new ComplexNumber();
		result = c1.add(c2).add(c3).add(c4);
		System.out.println("Resultant Complex Number");
		System.out.println(result.getString());
		
		}

}
