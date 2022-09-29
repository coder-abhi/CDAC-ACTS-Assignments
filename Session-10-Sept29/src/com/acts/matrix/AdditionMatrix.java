package com.acts.matrix;

public class AdditionMatrix {
	public static int[][] add(int[][] matrix1, int[][] matrix2,int n) {
		int result[][] = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				result[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		
		return result;
	}
}
