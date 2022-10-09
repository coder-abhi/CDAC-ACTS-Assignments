package com.acts.Number;


import java.util.Scanner;

public class Compound_Interest {
	public static void main(String [] args){
		
		 	  double principle, rate, time, compoundInterest;
		 	  
		      Scanner sc = new Scanner(System.in);
		      
		      System.out.print("Enter a Principle number : ");
		      principle = sc.nextInt();
		      
		      System.out.print("Enter Interest rate : ");
		      rate = sc.nextInt();
		      
		      System.out.print("Enter a Time period in years : ");
		      time = sc.nextInt();
		      
		      compoundInterest = principle * (Math.pow((1 + rate / 100), time)) - principle;
		      
		      System.out.println("The Compound Interest is : " + compoundInterest);
		   
		
	}

}
