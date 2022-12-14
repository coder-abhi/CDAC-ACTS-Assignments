package com.acts.matrix;

public class MultiplicationMatrix {
	public static int[][] Multiply(int[][] matrix1, int[][] matrix2,int n) {
		int result[][] = new int[n][n];
		
		int tempAdd;
		for(int i=0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				tempAdd = 0;
				for(int k=0;k<n;k++) {
					tempAdd += (matrix1[i][k] * matrix2[k][j]);					
				}
				result[i][j] = tempAdd;
			}
		}
		
		return result;
	}
	public static int[][] MultiplyAsymmetric(int[][] matrix1, int[][] matrix2,int n,int len) {
		int result[][] = new int[n][n];
		
		int tempAdd;
		for(int i=0;i<n;i++) {
			for(int j = 0;j<n;j++) {
				tempAdd = 0;
				for(int k=0;k<len;k++) {
					tempAdd += (matrix1[i][k] * matrix2[k][j]);					
				}
				result[i][j] = tempAdd;
			}
		}
		
		return result;
	}
}

/*
1 2 2
2 2 3
3 3 1

2 2 4
4 4 2
3 3 3
*/