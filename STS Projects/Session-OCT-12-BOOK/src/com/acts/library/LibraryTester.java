package com.acts.library;

import java.util.Scanner;

public class LibraryTester {

	public static void main(String[] args) {
		Library.bookList.put(  1001, new Book(1001,"Sherlock","Canon Dayle",5));
		Library.bookList.put(  1002, new Book(1002,"Holmes","Canon Dayle",5));
		Library.bookList.put(  1003, new Book(1003,"Harry Potter","Canon Dayle",5));
		Library.bookList.put(  1004, new Book(1004,"Alchamist","Canon Dayle",5));
		Library.bookList.put(  1005, new Book(1005,"How To","Canon Dayle",5));
		
		Library.ShowAvailableBooks();
		
		
		Library.memberList.put(11, new Person(11 ,"Abhi"));
		Library.memberList.put(12, new Person(12 ,"Deepesh"));
		
		Library.ShowMembers();
		
		Library.RentBook(11,1001);
		System.out.println("-".repeat(60));
		Library.ShowAvailableBooks();
		Library.ShowMembers();
		Library.ShowTransaction();
		
		
		
		Scanner sc = new Scanner(System.in);

		int choice = 0;
		do {
			System.out.println("\n\n-------------MENU-------------");
			System.out.println(" "
					+	 "1. Add New Member "
					+ "\n 2. Print Member List "
					+ "\n 3. Show Available Books"
					+ "\n 4. Rent a Book"
					+ "\n 5. Submit a Book "
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

}
