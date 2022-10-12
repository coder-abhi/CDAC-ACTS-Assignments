package com.acts.InternShala;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.InputVerifier;

import com.acts.student.Address;

public class CandidateUtil {
	static Scanner sc = new Scanner(System.in) ;
	public static Candidate addCandidate() {
		ArrayList<Address> addressList = new ArrayList<Address>();
		
		System.out.println("Enter Candidate Regisrtation No");
		int regNo = sc.nextInt();
		
		System.out.println("Enter Candidate name");
		String name = sc.next();
		
		System.out.println("Enter Candidate Email");
		String email = sc.next();
		
		System.out.println("Enter Candidate Password");
		String pass = sc.next();
		
		System.out.println("Enter Candidate Date of Birth");
		
		String inputDOB;
		
		do {
			inputDOB = sc.next();
		}while(DataValidator.validatDate(inputDOB));
		
		LocalDate DOB = LocalDate.parse(inputDOB);

		// Validating is Phone Number
		System.out.println("Enter Phone No : ");
		String phoneNo;
		do {
			phoneNo = sc.next();			
		}while(!DataValidator.isPhoneValid(phoneNo));
		
		System.out.println("Enter Candidate Adhaar");
		
		Long adhaar = sc.nextLong();
		
		System.out.println("Enter Candidate Date of Graduation");
		
		LocalDate graduateDate = DataValidator.validatDate(sc.next());
		// Getting Multiple address
//		Address address;
//		do {
//			address = StudentUtil.getAddress();
//			addressList.add(address);
//			System.out.println("Do you want to add adress ? Y/N");
//		}while(sc.next().equals("Y"));


//		Address ad = new Address(houseNo,laneNo,area,pinCode);
		Candidate emp = new Candidate(regNo, name, email, pass, DOB, adhaar);
		return emp; 
				
		
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
