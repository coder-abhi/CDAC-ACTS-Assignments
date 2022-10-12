package com.acts.comparator;

import java.time.LocalDate;
import java.util.Scanner;

public class Student {
	String name;
	int roll;
	LocalDate DOB;
	Adress adress;
	Division division;
	public Student(String name, int roll,Division division ,LocalDate dOB, Adress adress) {
		super();
		this.name = name;
		this.roll = roll;
		DOB = dOB;
		this.adress = adress;
		this.division = division;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", DOB=" + DOB + ", adress=" + adress + ", division="
				+ division + "]";
	}

}