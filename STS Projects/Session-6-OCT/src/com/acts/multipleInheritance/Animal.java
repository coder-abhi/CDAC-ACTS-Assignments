package com.acts.multipleInheritance;
//Multiple inheritance in java can be achieved using interface
//one child cannot have more than one parent class
public interface Animal {
	default void walk() {
		System.out.println("Animal Walks");
	}
}

