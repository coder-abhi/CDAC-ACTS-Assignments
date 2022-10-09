package com.acts.InternShala;

import java.util.Scanner;

public class EmployeeUtil {
	public static Employee addEmp() {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter employee employeeNO");
		int empno = sc.nextInt();
		System.out.println("Enter employee name");
		String name = sc.next();
		System.out.println("Enter employee salary");
		double sal = sc.nextDouble();
		System.out.println("Enter employee department");
		String dept = sc.next();
		System.out.println("Enter employee houseNo");
		String houseNo = sc.next();
		System.out.println("Enter employee laneNo");
		String laneNo = sc.next();
		System.out.println("Enter employee area");
		String area = sc.next();
		System.out.println("Enter employee pinCode");
		String pinCode = sc.next();

		Address ad = new Address(houseNo,laneNo,area,pinCode);
		Employee emp = new Employee(empno,name,sal,dept,ad);
		return emp; 
				
		
	}

}
