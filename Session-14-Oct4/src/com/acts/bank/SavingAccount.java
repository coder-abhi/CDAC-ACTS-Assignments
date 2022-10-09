package com.acts.bank;
public class SavingAccount extends Account {
	private double minimumBalance;
	private double currentBalance;
	private double rateOfInterest;
	
	public SavingAccount() {
		this.minimumBalance = 500;
		this.currentBalance = 0;
		this.rateOfInterest = 0;
		
	}

	public SavingAccount(String accountName, int accountNumber, double minimumBalance, double currentBalance, double rateOfInterest) {
		super(accountName,accountNumber);
		this.minimumBalance = minimumBalance;
		this.currentBalance = currentBalance;
		this.rateOfInterest = rateOfInterest;
	}
	
	public double calculateInterest() {
		return (minimumBalance * rateOfInterest * 1) / 100;
	}
	
	@Override
	public String toString() {
		return super.toString()+ "SavingAccount [minimumBalance=" + minimumBalance + ", currentBalance=" + currentBalance
				+ ", rateOfInterest=" + rateOfInterest + "]";
	}
	
}
