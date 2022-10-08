package com.acts.dmart;

import java.util.Scanner;

public class StoreTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ochoice=0;
		int choice=0;
		
		Store.updateInventory();
		do {
			System.out.println("1. For Owner \n2. For Customer \n3. Exit");
			ochoice = sc.nextInt();
			switch(ochoice) {
			case 1: 
			do {
				{System.out.println("1.Show Inventory \n 2.Add Stock");
				choice = sc.nextInt();
				switch(choice) {
				case 1: {
					Store.ShowInventory();
					break;
				}
				case 2:{
					Store.addStock();
					break;
				}
				}
			}

				
			}while(choice!=0);
			break;
			
			case 2: 
				System.out.println("Enter name of Customer !");
				String name = sc.next();
				Customer person = new Customer(name);
				do {
					
					
					System.out.println("0 to Exit \n1. For Buy Product \n2.Generate Bill");
					choice = sc.nextInt();
					
					switch(choice) {
					case 1:
						Store.BuyStock(person);
						break;
				   case 2:
					Store.generateBill(person);
					break;
					}
				}while(choice != 0);
			
			}
		}while(ochoice !=0);
	}

}
