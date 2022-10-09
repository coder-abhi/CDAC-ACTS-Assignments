package com.acts.generic;

import java.util.Collection;

public class GenericTester {
	public static void main(String[] args) {
		
		GenericType<Integer> type = new GenericType<>(10);
		type.setNum1(20);
		System.out.println(type);
		
		GenericType<Double> type1 = new GenericType<>(10.20);
		System.out.println(type1);
		type1.setNum1(20.10);
		System.out.println(type1);
		
		GenericType<String> type2 = new GenericType<>("Hi");
		System.out.println(type2);
		type2.setNum1("How are you today");
		System.out.println(type2);

	}
}