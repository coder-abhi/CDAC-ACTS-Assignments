package com.acts.complexNumber;

public class ComplexNumber {
	
	private int real;
	private int img;
	
	ComplexNumber() {
		real = 0;
		img = 0;
	}
	
	ComplexNumber(int a, int b) {
		real = a;
		img = b;
	}
	
	public String getString() {
		return ("Complex Number= "+ real + " + "  + img+ "i");
	}
	
	public ComplexNumber add(ComplexNumber x) {
		ComplexNumber y = new ComplexNumber();
		y.real = this.real + x.real;
		y.img = this.img + x.img;
		return y;
	}
}
