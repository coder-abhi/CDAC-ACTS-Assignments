package com.acts.library;

import java.text.Normalizer.Form;
import java.time.LocalDate;
import java.util.Scanner;

public class LibraryTester {

	public static void main(String[] args) {
		Library.bookList.put(  1001, new Book(1001,"Sherlock","Canon Dayle",5));
		Library.bookList.put(  1002, new Book(1002,"Holmes","Canon Dayle",5));
		Library.bookList.put(  1003, new Book(1003,"Harry Potter","Canon Dayle",5));
		Library.bookList.put(  1004, new Book(1004,"Alchamist","Canon Dayle",5));
		Library.bookList.put(  1005, new Book(1005,"How To","Canon Dayle",5));

//		Library.ShowAvailableBooks();


		Library.memberList.put(11, new Person(11 ,"Abhi","78789898"));
		Library.memberList.put(12, new Person(12 ,"Deepesh","qwerty"));

//		Library.ShowMembers();

//		Library.RentBook(11,1001,LocalDate.parse("2022-09-20"));
//		System.out.println("-".repeat(60));
//		Library.ShowAvailableBooks();
//		Library.ShowMembers();
//		Library.ShowTransaction();



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
				String ownerPass;
				do {
					System.out.println("Enter Your Password: ");
					ownerPass = sc.next();
				}while(!"Admin407".equals(ownerPass));
				
				int ownerChoice = 0;
				do {
					System.out.println("\n"+Formate.title("Owner Dashboard", 60));
				System.out.println(""
						+ "\n1. Print Member List"
						+ "\n2. Add New Books"
						+ "\n3. Show Available Books"
						+ "\n0. For Main Menu");
					ownerChoice = sc.nextInt();
					switch (ownerChoice) {
						case 1: {
							Library.ShowMembers();
							break;
						}
						case 2:{
							Book book = LibraryUtil.addBook();
							Library.bookList.put(book.getISBN(),book);
							break;
						}
						case 3:{
							Library.ShowAvailableBooks();
							break;
						}
					}
				}while(ownerChoice!=0);

				break;
			}
			case 2:
			{
				int memberChoice = 0;
				int memberID;
				System.out.println("Do you have Library Account ? Y/N");
				if("Y".equals(sc.next())) {
					String userPass;
					do {
						System.out.println("Enter Your Member ID : ");
						memberID = sc.nextInt();
						System.out.println("Enter Your Password: ");

						userPass = sc.next();
					}while(!Library.memberList.get(memberID).checkPass(userPass));

				} else {
					System.out.println(Formate.title("Creating your Account", 40));
					Person member = LibraryUtil.addMember();
					Library.addNewMember(member);
					break;
				}
				do {
					System.out.println("\n"+Formate.title("Member Dashboard", 60));
					System.out.println(" "
							+ "\n 1. Show Available Books"
							+ "\n 2. Issue a Book"
							+ "\n 3. Submit a Book "
							+ "\n 4. Show Member Profile "
							+ "\n 5. Pay Your Penalty"
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
						
						System.out.println("Enter Today's Date");
						String issueDate = sc.next();
						Library.RentBook(memberID, bookID, LocalDate.parse(issueDate));
						break;

					}
					case 3: {
						if(Library.memberList.get(memberID).getPersonBook() == -1) {
							System.err.println("You dont have any book to submit !!");
							break;
						}
						System.out.println("Enter Today's Date");
						String submitDate = sc.next();
						Library.submitBook(memberID, LocalDate.parse(submitDate));
						break;
					}
					case 4:{
						System.err.println("\n"+Formate.formate("MEMBER ID", 10) + Formate.formate("NAME", 20)
						+ Formate.formate("BOOK ID", 20) + "PENDING PENALTY");

						System.out.println(Library.memberList.get(memberID).toString());

//						Library.ShowMembers();
						break;
					}
					case 5:{
						int penalty = Library.memberList.get(memberID).getPersonPenalty();
						
						if(penalty <= 0) {
							System.out.println("You dont have any due's");
							break;
						} 
						System.err.println("You have "+penalty + " to pay !!!");
						System.out.println("Enter Amount You want to Pay");
						int amount = sc.nextInt();
						Library.memberList.get(memberID).setPersonPenalty(Library.memberList.get(memberID).getPersonPenalty() - amount);
						break;
					}
					case 9:{
						Library.ShowTransaction();
						break;
					}
					}
				}while(memberChoice !=0);
				break;
			}

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
