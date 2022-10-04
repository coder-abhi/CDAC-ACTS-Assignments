package com.acts.objArray;

public class StudentDatabase {
	String name;
	int rollNo;
	String course;
	int age;

	// Default Constructor
	
	public StudentDatabase() {
		name = "(No Name Entered)";
		rollNo = 0;
		course = "";
		age = 0;
	}

	// Parametarized Constructor
	public StudentDatabase(String name,int rollNo, String course,int age) {
		this.name = name;
		this.rollNo = rollNo;
		this.course = course;
		this.age = age;
	}

	public static void SearchStudent(StudentDatabase[] student, int roll) {
		
		boolean flag = true;
		
		for(int i=0;i< student.length; i++) {
			if(student[i].rollNo == roll) {
				flag = false;
				student[i].PrintObject();
			}
		}
		if(flag) System.out.println("Student Not Found !!!");
	}

	public static void SearchStudent(StudentDatabase[] studentList, String name) {
		boolean flag = true;
		for(int i=0;i< studentList.length; i++) {
			if(studentList[i].name.equals(name)) {
				flag = false;
				studentList[i].PrintObject();
			}
		}

		if(flag) System.out.println("Student Not Found !!!");

	}
	
	public String getStudent() {
		return "Name : "+this.name+"\nRoll No : "+this.rollNo+"\tCourse Name : "+this.course+"\tAge : "+this.age;
	}
	
	
	public void PrintObject() {
		System.out.println("Name : "+this.name+"\nRoll No : "+this.rollNo+"\tCourse Name : "+this.course+"\tAge : "+this.age);
	}
	
	

}
