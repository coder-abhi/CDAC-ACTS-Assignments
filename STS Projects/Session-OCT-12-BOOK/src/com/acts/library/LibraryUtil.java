package com.acts.library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LibraryUtil {
	
	public static Integer personCount = 21;
	public static Integer bookCount = 1006;
	
	static Scanner sc = new Scanner(System.in);
	
	public static Person addMember () {
		
		System.err.println("Enter Person Name ");
		String name = sc.nextLine();
//		sc.nextLine();
//		sc.nextLine();
		
		// Setting Password
		String pass;
		String passCheck;
		
		do {
			System.out.println("Create New Password");
			pass = sc.next();
			
			System.out.println("Type your password again ");
			passCheck = sc.next();	
			if(!pass.equals(passCheck)) System.err.println("2 Passwords Didn't Match");
			
		}while(!pass.equals(passCheck));
		
		Person member = new Person(personCount++,name,pass);

		return member;
	}
	
	public static Book addBook () {
		

		System.out.println("Enter Book Name ");
		String name = sc.nextLine();
//		sc.nextLine();
		System.out.println("Enter Book Author ");
		String author = sc.nextLine();
//		sc.nextLine();
		System.out.println("Enter Book Quantity ");
		int qty = sc.nextInt();
		
		
		Book book = new Book(bookCount++,name,author,qty);

		return book;
	}
	
}
