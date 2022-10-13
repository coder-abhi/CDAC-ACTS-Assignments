package com.acts.library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Library {
	public static Map<Integer, Book> bookList = new HashMap<>();
	public static Map<Integer, Person> memberList = new HashMap<>();
	public static Map<Integer, TransactionDB> transactionList = new HashMap<>();
	
	private static Integer transCounter = 001;
	
	
	public static void ShowAvailableBooks() {
		Set<Integer> keyList = bookList.keySet();
		System.err.println("\n"+Formate.formate("ISBN", 10) + Formate.formate("BOOK NAME", 20)
		+ Formate.formate("AUTHUR NAME", 20) + "QTY");
		for(Integer key : keyList) {
			System.out.println(bookList.get(key).toString());
		}
	}
	
	public static void ShowMembers() {
		Set<Integer> keyList = memberList.keySet();
		System.err.println("\n"+Formate.formate("MEMBER ID", 15) + Formate.formate("NAME", 20)
		+ Formate.formate("BOOK ID", 15) + "PENDING PENALTY");
		for(Integer key : keyList) {
			System.out.println(memberList.get(key).toString());
		}
	}
	
	public static void ShowTransaction() {
		Set<Integer> keyList = transactionList.keySet();
		for(Integer key : keyList) {
			System.out.println(transactionList.get(key).toString());
		}
	}
	public static void RentBook(Integer memberId, Integer BookId, LocalDate issueDate) {
		
		Person currentMember = memberList.get(memberId);
		
		if(currentMember.getPersonBook() != -1) {
			System.err.println("You Already issued a Book. Please Sumbit it first!!");
			return;
		}
		
		Book currentBook = bookList.get(BookId);
		
		// Check if book is available
		if(currentBook.getQty() <= 0) {
			System.err.println("Book is not Available!! Try alternative");
			return;
		}
		
		currentBook.setQty(currentBook.getQty()-1);
		currentMember.setPersonBook(BookId);
		
//		System.out.println("Enter Today's Date in YYYY-MM-DD");
		
		TransactionDB db = new TransactionDB(transCounter++, BookId, memberId, issueDate);
		currentMember.setCurrentTrans(db.getTransID());
		transactionList.put(db.getTransID(), db);
		System.out.println("Book Rented successfull");
	}
	
	public static void submitBook(Integer memberId, LocalDate submitDate) {
		
		Person currentMember = memberList.get(memberId);
		Book currentBook = bookList.get(currentMember.getPersonBook());
		
		
		TransactionDB currentTrans = transactionList.get(currentMember.getCurrentTrans());
		
		currentBook.setQty(currentBook.getQty()+1);
		currentMember.setPersonBook(-1);
		
		currentTrans.setSubmitDate(submitDate);
		Integer penalty = calculateDelay(memberId, currentTrans.getIssueDate(),submitDate);
		currentMember.setPersonPenalty(penalty);
		
		if(penalty > 0) {
			System.err.println("You have "+penalty + " to pay !!!");
			currentMember.setPersonPenalty(currentMember.getPersonPenalty()+penalty);
		}
		else {
			System.out.println("Book Sumbitted successfully");
		}
		
	}
	

	public static Integer calculateDelay(Integer memberID, LocalDate issueDate, LocalDate submitDate) {
		
		Integer penalty = 0;
		System.out.println("submitDate.compareTo(issueDate) : "+submitDate.compareTo(issueDate));
		if(issueDate.isBefore(submitDate.minusDays(15))){
			penalty += 250;
		}
		return penalty;
	}
	
	public static void addBook(Book book) {
		bookList.put(book.getISBN(), book);
	}
	
	public static void addNewMember(Person member) {
		memberList.put(member.getMemberID(), member);
		System.out.println("Your Member ID : "+member.getMemberID());
	}
	
}
