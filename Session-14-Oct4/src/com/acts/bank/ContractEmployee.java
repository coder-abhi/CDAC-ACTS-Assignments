package com.acts.bank;
import java.util.Date;

public class ContractEmployee extends Employee {

	private double dailyRate;
	private int noOfDays;

	public ContractEmployee() {
		super();
		System.out.println("ContractEmployee::ContractEmployee()");
	}

	public ContractEmployee(String name, String title,
			Date doj,double dailyRate, int noOfDays) {
		super(name, title , doj);
		this.dailyRate = dailyRate;
		this.noOfDays = noOfDays;
		System.out.println("ContractEmployee::ContractEmployee(Param)");
	}

	@Override 
	public double calculateSalary() {
		System.out.println("Contract salary");
		return dailyRate * noOfDays;
	}

	public double getDailyRate() {
		return dailyRate;
	}

	public void setDailyRate(double dailyRate) {
		this.dailyRate = dailyRate;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	@Override
	public String toString() {
		return "ContractEmployee [" + super.toString() + " dailyRate=" 
	            + dailyRate + ", noOfDays=" + noOfDays + "]";
	}
}