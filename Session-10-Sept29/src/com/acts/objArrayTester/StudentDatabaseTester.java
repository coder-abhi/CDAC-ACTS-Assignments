package com.acts.objArrayTester;

import java.util.Scanner;

import com.acts.objArray.StudentDatabase;

public class StudentDatabaseTester {

	public static void main(String[] args) {
		StudentDatabase[] student = new StudentDatabase[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("Enter Details of Student : "+(i+1)+"\t(as Name  ->  Roll No  ->  Course  ->  Age)");
			student[i] = new StudentDatabase(sc.next(),sc.nextInt(),sc.next(),sc.nextInt());
		}
		
//		student[0] = new StudentDatabase("Abhi",95,"DAC",22);
//		System.out.println(student[0].getStudent());
		
		StudentDatabase.SearchStudent(student, 55);
		System.out.println("Via String Name : ");
		StudentDatabase.SearchStudent(student, "Ajay");
		
		

	}

}
/*
Abhi 55 DAC 22
Ajay 10 DAC 21
*/