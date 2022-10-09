package com.acts.InternShala;

public class Employee {
	private static final String DEFAULT_VALUE ="";
	private String name;
	private double salary;
	private int employeeNo;
	private String department;
	private Address add;
	
	public Employee() {
		this.name = DEFAULT_VALUE;
		this.salary = 0;
		this.employeeNo = 0;
		this.department = DEFAULT_VALUE;
		this.add = null;
	}
	public Employee( int employeeNo ,String name, double salary, String department,Address add) {
		this.name = name;
		this.salary = salary;
		this.employeeNo = employeeNo;
		this.department = department;
		this.add = add ; 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return Formater.formate(employeeNo+"", 20) + Formater.formate(name, 20) +
				Formater.formate(department, 20) +Formater.formate(salary+"", 20)+ add.toString();
	}

}
