package com.acts.library;

public class Book {
	private Integer ISBN;
	private String bookName;
	private String author;
	private Integer qty;
	
	public Book(Integer iSBN, String bookName, String author, Integer qty) {
		super();
		ISBN = iSBN;
		this.bookName = bookName;
		this.author = author;
		this.qty = qty;
		
	}
	
	public Integer getISBN() {
		return ISBN;
	}
	public void setISBN(Integer iSBN) {
		ISBN = iSBN;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", bookName=" + bookName + ", author=" + author + ", qty=" + qty + "]";
	}

	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	
}
