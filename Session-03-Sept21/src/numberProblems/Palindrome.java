package numberProblems;

import java.util.Scanner;

public class Palindrome{
	public static void main(String[] args){
		String str, ans="";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String to check for Palindrome ");
		str= sc.next();
		for(int i= str.length()-1; i>=0 ; i--)
		{
			ans += str.charAt(i);
			
		}
		//System.out.println(ans);
		if(ans.equals(str))
				System.out.println(str + " is palindrome");
			else
				System.out.println(str + " is not palindrome");			

	}
	
}