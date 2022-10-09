package com.acts.assosiation;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of students: ");
		int n = sc.nextInt();

		Student[] St = new Student[n];
		for(int i=0; i<St.length; i++ ) {
			System.out.println("Enter details : Name , RollNo , Course");
			St[i] =new Student (sc.next(), sc.nextInt(), sc.next());

		}

		for(int i=0; i<St.length; i++ ) {
			System.out.println(St[i].getString());
		}
		System.out.println("Enter the roll number to be searched");
		int roll = sc.nextInt();

		System.out.println(Student.searchRoll(St , roll));
		sc.close();
	}

}
