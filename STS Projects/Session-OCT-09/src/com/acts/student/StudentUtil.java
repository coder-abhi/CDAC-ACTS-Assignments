package com.acts.student;

import java.time.LocalDate;
import java.util.Scanner;

public class StudentUtil {
	static Scanner sc = new Scanner(System.in);
	public static Student addStudent () {

		System.err.println("Enter student details ");

		System.out.println("Enter Roll Number: ");
		int rollNo = sc.nextInt();

		System.out.println("Enter Name:");
		String name = sc.next();

		System.out.println("Enter Date Of Birth in yyyy-mm-dd format:");
		String dobStr = sc.next();

		System.out.println("Enter Course:");
		String courseStr = sc.next();

		System.err.println("Enter address details ");
		System.out.println("Enter houseNo");
		String houseNo = sc.next();
		

		System.out.println("Enter laneNo");
		String laneNo = sc.next();


		System.out.println("Enter area");
		String area = sc.next();

		System.out.println("Enter pinCode");
		String pinCode = sc.next();

		LocalDate date = DataValidator.dateValidator(dobStr);
		Course course = DataValidator.courseValidator(courseStr);

		Address address  = new Address (houseNo,laneNo, area, pinCode);
		Student st = new Student(rollNo,name,date,course);

		return st;
	}
}
