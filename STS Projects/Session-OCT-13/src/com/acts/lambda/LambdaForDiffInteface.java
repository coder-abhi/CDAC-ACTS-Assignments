package com.acts.lambda;

import java.util.function.Predicate;

public class LambdaForDiffInteface {
	public static void main(String[] args) {

		Runnable rn = ()-> System.out.println("Runnable is running");
		rn.run();
		
//		Producer pr = ()-> sysout;
		Predicate<Boolean> pred= (charecter)-> charecter.equals('A');
		//
	}
}
