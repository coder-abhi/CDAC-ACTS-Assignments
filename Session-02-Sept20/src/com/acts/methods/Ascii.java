package com.acts.methods;

import java.util.*;

public class Ascii{
	public static void main(String[] args){
		char ch;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Character");
		ch= sc.next().charAt(0);
		
//		System.out.println("Ascii value of" + ch + "is " + (int)ch);
				System.out.printf("Ascii value of %c is %d" , ch, (int)ch);

	
	}
}