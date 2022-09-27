package com.acts.classObj;

public class ConstructorChaining {
	int num1;
	int num2;
	public ConstructorChaining() {
		this(0,0);
		System.out.println("Contructor is created in simple Constructor !");
	}
	public ConstructorChaining(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("Parametarized consructor is executed !");
	}
	
	public void PrintObject() {
		System.out.println("Num1 and Num2 of this obj : "+num1+" and "+num2);
	}
}
