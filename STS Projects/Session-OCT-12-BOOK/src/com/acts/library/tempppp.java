package com.acts.library;

import java.time.LocalDate;

public class tempppp {

	public static String name = "Abhi";
	public static void main(String[] args) {
		
		tempppp tp = new tempppp();
		System.out.println(tp.name);
		
		LocalDate date = LocalDate.parse("2022-10-08");
		LocalDate date2 = LocalDate.parse("2022-10-01");
		System.out.println(date.compareTo(date2));
	}

}
