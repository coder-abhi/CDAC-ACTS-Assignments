package com.acts.library;

import java.util.Map;

public class Person {
	private Integer memberID;
	private String personName;

	private Integer personBookID;
	private Integer personPenalty;
	private Integer currentTrans;
	
	
	
	public Person(Integer memberID, String personName) {
		super();
		this.memberID = memberID;
		this.personName = personName;
		this.personPenalty = 0;
	}
	
	public Integer getMemberID() {
		return memberID;
	}
	@Override
	public String toString() {
		return  Formate.formate(memberID+"", 10) + Formate.formate(personName, 20) + Formate.formate(personBookID+"", 15) + personPenalty;
	}
	
	public void setMemberID(Integer memberID) {
		this.memberID = memberID;
	}

	public Integer getPersonBook() {
		return personBookID;
	}
	public void setPersonBook(Integer personBook) {
		this.personBookID = personBook;
	}
	public Integer getPersonPenalty() {
		return personPenalty;
	}
	public void setPersonPenalty(Integer personPenalty) {
		this.personPenalty = personPenalty;
	}

	public Integer getCurrentTrans() {
		return currentTrans;
	}

	public void setCurrentTrans(Integer currentTrans) {
		this.currentTrans = currentTrans;
	}
}
