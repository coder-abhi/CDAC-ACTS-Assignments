package com.acts.petShop;

import java.util.Scanner;

import javax.security.sasl.AuthenticationException;

public class PetTester {

	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		StoreUtility.addDefault();
		do {
			System.out.println(""
					+ "\n1. Login"
					+ "\n2. Add new Pet (Admin only functionality)"
					+ "\n3. Update Pet details (Admin only functionality)"
					+ "\n4. Display all available pets"
					+ "\n5. Order a Pet"
					+ "\n6. Check order status by Order Id"
					+ "\n7. Update order status (Admin only functionality)"
					+ "\n0. Exit");
			choice = sc.nextInt();
			try {
				StoreUtility.validateAutherization(choice);				
			} catch (AuthorizationException e) {
				System.err.println(e.getMessage());
				choice = -1;
			}
			
			switch(choice) {
			case 1:
				StoreUtility.Login();
				break;
			case 2:
				
				break;
			case 3:
				break;
			case 4:
				StoreUtility.showPetList();
			}
			
			
		}while(choice !=0);
	}

}
