package com.acts.Number;

import java.util.*;

public class AddBinary{
	
	public static void main( String[] args){
		
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter 2 binary numbers");
	String str1 = s1.next();
	String str2 = s1.next();

	int n1 = Integer.parseInt(str1,2);
	int n2 = Integer.parseInt(str2,2);
	
	int sum = n1+n2;
	String ans = Integer.toBinaryString(sum);
	System.out.println("Binary addition is  "+ans);
	
	System.out.println("Addition in Decimal : "+Integer.parseInt(ans,2));
	s1.close();
	
	}
}