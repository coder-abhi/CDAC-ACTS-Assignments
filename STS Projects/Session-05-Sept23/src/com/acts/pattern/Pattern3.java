package com.acts.pattern;
import java.util.*;
public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt(); 
        for (int i=0; i<n ; i++) {
        	for(int j=n; j>i; j--) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}

}
