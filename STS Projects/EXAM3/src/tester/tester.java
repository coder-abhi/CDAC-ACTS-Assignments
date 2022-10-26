package tester;

import static java.lang.System.out;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import exception.*;
import petstore.*;
import utils.DataUtils;

public class tester {

	public static void main(String[] args) {

		Map<Integer, Pet> petMap = DataUtils.populateData();
		Map<Integer, Order> orderMap = new HashMap<>();
		Scanner sc =new Scanner(System.in);

		int choice=0; boolean checkAdmin = false; boolean checkUser =false;

		do{
			System.out.println("-----------Menu----------");
			System.out.println("\n1. Login"
					+ "\n2. Add new pet"
					+ "\n3. Update Pet Details"
					+ "\n4. Display all available pets"
					+ "\n5. Order a pet"
					+ "\n6. Check order status by Order Id"
					+ "\n7. Update order status"
					+ "\n8. Exit");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();

			switch(choice) {

			case 1: {
				System.out.println("Enter ID");
				String id = sc.next();
				System.out.println("Enter Pass ");
				String pass = sc.next();
				boolean flag = true;
				try {
					if(validateAdmin(id,pass)) {
						System.out.println("Admin Logged in Succesfully");
						checkAdmin = true;
						checkUser = false;
						flag = false;
					}
					else if(validateUser(id,pass)) {
						System.out.println("User Logged in Succesfully");
						checkUser = true;
						checkAdmin = false;
						flag = false;
					}
					else {
						throw new AutherizationException("Invalid login details");		
					}
				}
				catch(AutherizationException ae) {
					ae.printStackTrace();
					ae.printStackTrace();
				}
				break;
			}

			case 2:{
				checkUser= false;
				if(checkAdmin) {
					System.out.println("Enter pet name ");
					String name = sc.next();

					PetCategory category = null;
					do {
						System.out.println("Enter pet category");
						String ctg = sc.next();	
						boolean check = true;
						try {
							for(PetCategory ct: PetCategory.values()) {
								if(ct.name().equals(ctg)) {
									category = PetCategory.valueOf(ctg);
									check = false;
									break;
								}
							}
							if(check) {
								AuthenticationException ae = new AuthenticationException("wrong category!!!");
								throw ae;
							}
						}
						catch (AuthenticationException ae) {
							System.out.println(ae.getMessage());
							ae.printStackTrace();
						}
					}while (category == null);	

					System.out.println("Enter unit price");
					int price = sc.nextInt();

					System.out.println("Enter quantity");
					int qty = sc.nextInt();	

					Pet p = new Pet(name,category,price,qty);
					petMap.put(p.getPetId(),p);
					System.out.println("Pet Added Successfully");

				}
				else {
					System.out.println("Admin not Logged In please login");
				}
				break;
			}
			case 3:{
				checkUser = false;
				if(checkAdmin) {
					System.out.println("Enter pet id to update");
					int id = sc.nextInt();

					System.out.println("Enter new pet name");
					String name = sc.next();

					System.out.println("Enter new pet quantity");
					int qty = sc.nextInt();

					petMap.get(id).setName(name);
					petMap.get(id).setStock(qty+petMap.get(id).getStock());
					System.out.println("Pet successfully updated");
					
				}
				else {
					System.out.println("Not logged in please log in");
				}
				break;
			}

			case 4:{
				petMap.values().stream().forEach(System.out::println);
				break;
			}

			case 5:{
				checkAdmin = false;
				if(checkUser) {
					System.out.println("Enter pet id to order");
					int pid = sc.nextInt();
				
					try {
						System.out.println("Enter quantity to order");
						int qty = sc.nextInt();
						if(petMap.get(pid).getStock()>0 && petMap.get(pid).getStock()> qty) {
							Order o = new Order(pid, qty, Status.PLACED );
							orderMap.put(o.getOrderId(),o);
							System.out.println("Order placed successfully");
							orderMap.values().forEach(System.out::println);
							orderMap.get(o.getOrderId()).setStatus(Status.IN_PROCESS);
							petMap.get(pid).setStock(petMap.get(pid).getStock()-qty);
						}
						else {
							throw new OutOfStockException("Pet is out of stock");
						}
					}
					catch(OutOfStockException ose) {
						System.out.println(ose.getMessage());
						ose.printStackTrace();
					}

				}
				else {
					System.out.println("Not Logged In please login");
				}
				break;
			}

			case 6:{
				checkAdmin = false;
				if(checkUser) {
					System.out.println("Enter order id to check status");
					int id = sc.nextInt();
					System.out.println("Order status: " + orderMap.get(id).getStatus());
					break;
				}
				else {
					System.out.println("Not logged in");
				}
				break;
			}

			case 7:{
				checkUser = false;
				if(checkAdmin) {
					System.out.println("Enter id to update order status");
					int id = sc.nextInt();
					orderMap.get(id).setStatus(Status.COMPLETED);
					System.out.println("Order Status Updated");
					break;
				}
				else {
					System.out.println("Not logged in please login");
				}
				break;
			}

			case 8:{
				System.exit(0);

				break;
			}
			default:{
				System.out.println("Enter Correct Choice");
				break;
			}
			}

		}while(choice!= 0);

	}

	public static boolean validateAdmin(String id, String pass) {
		String adminID = "admin";
		String adminPass = "root";
		if(id.equals(adminID) && pass.equals(adminPass)) {
			return true;
		}
		else {
			return false;
		}
	}

	public static boolean validateUser(String id, String pass) {
		String user1Id = "user1";
		String user1Pass = "root";	
		if(id.equals(user1Id)&& pass.equals(user1Pass)) {
			return true;
		}
		else {
			return false;
		}
	}
}
