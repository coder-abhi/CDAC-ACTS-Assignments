package numberProblems;

import java.util.Scanner;

public class MaxNo{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter three numbers");
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		
		if(a>b && a>c)
			System.out.println(a+ "  is biggest number");
		else if (b>c)
			System.out.println(b+ "  is biggest number");
		else
			System.out.println(c+ "  is biggest number");		
	}
	
}