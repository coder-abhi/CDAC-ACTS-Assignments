package com.acts.pattern;
import java.util.*;
public class PrintUsingLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number of terms to be printed : ");
		int n = sc.nextInt();
		for(int i = 1 ; i<= n ; i++ )
			System.out.print(i+" ");

	}

}