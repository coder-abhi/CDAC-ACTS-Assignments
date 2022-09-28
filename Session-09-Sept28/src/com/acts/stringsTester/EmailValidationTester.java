package com.acts.stringsTester;
import com.acts.strings.EmailValidation;
import java.util.Scanner;
public class EmailValidationTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your String : ");
		String input = sc.next();
		
		if(EmailValidation.CheckEmail(input)) {
			System.out.println("Your String : "+input+" is Valid 👍");
		} else {
			System.out.println("Your String : "+input+" is not Valid !!!");

		}

	}

}
