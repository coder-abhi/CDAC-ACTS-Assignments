// Program to understand Array of Objects
package com.acts.assosiation;

public class Student {
	private static final String DEFAULT_VALUE = "" ; 
	private String name;
	private int rollno;
	private String course;

	public Student(int i, String string, String string2, Address address) {
		this.name = DEFAULT_VALUE;
		this.rollno = 0;
		this.course = DEFAULT_VALUE;
	}

	public Student(String name, int rollno, String course) {
		this.name = name;
		this.rollno = rollno;
		this.course = course;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public static String getDefaultValue() {
		return DEFAULT_VALUE;
	}

	public String getString() {
		return " Student Info : "+
				" Name : " + this.name +
				" Roll No: " + this.rollno +
				" Course:  " + this.course ;			
	}

	public static String searchRoll(Student[] stud, int roll) {
		for(int i=0; i<stud.length; i++ ) {
			if(roll == stud[i].rollno) {
				return "Student Found" + "Details \n "+stud[i].getString();
			}
		}
		return "Student Not Found";

	}

	public void setAddress(Address address) {
		// TODO Auto-generated method stub
		
	}
}
