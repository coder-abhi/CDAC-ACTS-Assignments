package com.acts.complexNo;
import java.util.Scanner;
public class ComplexNoAdditionTester {

	public static void main(String[] args) {
		//reference if ComplexNumber
		ComplexNoAddition c1 = new ComplexNoAddition(5, 5); //Initialization
		System.out.println(c1);
		System.out.println(c1.getString());
		
		ComplexNoAddition c2 = new ComplexNoAddition(10, 20); //Initialization
		System.out.println(c2);
		System.out.println(c2.getString());
		
		ComplexNoAddition c3 = new ComplexNoAddition(1, 2); //Initialization
		
		ComplexNoAddition result = c1.add(c2);
		System.out.println(result.getString());
		
		ComplexNoAddition result1 = result.add(c3);
		System.out.println(result1.getString());
		
		ComplexNoAddition result2 = c1.add(c2).add(c3);
		System.out.println(result);
		
		ComplexNoAddition result3 = ComplexUtil.add(c1, c2);
		System.out.println(result2);
		
		System.out.println(ComplexNoAddition.getCount());
		
		
		
		
	}

}
