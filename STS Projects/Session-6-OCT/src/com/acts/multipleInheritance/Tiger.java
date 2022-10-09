package com.acts.multipleInheritance;
// we cannot extend more than one class
// an interface cannot implement another interface but an interface can extend another interface
public interface Tiger extends Animal {
	void sleep();
	default void walk() {
		System.out.println("Tiger walks");
	}
}
