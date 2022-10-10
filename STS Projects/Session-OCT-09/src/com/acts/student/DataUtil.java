package com.acts.student;

import java.time.LocalDate;
import java.util.List;

public class DataUtil {
	public static void studentDefaultList(List<Student> studentList) {
		LocalDate date = LocalDate.parse("1999-08-13");
		LocalDate date1 = LocalDate.parse("1995-05-15");
		LocalDate date2 = LocalDate.parse("2000-11-09");
		LocalDate date3 = LocalDate.parse("1998-06-11");
		LocalDate date4 = LocalDate.parse("2001-08-12");
		studentList.add(new Student(005,"Abhi",date,Course.DAC));
		studentList.add(new Student(002,"Ajay",date1,Course.IOT));
		studentList.add(new Student(001,"Rohit",date2,Course.DESD));
		studentList.add(new Student(004,"Dhoni",date3,Course.DITISS));
		studentList.add(new Student(800,"Ramesh",date4,Course.DESD));

	}
}

