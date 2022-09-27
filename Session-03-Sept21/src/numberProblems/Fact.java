package numberProblems;

import java.util.Scanner;

public class Fact{
	public static void main(String[] args){
		int num, fact=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number to calculate Factorial ");
		num= sc.nextInt();
			for(int i=num; i>=1 ; i--)
			{
			fact=fact*i;	
			}
			System.out.println("Factorial of "+ num + " is " + fact);
	}
	
}