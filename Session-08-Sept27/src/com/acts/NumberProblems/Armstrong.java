package com.acts.NumberProblems;

import java.util.*;
public class Armstrong {
	public static void main(String [] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter a number");
		int n = sc.nextInt();
		int count = 0;

		int num=n,u=0;
		double sq=0;
		while(n>0) {
			u=n%10;
			sq=sq+Math.pow(u,count);
			n=n/10;
		}
		if(sq==num){
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
	}
}