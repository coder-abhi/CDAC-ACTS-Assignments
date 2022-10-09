package com.acts.customException;

public class SavingAccount extends Account{

	private double interestRate;

	public static final double MIN_BALANCE_SAVINGS = 5000.00;

	public SavingAccount(long accNo, String accName, double ir) {
		super(accNo, accName);
		this.interestRate = ir;
	}

	@Override
	public double withdraw(double amount) throws MinBalanceException {
		if (this.getBalance() - amount < MIN_BALANCE_SAVINGS) {
			MinBalanceException mbe = new MinBalanceException("Min balance in Saving account");
			throw mbe;
		}
		this.setBalance(this.getBalance() - amount);
		return this.getBalance();
	}

}