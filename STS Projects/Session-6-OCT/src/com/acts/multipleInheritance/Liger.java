package com.acts.multipleInheritance;
// a class can implement multiple interface
public class Liger implements Lion,Tiger {

	@Override
	public void roar() { // overridden of lion
		System.out.println("Liger Roars");
		
	}
	@Override
	public void sleep() { // overridden of tiger
		System.out.println("Liger Sleeps");
	}
	@Override
	public void walk() { 
		Lion.super.walk(); //resolve the diamond problem 
	}

}
