package com.acts.student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;


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


	@Override
	public int hashCode() {
		return Objects.hash(addressList, course, dob, name, rollNo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(addressList, other.addressList) && course == other.course
				&& Objects.equals(dob, other.dob) && Objects.equals(name, other.name)
				&& Objects.equals(rollNo, other.rollNo);
	}


	public Student(int rollNo, String name, LocalDate dob, Course course,ArrayList<Address> addressList) {
		this.rollNo = rollNo;
		this.name = name;
		this.dob = dob;
		this.course = course;
		this.addressList = addressList;
	}
	
	public void addInAdressList(Address address) {
		this.addressList.add(address);
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


	public ArrayList<Address> getAddressList() {
		return addressList;
	}


	public void setAddressList(ArrayList<Address> addressList) {
		this.addressList = addressList;
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