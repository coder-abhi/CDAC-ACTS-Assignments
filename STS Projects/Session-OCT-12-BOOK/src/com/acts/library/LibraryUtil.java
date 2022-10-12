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
		sc.nextLine();
		
		Person member = new Person(personCount++,name);

		return member;
	}
	
	public static Person addBook () {
		

		System.err.println("Enter Book Name ");
		String name = sc.nextLine();
		
		sc.nextLine();
		
		Person member = new Person(personCount++,name);

		return member;
	}
	
}
