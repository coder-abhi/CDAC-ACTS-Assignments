package com.acts.InternShala;

import java.time.LocalDate;

public class DataValidator {

	public static boolean validatDate(String date) {
		LocalDate dob = null;
				try {
					dob = LocalDate.parse(date);									
				}catch(Exception e) {
					System.out.println("Formate of Date is Wrong ! Please enter in YYYY-MM-DD formate");
					return false;
				}
			LocalDate TodayDate = LocalDate.now();
			
			TodayDate = TodayDate.minusYears(18);
			
			if (dob.isBefore(TodayDate)) {
				return true;
			}
			else {
				System.out.println("Enter Valid date (You cant enter Future Date !)");
			}
			return false;
		}	
	
	public static boolean isPhoneValid(String phoneNo) {
		if(phoneNo.length() != 10) {
			System.err.println("Phone Number length should be 10 !");
			return false;
		}
		try {
			Long phoneNoLong = Long.parseLong(phoneNo);
		} catch(Exception e) {
			System.err.println("Invalid Phone No !!! Try again");
			return false;
		}
		return true;
	}
	

}
