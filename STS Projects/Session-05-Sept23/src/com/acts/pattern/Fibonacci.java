package com.acts.pattern;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms of fibonacci: ");
		int n= sc.nextInt();
		int fib1=0,fib2=1,fibnext=0;
		System.out.println("Fibonacci Series upto "+ n+" terms: ");
		for(int i=1;i<=n;i++) {
			System.out.print(fib1+" ");
			fibnext=fib1+fib2;
			fib1=fib2;
			fib2=fibnext;
		}
	}

}