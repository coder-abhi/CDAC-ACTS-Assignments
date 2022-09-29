package com.acts.matrix;
import java.util.Arrays;
import java.util.Scanner;
public class MatrixMethods {
	public static int[][] CreateMatrix(int m,int n) {
		int[][] newMatrix = new int[m][n];
		System.out.println("Enter Matrix of "+m+" X "+n);
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				newMatrix[i][j] = sc.nextInt();
			}
		}
//		sc.close();
		return newMatrix;
	}
	
	public static void PrintMatrix(int[][] matrix,int m) {
		for(int i=0;i<m;i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
}
