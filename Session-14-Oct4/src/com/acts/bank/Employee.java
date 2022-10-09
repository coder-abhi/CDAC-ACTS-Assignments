package com.acts.bank;
import java.util.Date;


public class Employee{
	private int empId;
	private String name;
	private String title;
	private Date doj;

	private static int EMP_ID_START = 100;

	public Employee() {
		this.empId = EMP_ID_START++;
		System.out.println("Employee::Employee()");
	}

	public Employee(String name, String title, Date doj) {
		System.out.println("Employee::Employee(paramteres)");
		this.empId = EMP_ID_START++;
		this.name = name;
		this.title = title;
		this.doj = doj;
	}

	public double calculateSalary() {
		return 0.0;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		String strDoj = DateUtil.getFormattedDate(doj, DateUtil.DD_MM_YYYY);
		return "Employee [empId=" + empId 
				+ ", name=" + name 
				+ ", title=" + title
				+ ", doj=" + strDoj + "]";
	}

}
