package employee;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee implements Serializable{
	private int empId;
	private String empName;
	private Title title;
	private LocalDate dateOfJoining;
	private List<Address> addList;


	public Employee() {
	}

	public Employee(int empId, String empName, Title title,LocalDate date, List<Address> addList) {
		this.empId = empId;
		this.empName = empName;
		this.title = title;
		this.dateOfJoining = date;
		this.addList = addList;
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public List<Address> getAddList() {
		return addList;
	}

	public void setAddList(List<Address> addList) {
		this.addList = addList;
	}

	public void addAddress(Address address) {
		addList.add(address);
	}
	
	public double calculateSalary() {
		return 0.0;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(empId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", title=" + title + ", dateOfJoining="
				+ dateOfJoining + ", addList=" + addList + "]";
	}
	
}
