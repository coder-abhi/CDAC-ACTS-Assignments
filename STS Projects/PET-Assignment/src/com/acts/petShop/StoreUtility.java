package com.acts.petShop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.security.sasl.AuthenticationException;

public class StoreUtility {
	public static ArrayList<Pet> petList = new ArrayList<>();
	public static ArrayList<Order> orderList = new ArrayList<>();
	public static Integer orderIdGenerator = 1;
	public static  HashMap<String,String> admin = new HashMap<>();
	public static HashMap<String,String> customer = new HashMap<>();
	public static boolean isAdminLogin = false;
	public static boolean isCustomerLogin = false;
	static Scanner sc = new Scanner(System.in);
	
	public static void addDefault() {
		admin.put("admin", "admin");
		customer.put("c1", "c1");
		petList.add(new Pet(101,"Moti",Category.ALASKAN,2500.00,25));
		petList.add(new Pet(102,"Sonya",Category.GERMAN,3500.00,25));
		petList.add(new Pet(103,"Tommy",Category.HUSKIES,4500.00,25));
		petList.add(new Pet(104,"Lucky",Category.ALASKAN,9900.00,15));
	}
	
	public static void showPetList() {
		petList.stream().filter(x -> x.getStock()>0).forEach(x->System.out.println(x.toString()));
//		Pet temp = petList.stream().filter(x -> x.getStock()==0).findFirst().get();
	}
	public static void Login() {

		do {
			System.out.println(
					"1.Login as Admin "
							+ "2.Login as Customer"
							+ "3.Register");
			int choice = sc.nextInt();
			if(choice == 3) {
				Register();
				return;
			}
			System.out.println("Enter Login ID");
			String login = sc.next();
			System.out.println("Enter Password");
			String pass = sc.next();
			
			switch(choice) {
			case 1:try{
				isAdminLogin = admin.get(login).equals(pass);
			}catch(NullPointerException e) {
				System.out.println("Wrong User ID or Password");
			}
			break;
			case 2 :try{
				isCustomerLogin = customer.get(login).equals(pass);
			}catch(NullPointerException e) {
				System.out.println("Wrong User ID or Password");
			} 
			break;
			}			
		}while(!(isAdminLogin || isCustomerLogin));
	}
	public static void Register() {
		System.out.println("Register as "
				+ "1. Admin "
				+ "2. Customer");
		int choice = sc.nextInt();
			System.out.println("Enter Login ID");
			String login = sc.next();
			System.out.println("Enter Password");
			String pass = sc.next();
			if(choice ==1) {
				admin.put(login, pass) ; 
				isAdminLogin = true;
			}
			else {
				customer.put(login, pass); 	
				isCustomerLogin = true;
			}
	}
	public static void validateAutherization(Integer choice) throws AuthorizationException {
		if(choice ==2 || choice == 3 || choice == 7) {
			if(!isAdminLogin) throw new AuthorizationException("Admin Login Requried");
		}
		if(choice == 5 || choice == 6) {
			if(!isCustomerLogin && !isAdminLogin) throw new AuthorizationException("Login is Required !!");
		}
	}
	
	public static void addNewPet() {
		System.out.print("Enter Pet Id : ");
		Integer id = sc.nextInt();
		
		System.out.print("\nEnter Name : ");
		String name = sc.next();
		
		System.out.print("\nEnter Category : ");
		String category = sc.next();
		
		System.out.print("\nEnter Price : ");
		Double price = sc.nextDouble();
		
		System.out.print("\nEnter Quantity : ");
		Integer qty = sc.nextInt();
		
		petList.add(new Pet(id, name,Category.valueOf(category), price, qty));
	
	
	}
	
	public static void orderPet(Integer petId, Integer qty) {
		if(!petList.stream().anyMatch(x-> x.getPetID() == petId)) System.out.println("Pet Not Found");
		Order order = new Order(orderIdGenerator++,petId,qty,Status.ORDER_PLACED);
	}
	
	public static void checkOrderStatus(Integer orderId) {
		if(!orderList.stream().anyMatch(x->x.getOrderID() == orderId)) System.out.println("Order Not Found");
		orderList.stream().filter(x->x.getOrderID() == orderId).forEach(x ->System.out.println(x.toString()) );
	}
}
