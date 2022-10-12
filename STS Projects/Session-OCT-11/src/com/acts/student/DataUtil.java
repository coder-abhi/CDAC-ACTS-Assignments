package com.acts.student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DataUtil {
	public static void studentDefaultList(Set<Student> studentSet) {
		LocalDate date = LocalDate.parse("1999-08-13");
		LocalDate date1 = LocalDate.parse("1995-05-15");
		LocalDate date2 = LocalDate.parse("2000-11-09");
		LocalDate date3 = LocalDate.parse("1998-06-11");
		LocalDate date4 = LocalDate.parse("2001-08-12");
		Set<Address> addressList = new HashSet<Address>();
		addressList.add(new Address("Pune","Lane2","line3","413411"));
		addressList.add(new Address("Pune","Lane2","line3","413411"));
		studentSet.add(new Student(005,"Abhi",date,Course.DAC,addressList));
		studentSet.add(new Student(002,"Ajay",date1,Course.IOT,addressList));
		studentSet.add(new Student(001,"Rohit",date2,Course.DESD,addressList));
		studentSet.add(new Student(004,"Dhoni",date3,Course.DITISS,addressList));
		studentSet.add(new Student(800,"Ramesh",date4,Course.DESD,addressList));

	}
}

