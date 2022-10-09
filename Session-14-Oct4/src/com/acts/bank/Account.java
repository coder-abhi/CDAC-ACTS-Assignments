package com.acts.bank;

public class Account {
	private String accountName;
	private int accountNumber;

	public Account() {

	}

	public Account(String accountName, int accountNumber) {
		this.accountName = accountName;
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "Account [Account Name: " + accountName + ", Account Number: " + accountNumber + "]";
	}
	
}
