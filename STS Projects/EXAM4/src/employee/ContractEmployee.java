package employee;

import java.time.LocalDate;
import java.util.List;

public class ContractEmployee extends Employee {
	
	private int noOfDays;
	private int dailyWage;
	
	public ContractEmployee() {
	}

	public ContractEmployee(int empId, String empName, Title title,LocalDate doj, List<Address> addList,
			int noOfDays, int dailyWage) {
		super(empId, empName, title,doj, addList);
		this.noOfDays = noOfDays;
		this.dailyWage = dailyWage;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public int getDailyWage() {
		return dailyWage;
	}

	public void setDailyWage(int dailyWage) {
		this.dailyWage = dailyWage;
	}
	
	@Override
	public double calculateSalary() {
		return noOfDays*dailyWage;
	}

	@Override
	public String toString() {
		return super.toString()+"ContractEmployee [noOfDays=" + noOfDays + ", dailyWage=" + dailyWage + "]";
	}
}
