package com.acts.studentClassTester;

import com.acts.studentClass.Person;
import com.acts.studentClass.Student;

public class StudentTester {

	public static void main(String[] args) {
		
		// Simple Student Object Created
        Person p1;
		Student st1 = (Student) new Person();
//		st1.PrintStudent();
		
//		st1.canLearn();
//		st1.canWalk();
		
		// Simple Person Object Created
//		Person p1 = new Person();
//		p1.PrintName();
		
		// Up casting Child to Parent --- Type is Person but object is of Student
//		Person p2 = new Student();
//		p2.PrintName();
		
		
		// Downcasting Parent to Child --- DataType is Student but object is of Person
//		Student st2 = (Student) p2;
		
		
	}

}
