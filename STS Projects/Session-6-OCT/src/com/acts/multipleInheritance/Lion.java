package com.acts.multipleInheritance;

public interface Lion extends Animal {
	void roar();
	default void walk() {
		Animal.super.walk();
		System.out.println("Lion walks");
		
	}

}
