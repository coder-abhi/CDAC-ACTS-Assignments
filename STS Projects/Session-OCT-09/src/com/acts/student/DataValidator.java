package com.acts.student;

import java.time.LocalDate;

public class DataValidator {

	public static LocalDate dateValidator(String date) {
			LocalDate dob = LocalDate.parse(date);
			LocalDate check = LocalDate.now();
			check = check.minusYears(18);
			try {
			if (dob.isBefore(check)) {
				return dob;
			}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}	
	
	public static Course courseValidator(String cr) {
		try {
			Course course = Course.valueOf(cr);
			return course;
		}
		catch(IllegalArgumentException e) {
            e.printStackTrace();
		}
		return null;
	}
}
