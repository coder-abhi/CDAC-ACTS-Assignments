package com.acts.assosiation;

import static java.lang.System.out;
import java.util.Scanner;

public class StudentAssociationTesterV2 {
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
    out.println("Enter number of students");
	int size = sc.nextInt();
	
	Student[] Std = new Student[size]; 
	Address[] add = new Address[size];

	out.print("Enter Details of Student: \n");
	for(int i=0; i< Std.length ;i++) {
		out.println("\nStudent "+(i+1)+  "  : RollNo , Name , Course");
		add[i] = new Address();
		Std[i] = new Student(sc.nextInt(),sc.next(),sc.next(), add[i]);	//passing blank space in address 
	}

	System.out.println("\nEnter the address of students : HouseNo, LaneNo, Area, Pincode");
	for(int i=0; i<add.length; i++) {
		System.out.println("\nStudent "+ (i+1) );
		add[i].setHouseNo(sc.next());
		add[i].setLaneNo(sc.next());
		add[i].setArea(sc.next());
		add[i].setPinCode(sc.next());

	}
	for(int i=0; i< Std.length ; i++) {
		System.out.println(Std[i].getString());
	}

}
}
