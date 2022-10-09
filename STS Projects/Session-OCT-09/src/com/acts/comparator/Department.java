package com.acts.comparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Department {
	public static ArrayList<Student> studentList = new ArrayList<Student>();


	static Scanner sc = new Scanner(System.in);
	
	public static void addStudent() {
		System.out.println("Enter Name : ");
		String name = sc.next();
		System.out.println("Enter Roll NO : ");
		int roll = sc.nextInt();
		
		
		LocalDate date = null;
		do {

			try {
				System.out.println("Enter Date Of Birth in YYYY-MM-DD formate");
				date = LocalDate.parse(sc.next());
			} catch (IllegalArgumentException e) {
				System.out.println("Enter Valid Input !");
			}
			
		}while(date == null);
		
		
		System.out.println("Enter Adresss Lane1: ");
		String adressLane1 = sc.next();
		
		System.out.println("Enter Adresss Lane2: ");
		String adressLane2 = sc.next();

		Division div = null;
		do {

			try {
				System.out.println("Enter Course : ");
				div = Division.valueOf(sc.next());
			} catch (IllegalArgumentException e) {
				System.out.println("Enter Valid Input !");
			}
			
		}while(div == null);
		
		studentList.add(new Student(name, roll, div,date ,new Adress(adressLane1, adressLane2)));
	}
	
	public static void showStudent() {
		for(Student st : studentList) {
			System.out.println(st.toString());
		}
	}
	
	public static void addDefaultStudent() {
		studentList.add(new Student("Deepesh", 69, Division.DAC,LocalDate.parse("1999-11-11") ,new Adress("Banaras", "Near Pune")));
		studentList.add(new Student("Bhushan", 65, Division.DAC,LocalDate.parse("1999-10-10") ,new Adress("Nashik", "Near Pune")));
		studentList.add(new Student("Bhavesh", 81, Division.DBDA,LocalDate.parse("2000-11-15") ,new Adress("Maharashtra", "Near India")));
		studentList.add(new Student("Suresh", 99, Division.IOT,LocalDate.parse("1998-11-11") ,new Adress("Mumbai", "Near Sea")));
		studentList.add(new Student("Ramesh", 44, Division.DAC,LocalDate.parse("1997-08-11") ,new Adress("Solapur", "Near Barshi")));
	}

}
