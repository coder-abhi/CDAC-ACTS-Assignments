package employee;

import java.time.LocalDate;
import java.util.List;

public class PermanentEmployee extends Employee {
	
	private double basicSal;
	private double incentive;
	private double specialAllowance;
	
	public PermanentEmployee() {
	}

	public PermanentEmployee(int empId, String empName, Title title, LocalDate doj, List<Address> addList,
			double basicSal, double incentive, double specialAllowance) {
		super(empId, empName, title, doj, addList);
		
		this.basicSal = basicSal;
		this.incentive = incentive;
		this.specialAllowance = specialAllowance;
	}

	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	public double getIncetive() {
		return incentive;
	}

	public void setIncetive(double incentive) {
		this.incentive = incentive;
	}

	public double getSpecialAllowance() {
		return specialAllowance;
	}

	public void setSpecialAllowance(double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}
	
	@Override
	public double calculateSalary() {
		return basicSal+incentive+specialAllowance;
	}
	
	@Override
	public String toString() {
		return super.toString()+ "PermanentEmployee [basicSal=" + basicSal + ", incentive=" + incentive + ", specialAllowance="
				+ specialAllowance + "]";
	}

}
