package com.acts.student;

import java.time.LocalDate;
import java.util.ArrayList;


public class Student implements Comparable<Student> {
	
	public static final String EMPTY_STRING = "";
	
	private Integer rollNo;
	private String name;
	private LocalDate dob;
	private Course course;
	private ArrayList<Address> addressList;
	
	public Student() {
		this.rollNo = 0;
		this.name = EMPTY_STRING;
		this.dob= null;
		this.course = null;
		this.addressList =null;
	}


	public Student(int rollNo, String name, LocalDate dob, Course course) {
		this.rollNo = rollNo;
		this.name = name;
		this.dob = dob;
		this.course = course;
	}


	public Integer getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}



	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}
    
	@Override
	public int compareTo(Student o) {
		return this.rollNo.compareTo(o.rollNo);
	}

	@Override
	public String toString() {
		 return SFormat.strFormat(rollNo+"", 10) + SFormat.strFormat(name, 15) +
				SFormat.strFormat(dob.toString(), 20) +SFormat.strFormat(course+"", 15)+ addressList.toString();
	}

	
	

}