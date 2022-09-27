package com.acts.methods;

import java.util.Scanner;

public class Fibo{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	int a1=0,a2=1, n, sum;
	System.out.println("Enter number to print Fibonnaci series");
	n=sc.nextInt();
	System.out.print(a1 +" "+a2 );
	for(int i=2; i<n; i++)
		{
			sum=a1+a2;
			System.out.print( " " + sum );
			a1=a2;
			a2=sum;
			sum=0;
		}
	
	}
}