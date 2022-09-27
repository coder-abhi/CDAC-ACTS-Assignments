package numberProblems;

import java.util.Scanner;

public class FactRecursion{
	
	public static int recurse(int n){
		if(n==1)
			return 1;
		else
			return n*recurse(n-1);
		
	}
	public static void main(String[] args){
		int num, fact=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number to calculate Factorial ");
		num= sc.nextInt();
		fact=recurse(num);	
			System.out.println("Factorial of "+ num + " is " + fact);
	}
	
}