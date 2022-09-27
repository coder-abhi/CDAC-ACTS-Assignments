package numberProblems;

import java.util.Scanner;

public class Armstrong{
	public static void main(String[] args){
		String str;
		int num;
		double r,q, ans=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number to check for Armstrong ");
		str= sc.next();
		num=Integer.parseInt(str);
		for(int i= str.length()-1; i>=0 ; i--)
		{
			r=num%10;
			q=num/10;
			ans=ans+Math.pow(r,str.length());
			num=(int)q;
		}

		if(ans==Integer.parseInt(str))
				System.out.println(str + " is Armstrong Number");
			else
				System.out.println(str + " is not Armstrong Number");			

	}
	
}

/*import java.util.Scanner;

public class Armstrong{
	public static void main(String[] args){
		String str;
		int num;
		double r,q, ans=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number to check for Armstrong ");
		str= sc.next();
		num=Integer.parseInt(str);
		for(int i= str.length()-1; i>=0 ; i--)
		{
			r=num%10;
			q=num/10;
			ans=ans+Math.pow(r,str.length());
			num=(int)q;
		}

		if(ans==Integer.parseInt(str))
				System.out.println(str + " is Armstrong Number");
			else
				System.out.println(str + " is not Armstrong Number");			

	}
	
}*/