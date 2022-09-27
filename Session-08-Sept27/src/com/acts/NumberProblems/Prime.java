package com.acts.NumberProblems;

import java.util.*;
public class Prime {
	public static boolean isPrime(int n) {
		for(int i =2;i<n;i++)
		{
			if(n%i==0) {
				return false;
			}
			
		}
		return true;
	}
public static void main(String [] args) {
Scanner sc=new Scanner (System.in);
System.out.print("Enter a number");
int n = sc.nextInt();
for(int i=2;i<=n;i++)
{
	if(isPrime(i))
	System.out.print(i+" ");
}
}
}


