package com.acts.matrixTester;
import com.acts.matrix.MatrixMethods;
import com.acts.matrix.MultiplicationMatrix;
import com.acts.matrix.AdditionMatrix;
public class AdditionMatrixTester {

	public static void main(String[] args) {
		
		int arr[][] = MatrixMethods.CreateMatrix(2, 3);
		
		int arr2[][] = MatrixMethods.CreateMatrix(3, 2);
		
		
		MatrixMethods.PrintMatrix(arr, 2);
		MatrixMethods.PrintMatrix(arr2, 3);
		
		int additionMatrix[][] = MultiplicationMatrix.MultiplyAsymmetric(arr, arr2, 2,3);
		System.out.println("Addition of Matrix will be : ");
		MatrixMethods.PrintMatrix(additionMatrix, 2);

	}

}

/*
11 10 10
9 5 5
10 20 20

1 1 1
2 2 2
3 3 3


0 1 2
1 2 3

1 2
2 3
4 4
 */
