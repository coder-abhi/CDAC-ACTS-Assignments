package com.acts.student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentUtil {
	static Scanner sc = new Scanner(System.in);
	public static Student addStudent () {
		
		Set<Address> addressList = new HashSet<Address>();

		System.err.println("Enter student details ");

		System.out.println("Enter Roll Number: ");
		int rollNo = sc.nextInt();

		System.out.println("Enter Name:");
		String name = sc.next();

		System.out.println("Enter Date Of Birth in yyyy-mm-dd format:");
		String dobStr = sc.next();

		System.out.println("Enter Course:");
		String courseStr = sc.next();


//		Address address  = getAddress();
//		addressList.add(address);

//		System.out.println("Is your residential and permanant adress same ? Y/N");
//		if(sc.next().equals("Y")) {
//			Address address2  = getAddress();
//			addressList.add(address2);
//		}
		do {
			Address address2 = StudentUtil.getAddress();
			addressList.add(address2);
			System.out.println("Do you want to add adress ? Y/N");
		}while(sc.next().equals("Y"));
		LocalDate date = DataValidator.dateValidator(dobStr);
		Course course = DataValidator.courseValidator(courseStr);

		Student st = new Student(rollNo,name,date,course,addressList);

		return st;
	}
	
	public static Address getAddress() {
		System.err.println("Enter address details ");
		System.out.println("Enter houseNo");
		String houseNo = sc.next();
		

		System.out.println("Enter laneNo");
		String laneNo = sc.next();


		System.out.println("Enter area");
		String area = sc.next();

		System.out.println("Enter pinCode");
		String pinCode = sc.next();
		
		return new Address(houseNo,laneNo, area, pinCode);
		
	}
}
