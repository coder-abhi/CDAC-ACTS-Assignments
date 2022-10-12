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
		for(Integer key : keyList) {
			System.out.println(bookList.get(key).toString());
		}
	}
	
	public static void ShowMembers() {
		Set<Integer> keyList = memberList.keySet();
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
	public static void RentBook(Integer memberId, Integer BookId) {
		
//		if(isBookAvailable) {
//			
//		}
		Person currentMember = memberList.get(memberId);
		Book currentBook = bookList.get(BookId);
		
		currentBook.setQty(currentBook.getQty()-1);
		currentMember.setPersonBook(BookId);
		
		TransactionDB db = new TransactionDB(transCounter++, BookId, memberId, LocalDate.now());
		
		transactionList.put(db.getTransID(), db);
		System.out.println("Trans successfull");
	}
	
	public static void submitBook(Integer memberId) {
		Person currentMember = memberList.get(memberId);
		Book currentBook = bookList.get(currentMember.getPersonBook());
		TransactionDB currentTrans = transactionList.get(currentMember.getCurrentTrans());
		
		currentBook.setQty(currentBook.getQty()+1);
		currentMember.setPersonBook(null);
		LocalDate submitDate = LocalDate.parse("2022-10-08");
		Integer penalty = calculateDelay(memberId, currentTrans.getIssueDate(),submitDate);
		currentMember.setPersonPenalty(penalty);
		
	}
	

	public static Integer calculateDelay(Integer memberID, LocalDate issueDate, LocalDate submitDate) {
		
		Integer penalty = 0;
		if(submitDate.compareTo(issueDate) > 15){
			penalty += 250;
		}
		return 0;
	}
	
	public static void addBook(Book book) {
		bookList.put(book.getISBN(), book);
	}
	
	public static void addNewMember(Person member) {
		memberList.put(member.getMemberID(), member);
	}
	
}
