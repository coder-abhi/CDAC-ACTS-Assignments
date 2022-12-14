package com.acts.student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class StudentTester {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int choice = 0, ch = 0 ;
		List<Student> studentList = new ArrayList<>();
		DataUtil.studentDefaultList(studentList);
		Student st = new Student();
		do {
			System.out.println("\n\n-------------MENU-------------");
			System.out.println(" "
					+	 "1. Add Student "
					+ "\n 2. Print Student "
					+ "\n 3. Sort Students"
					+ "\n 4. Search student by roll number"
					+ "\n 5. Remove particular student "
					+ "\n 6. Find and Change Adress"
					+ "\n 0. Exit menu ");

			System.out.println("Enter Choice: ");
			choice = sc.nextInt();

			switch(choice) {
			case 1: {
				st = StudentUtil.addStudent();
				studentList.add(st);
				break;
			}

			case 2: {
				System.out.println("Student Details");
				System.err.println(SFormat.strFormat("Roll No.",10)+SFormat.strFormat("Name", 15)
				+ SFormat.strFormat("Date Of Birth",20)+SFormat.strFormat("Course",15)+"Address(House No,Lane No,Area,Pincode)");
				for(Student st1 : studentList) {
					System.out.println(st1.toString());
				}
				break;
			}
			case 3: {
				do {
					System.out.println("\n 1. Sort By Roll Number In Ascending Order "
							+ "\n 2. Sort By Roll Number In Descending Order"
							+ "\n 3. Sort by name"
							+ "\n 4. Sort by pincode"
							+ "\n 5. Sort by date of birth"

							+ "\n 0. Goto main menu");
					System.out.println("Enter choice:");
					ch = sc.nextInt();
					switch (ch) {
					case 1: {
//						Collections.sort(studentList, new Comparator<Student>() {
//
//							@Override
//							public int compare(Student o1, Student o2) {
//
//								return o1.getRollNo().compareTo(o2.getRollNo());
//							}
//						});
						
						Collections.sort(studentList, (o1,o2)->o1.getRollNo().compareTo(o2.getRollNo()));
						
						break;
					}
					case 2:{
//						Collections.sort(studentList, new Comparator<Student>() {
//
//							@Override
//							public int compare(Student o1, Student o2) {
//
//								return o2.getName().compareTo(o1.getName());
//							}
//						});
						Collections.sort(studentList, (o1,o2)->o2.getName().compareTo(o1.getName()));
						break;
					}
					case 3:{
//						Collections.sort(studentList, new Comparator<Student>() {
//
//							@Override
//							public int compare(Student o1, Student o2) {
//
//								return o1.getName().compareTo(o2.getName());
//							}
//						});
						Collections.sort(studentList, (o1,o2)->o1.getName().compareTo(o2.getName()));
						break;
					}
					case 4:{
//						Collections.sort(studentList, new Comparator<Student>() {
//
//							@Override
//							public int compare(Student o1, Student o2) {
//								return o1.getAddressList().get(0).getPinCode().compareTo(o2.getAddressList().get(0).getPinCode());
//							}
//						});
						Collections.sort(studentList, (o1,o2)->o1.getAddressList().get(0).getPinCode().compareTo(o2.getAddressList().get(0).getPinCode()));
						break;
					}
					case 5:{
//						Collections.sort(studentList, new Comparator<Student>() {
//
//							@Override
//							public int compare(Student o1, Student o2) {
//								return o1.getDob().compareTo(o2.getDob());
//							}
//						});
						Collections.sort(studentList, (o1,o2)->o1.getDob().compareTo(o2.getDob()));
						break;
					}
					case 0:
						break;
					default: {
					}
					}
				}while (ch!=0);

				break;

			}
			case 4: {
				System.out.println("Enter the Roll no to be found : ");
				int reqNo = sc.nextInt();
				Student foundStudent = findStudent(studentList,reqNo);
				if(foundStudent != null) {
					System.out.println("Student Found");					
				}
				else System.out.println("Student Not Found");					

				break;

			}


			case 5: {
				System.out.println("Enter the Roll no to be found : ");
				int reqRoll = sc.nextInt();
				removeStudent(studentList, reqRoll);
				break;
			}
			case 6: {
				System.out.println("Enter the Roll no to be found and Change Adress: ");
				int reqRoll = sc.nextInt();
				Student foundStudent = findStudent(studentList,reqRoll);
				if(foundStudent == null) {
					System.out.println("Student not Found !!.");
					break;	
				}
				foundStudent.getAddressList().clear();

				do {
					Address address = StudentUtil.getAddress();
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

	public static Student findStudent(List<Student> studentList,int rollNo) {

		for(Student stSearch : studentList) {
			if(stSearch.getRollNo() == rollNo) return stSearch;
		}
		return null;

	}
	public static void removeStudent(List<Student> studentList,int rollNo) {

		/*
		 * This iterator will not remove element - it will give error ConcurrentModificationException
		 * Because List is fast failed so when we use iterator over it , we can't do structural modification
			for(Student stSearch : studentList) {
				if(stSearch.getRollNo() == rollNo) studentList.remove(stSearch);
			}

		}
		 */
		for(int i=0 ; i<studentList.size() ; i++) {
			if(studentList.get(i).getRollNo() == rollNo) {
				studentList.remove(i);
				return;
			}
			System.out.println("Student Not Found !!\n");
		}

	}
}