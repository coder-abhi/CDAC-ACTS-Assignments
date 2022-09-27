package numberProblems;

import java.util.Scanner;

public class OddEven{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num= sc.nextInt();
	System.out.println(num);
	if(num%2 ==0)
			System.out.println(num +" is Even Number");
		else 
			System.out.println(num +" is odd Number");	
	}	
}