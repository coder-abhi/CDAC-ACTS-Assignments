package com.acts.staticBlock;

public class StaticNonStatic {
	{
		System.out.println("THis is in Non Static Blok ! ");
	}
	static {
		System.out.println("This is in Static Blockkk !!! ");
	}
	public StaticNonStatic() {
		System.out.println("This is in Contructor # ");
	}
}
