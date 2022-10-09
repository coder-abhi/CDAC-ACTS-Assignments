package com.acts.bank;

public class FdAccount extends Account {
	private double fdAmount;
	private double duration;
	private double rateOfInterest;
	
	public FdAccount() {
		this.fdAmount = 0;
		this.duration = 0;
		this.rateOfInterest = 0;
	}

	public FdAccount(String accountName, int accountNumber, double fdAmount, double duration, double rateOfInterest) {
		super(accountName , accountNumber);
		this.fdAmount = fdAmount;
		this.duration = duration;
		this.rateOfInterest = rateOfInterest;
	}
	
	public double calculateInterest() {
		return (fdAmount * rateOfInterest * duration) / 100;
	}

	@Override
	public String toString() {
		return super.toString() + "FdAccount [fdAmount=" + fdAmount + ", duration=" + duration + ", rateOfInterest=" + rateOfInterest
				+ "]";
	}

	public double getFdAmount() {
		return fdAmount;
	}

	public void setFdAmount(double fdAmount) {
		this.fdAmount = fdAmount;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	
}
