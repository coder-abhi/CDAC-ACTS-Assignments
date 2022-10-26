package utils;

import java.sql.Date;
import java.time.LocalDate;

import employee.Title;

public class ValidateUtils {

	public static Title enumValidator(String t) {
		try {
			Title title = Title.valueOf(t);
			return title;
		}
		catch(Exception e) {
			System.out.println("Wrong Enum Input");
			e.printStackTrace();
		}
		return null;
	}

	public static LocalDate dateValidator(String d) {

		LocalDate now = LocalDate.now();
		LocalDate date = LocalDate.parse(d);
		try {
			if(date.isBefore(now)) {
				return date;
			}
		}
		catch(Exception e) {
			System.out.println("Wrong date input");
			e.printStackTrace();
		}
		return null;
	}
}
