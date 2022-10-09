package com.acts.customException;

public class Account {
	private long accNo;
	private String accName;
	private double balance;

	public static final double MIN_BALANCE = 1000.00;

	public Account(long accNo, String accName) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.balance = MIN_BALANCE;
	}


	public double deposit(double amount) {
		return this.balance += amount; 
	}

	public double withdraw(double amount) throws MinBalanceException{
			if (this.balance - amount < MIN_BALANCE) {
				MinBalanceException mbe = new MinBalanceException("Min balance general account");
				throw mbe;
			}
		return this.balance -= amount; 
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", balance=" + balance + "]";
	}

}