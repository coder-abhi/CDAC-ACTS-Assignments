package com.acts.library;

import java.text.Normalizer.Form;
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
			System.out.println(Formate.title("Main Dashboard", 60));
			System.out.println(""
					+ "\n1. Login as Owner"
					+ "\n2. Login as Member");
			choice = sc.nextInt();

			switch (choice) {
			case 1: {
				System.out.println(""
						+ "1. Print Member List"
						+ "2. Add New Books");


			}
			case 2:

				int memberChoice = 0;
				int memberID;
				System.out.println("Do you have Library Account ? Y/N");
				if("Y".equals(sc.next())) {
					System.out.println("Enter Your Member ID : ");
					memberID = sc.nextInt();
				} else {
					System.out.println(Formate.title("Creating your Account", 40));
					Person member = LibraryUtil.addMember();
					Library.addNewMember(member);
					break;
				}
				do {

					System.out.println(" "
							+ "\n 1. Show Available Books"
							+ "\n 2. Rent a Book"
							+ "\n 3. Submit a Book "
							+ "\n 0. Exit menu ");

					System.out.println("Enter Choice: ");
					memberChoice = sc.nextInt();

					switch(memberChoice) {
					case 1: {
						Library.ShowAvailableBooks();
						break;
					}

					case 2: {
						System.out.println("Enter ISBN of required book : ");
						int bookID = sc.nextInt();
						Library.RentBook(memberID, bookID);
						break;

					}
					case 3: {
						Library.submitBook(memberID);
						break;
					}
					default : {
						System.err.println("Wrong choice entered !! Enter again");
						//						break;
					}
					}
				}while(memberChoice !=0);



			default : {
				System.err.println("Wrong choice entered !! Enter again");
				//				break;
			}



			}


		}while(choice != 0);
		/*
		int choice = 0;
		do {
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
				Person member = LibraryUtil.addMember();
				Library.addNewMember(member);
				break;
			}

			case 2: {
				Library.ShowMembers();
				break;
			}
			case 3: {
				Library.ShowAvailableBooks();
				break;
			}
			case 4: {
				System.out.println("Enter ISBN of required book : ");
				int bookID = sc.nextInt();

			}


			case 5: {
				System.out.println("Enter the Roll no to be found : ");
				int reqRoll = sc.nextInt();
//				removeStudent(SudentDashboard.studentSet, reqRoll);
				break;
			}
			default : {
				System.err.println("Wrong choice entered");
				break;
			}
			}
		}while(choice !=0);

		 */

	}

}
