package com.acts.Number;


public class Swap {
	 public static void main(String[] args) {

	        float first = 1.20f, second = 2.45f;

	        System.out.println("--Before swap--");
	        System.out.println("First number = " + first);
	        System.out.println("Second number = " + second);


	        float temp = first;
	        first = second;
	        second = temp;

	        System.out.println("--After swap--");
	        System.out.println("First number = " + first);
	        System.out.println("Second number = " + second);
	    }
}
