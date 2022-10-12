package com.acts.library;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;

import com.acts.student.Address;
import com.acts.student.DataUtil;
import com.acts.student.Formate;
import com.acts.student.Student;
import com.acts.student.StudentUtil;
import com.acts.student.SudentDashboard;

import java.util.Scanner;


public class StudentTester {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int choice = 0, ch = 0 ;
		DataUtil.studentDefaultList(SudentDashboard.studentSet);
		Student st = new Student();
		do {
			System.out.println("\n\n-------------MENU-------------");
			System.out.println(" "
					+	 "1. Add Student "
					+ "\n 2. Print Student "
//					+ "\n 3. Sort Students"
					+ "\n 4. Search student by roll number"
//					+ "\n 5. Remove particular student "
					+ "\n 6. Find and Change Adress"
					+ "\n 0. Exit menu ");

			System.out.println("Enter Choice: ");
			choice = sc.nextInt();

			switch(choice) {
			case 1: {
				st = LibraryUtil.addStudent();
				SudentDashboard.studentSet.add(st);
				break;
			}

			case 2: {
				System.out.println("Student Details");
				System.err.println(Formate.formate("Roll No.",10)+Formate.formate("Name", 15)
				+ Formate.formate("Date Of Birth",20)+Formate.formate("Course",15)+"Address(House No,Lane No,Area,Pincode)");
				for(Student st1 : SudentDashboard.studentSet) {
					System.out.println(st1.toString());
				}
				break;
			}
			case 4: {
				System.out.println("Enter the Roll no to be found : ");
				int reqNo = sc.nextInt();
				Student foundStudent = findStudent(SudentDashboard.studentSet,reqNo);
				if(foundStudent != null) {
					System.out.println("Student Found");					
				}
				else System.out.println("Student Not Found");					

				break;

			}


			case 5: {
				System.out.println("Enter the Roll no to be found : ");
				int reqRoll = sc.nextInt();
//				removeStudent(SudentDashboard.studentSet, reqRoll);
				break;
			}
			case 6: {
				System.out.println("Enter the Roll no to be found and Change Adress: ");
				int reqRoll = sc.nextInt();
				Student foundStudent = findStudent(SudentDashboard.studentSet,reqRoll);
				if(foundStudent == null) {
					System.out.println("Student not Found !!.");
					break;	
				}
				foundStudent.getAddressList().clear();

				do {
					Address address = LibraryUtil.getAddress();
					foundStudent.addInAdressList(address);
					System.out.println("Do you want to add adress ? Y/N");
				}while(sc.next().equals("Y"));

				break;
			}
			case 0: {
				System.exit(0);
				break;
			}
			default : {
				System.err.println("Wrong choice entered");
				break;
			}
			}
		}while(choice !=0);

	}

	public static Student findStudent(Set<Student> studentSet,int rollNo) {

		for(Student stSearch : SudentDashboard.studentSet) {
			if(stSearch.getRollNo() == rollNo) return stSearch;
		}
		return null;

	}
//	public static void removeStudent(Set<Student> studentSet,int rollNo) {
//
//		/*
//		 * This iterator will not remove element - it will give error ConcurrentModificationException
//		 * Because List is fast failed so when we use iterator over it , we can't do structural modification
//			for(Student stSearch : SudentDashboard.studentSet) {
//				if(stSearch.getRollNo() == rollNo) SudentDashboard.studentSet.remove(stSearch);
//			}
//
//		}
//		 */
//		for(int i=0 ; i<SudentDashboard.studentSet.size() ; i++) {
//			if(SudentDashboard.studentSet.get(i).getRollNo() == rollNo) {
//				SudentDashboard.studentSet.remove(i);
//				return;
//			}
//			System.out.println("Student Not Found !!\n");
//		}
//
//	}
}