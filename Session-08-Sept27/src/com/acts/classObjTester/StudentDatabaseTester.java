package com.acts.classObjTester;
import com.acts.classObj.StudentDatabase;
public class StudentDatabaseTester {

	public static void main(String[] args) {
		
		StudentDatabase obj = new StudentDatabase();
		System.out.println(obj.getStudent());

		StudentDatabase obj2 = new StudentDatabase("Abhi",95,"DAC",22);
		System.out.println(obj2.getStudent());

	}

}
