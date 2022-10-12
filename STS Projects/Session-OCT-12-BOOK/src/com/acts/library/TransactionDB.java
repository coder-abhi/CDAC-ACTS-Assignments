package com.acts.library;

import java.time.LocalDate;

public class TransactionDB {
	private Integer transID ;
	private Integer transBookISBN;
	private Integer transMemberID;
	private LocalDate issueDate;
	private LocalDate submitDate;
	
	public TransactionDB(Integer transID, Integer transBookISBN, Integer transMemberID, LocalDate issueDate) {
		super();
		this.transID = transID;
		this.transBookISBN = transBookISBN;
		this.transMemberID = transMemberID;
		this.issueDate = issueDate;
	}
	
	
	
	public Integer getTransID() {
		return transID;
	}
	public void setTransID(Integer transID) {
		this.transID = transID;
	}
	public Integer getTransBookISBN() {
		return transBookISBN;
	}
	public void setTransBookISBN(Integer transBookISBN) {
		this.transBookISBN = transBookISBN;
	}

	@Override
	public String toString() {
		return  transID + " ".repeat(20) + transBookISBN + " ".repeat(20)
				+ transMemberID + " ".repeat(20) + issueDate + " ".repeat(20) + submitDate;
	}
	public Integer getTransMemberID() {
		return transMemberID;
	}
	public void setTransMemberID(Integer transMemberID) {
		this.transMemberID = transMemberID;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}
}
