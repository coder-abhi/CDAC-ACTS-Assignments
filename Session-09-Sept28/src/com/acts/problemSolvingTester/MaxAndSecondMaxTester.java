package com.acts.problemSolvingTester;

import com.acts.problemSolving.MaxAndSecondMax;
import java.util.Scanner;
public class MaxAndSecondMaxTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 7 Number's : ");
		int inputArray[] = new int[7]; 
		for(int i=0;i<7;i++) {
			inputArray[i] = sc.nextInt();
		}
		String ans = MaxAndSecondMax.FindMaxSecondMax(inputArray);
		System.out.println(ans);
		sc.close();

	}

}
