package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import employee.Address;
import employee.Employee;
import employee.PermanentEmployee;
import employee.Title;

public interface DataUtils {

	public static ArrayList<Employee> populateData() {
		List<Employee> empList= new ArrayList<>();
		
		Address ad1 = new Address("House8", "Bhavdhan", 221007);
		List<Address> addList1 = new ArrayList<>();
		addList1.add(ad1);
		
		Address ad2 = new Address("House12", "Baner", 221023);
		List<Address> addList2 = new ArrayList<>();
		addList2.add(ad2);
		
		Address ad3 = new Address("House13", "Pashan", 221017);
		List<Address> addList3 = new ArrayList<>();
		addList3.add(ad3);
		
		Address ad4 = new Address("House3", "Aundh", 229007);
		List<Address> addList4 = new ArrayList<>();
		addList4.add(ad4);
		
		Address ad5 = new Address("House2", "Panchvati", 221234);
		List<Address> addList5 = new ArrayList<>();
		addList5.add(ad5);
		
		Address ad6 = new Address("House4", "Bhavdhan", 221009);
		List<Address> addList6 = new ArrayList<>();
		addList6.add(ad6);
		
		Employee emp1 = new PermanentEmployee(100,"Deepesh", Title.DEVELOPER, LocalDate.parse("2022-10-23")
				,addList1,40000, 25000, 5000);
		emp1.hashCode();
		
		Employee emp2 = new PermanentEmployee(101,"Abhishek", Title.DEVELOPER, LocalDate.parse("2022-10-21")
				,addList1,40000, 25000, 5000);
		emp2.hashCode();
		
		Employee emp3 = new PermanentEmployee(102,"Rajnish", Title.TECH_LEAD, LocalDate.parse("2022-09-23")
				,addList1,40000, 25000, 5000);
		emp3.hashCode();
		
		Employee emp4 = new PermanentEmployee(103,"Sundar", Title.CEO, LocalDate.parse("2001-04-12")
				,addList1,40000, 25000, 5000);
		emp4.hashCode();
		
		Employee emp5 = new PermanentEmployee(104,"Ryan", Title.TRAINEE, LocalDate.parse("2021-05-20")
				,addList1,40000, 25000, 5000);
		emp5.hashCode();
		
		Employee emp6 = new PermanentEmployee(105,"Adam", Title.CTO, LocalDate.parse("2019-12-13")
				,addList1,40000, 25000, 5000);
		emp6.hashCode();
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);
		
		return (ArrayList<Employee>) empList;
	}
}


