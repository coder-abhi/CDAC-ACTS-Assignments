package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import utils.DataUtils;
import utils.IOUtils;
import utils.ValidateUtils;

import employee.*;
import exception.EmployeeNotFoundException;

public class tester {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Employee pe = new PermanentEmployee();
		Employee ce = new ContractEmployee();
		List<Employee> empList = DataUtils.populateData();
		List<Address> addList = new ArrayList<>();
		int choice = 0;
		do {
			System.out.println("-----------Menu-----------");
			System.out.println("\n1. Add new Permanent Employee"
					+ "\n2. Add new Contract Employee"
					+ "\n3. Print All Employee"
					+ "\n4. Check whether a partcular employee exist by emp id"
					+ "\n5. Print all employee with same title"
					+ "\n6. Add new address of existing employee"
					+ "\n7. Calculate Salary by id"
					+ "\n8. Sort employee by employee id"
					+ "\n9. Sort employee according to name"
					+ "\n10. Sort employee according to title"
					+ "\n11. Save employee details to binary file"
					+ "\n12. Save employee details to text file"
					+ "\n13. Read employee details from a file"
					+ "\n14. Print all employees according to joining date");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();

			switch(choice) {
			case 1:{
				System.out.println("Enter Employee ID");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Employee Name");
				String name = sc.nextLine();


				System.out.println("Enter Employee Title");
				String t = sc.next();
				Title title = ValidateUtils.enumValidator(t);


				System.out.println("Enter Employee Joining Date in YYYY-MM-DD");
				String dt = sc.next();
				LocalDate date = ValidateUtils.dateValidator(dt);

				System.out.println("Enter employee houseNo");
				String hno = sc.next();
				System.out.println("Enter employee Area");
				String area = sc.next();
				System.out.println("Enter employee pincode");
				int pin = sc.nextInt();
				addList.add(new Address(hno,area, pin));

				System.out.println("Enter Basic Salary");
				double bs = sc.nextDouble();
				System.out.println("Enter Incentive");
				double inc = sc.nextDouble();
				System.out.println("Enter Allowance");
				double alw = sc.nextDouble();

				PermanentEmployee p = new PermanentEmployee(id,name,title,date,addList,bs,inc,alw);
				p.hashCode();
				empList.add(p);
				System.out.println("Employee added Succesfully");
				break;
			}

			case 2:{
				System.out.println("Enter Employee ID");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Employee Name");
				String name = sc.nextLine();
				System.out.println("Enter Employee Title");
				String t = sc.next();
				Title title = ValidateUtils.enumValidator(t);

				System.out.println("Enter Employee Joining Date in YYYY-MM-DD");
				String dt = sc.next();
				LocalDate date = LocalDate.parse(dt);

				System.out.println("Enter employee houseNo");
				String hno = sc.next();
				System.out.println("Enter employee Area");
				String area = sc.next();
				System.out.println("Enter employee pincode");
				int pin = sc.nextInt();
				addList.add(new Address(hno, area, pin));

				System.out.println("Enter No Of Days");
				int nod = sc.nextInt();
				System.out.println("Enter Daily Wage");
				int dw = sc.nextInt();

				ContractEmployee c = new ContractEmployee(id,name,title,date,addList, nod,dw);
				c.hashCode();
				empList.add(c);
				System.out.println("Employee added Succesfully");
				break;
			}

			case 3:{
				empList.stream().forEach(System.out::println);
				break;
			}

			case 4:{
				System.out.println("Enter emp ID to search");
				int id =sc.nextInt();
				try {
					if(empList.stream().anyMatch(s -> s.getEmpId()== id)) {
						System.out.println("Employee Found");
					}
					else {
						throw new EmployeeNotFoundException("Employee Not Found");
					}
				}
				catch(EmployeeNotFoundException enf) {
					enf.printStackTrace();
				}
				break;
			}

			case 5:{
				System.out.println("Enter a title");
				String dept = sc.next();
				Title t = Title.valueOf(dept);
				for(Employee e: empList) {
					if(e.getTitle().equals(t)) {
						System.out.println(e);
					}
				}				
				break;
			}

			case 6:{
				System.out.println("Enter employee id to add address");
				int id = sc.nextInt();

				System.out.println("Enter employee houseNo");
				String hno = sc.next();
				System.out.println("Enter employee area");
				String area = sc.next();
				System.out.println("Enter employee pincode");
				int pin = sc.nextInt();
				Address ad = new Address(hno,area, pin);

				for(Employee e : empList) {
					if(e.getEmpId() == id) {
						e.addAddress(ad);
					}
				}
				break;
			}

			case 7: {
				System.out.println("Enter employee id to calculate salary");
				int id = sc.nextInt();
				for(Employee e : empList) {
					if(e.getEmpId()== id) {
						double sal = e.calculateSalary();
						System.out.println("Salary is : "+ sal);
					}
				}
				break;
			}
			case 8:{
				empList.stream().
				sorted(Comparator.comparing(Employee::getEmpId))
				.forEach(System.out::println);
				break;
			}
			case 9:{
				empList.stream().
				sorted(Comparator.comparing(Employee::getEmpName))
				.forEach(System.out::println);	
				break;
			}
			case 10:{
				empList.stream().
				sorted(Comparator.comparing(Employee::getTitle))
				.forEach(System.out::println);
				break;
			}
			case 11:{
				System.out.println("Enter file destination");
				String dest = sc.next();
				IOUtils.writeDetailsBinary(empList, dest);
				break;
			}

			case 12:{
				System.out.println("Enter file destination");
				String dest = sc.next();
				IOUtils.writeDetailsText(empList, dest);
				break;
			}
			case 13:{
				System.out.println("Enter file source");
				String dest = sc.next();
				IOUtils.readDetails(dest);
				break;
			}
			case 14:{
				System.out.println("enter joining date");
				String dt = sc.next();
				LocalDate date = LocalDate.parse(dt);
				for(Employee e: empList) {
					if(e.getDateOfJoining().equals(date))
						System.out.println(e);
				}

			}
			}

		}while(choice!=0);



		sc.close();
	}

}
