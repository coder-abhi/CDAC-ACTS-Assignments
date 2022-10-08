package com.acts.dmart;

import java.util.Arrays;
import java.util.Scanner;

public class Store {
	public static Stock ItemsList[] = new Stock[90];

	public static int itemCount = 0;
	public static int counter = 5;
	static Scanner sc = new Scanner(System.in);
	
	static {
		System.out.println("In Block");
	}
	
	public static void updateInventory() {
		for(int i=0;i<5;i++) {
			
			ItemsList[i] = DefaultStocks.tempStock[i];
		}
//		ItemsList[counter++] = new Stock(name,category,price,qty);
	}

	public static void addStock() {
//		for(int i =0; i<5;i++) {
//		ItemsList[i] = DefaultStocks.tempStock[i];
//		}
		
		System.out.println("Enter Item name:");
		String name = sc.next();
		System.out.println("Enter Item Category:");
		String category = sc.next();
		System.out.println("Enter Item Price:");
		double price = sc.nextDouble();
		System.out.println("Enter Item Quantity:");
		int qty = sc.nextInt();
		ItemsList[counter++] = new Stock(name,category,price,qty);

	}

	public static void BuyStock(Customer person) {
		System.out.println("Choose Product to Buy : ");
		ShowInventory();

		int choice = sc.nextInt();

		System.out.println("Enter Quantity to Buy !"); 

		int reqQty = sc.nextInt();

		ItemsList[choice-1].purchased(reqQty);
		person.CustomersList[itemCount++] = new Stock(ItemsList[choice-1],reqQty);

	}

	public static void ShowInventory() {
		System.out.println("".repeat(15)+"Store Inverntory");
		System.err.println(" ".repeat(4)+Formater.formate("Product Name", 20)+Formater.formate("Category", 20)+Formater.formate("Quanity", 15)+Formater.formate("Price", 15));
		for(int i=0;i <counter;i++) {
			System.out.println((i+1)+" : "+ItemsList[i].toString());
		}
		System.out.println();
		
	}
	
	public static void generateBill(Customer person) {
		double totalBill = 0.0;
		int totalQty = 0;
		System.out.println("Customer Items List");
		System.out.println("-".repeat(30)+"YOUR BILL"+"-".repeat(30));
		System.err.println(" ".repeat(4)+Formater.formate("Product Name", 20)+Formater.formate("Category", 20)
		+Formater.formate("Quanity", 12)+Formater.formate("Price", 15)+Formater.formate("TotaL Price", 15));

		for(int i=0;i <itemCount;i++) {
			totalBill += person.CustomersList[i].getPrice() * person.CustomersList[i].getQty();
			totalQty += person.CustomersList[i].getQty();
			
			
			System.out.println((i+1)+" : "+person.CustomersList[i].toStringForBill());
		}
		System.out.println("\n"+" ".repeat(15)+"Total Quantity : "+totalQty+" ".repeat(8)+"Total Bill : "+totalBill+"\n");

		addGST(person);
		addDiscount(person);
		
	}
	
	public static void addGST(Customer person) {
		double billAfterTax = 0.0;
		double currentFinalAmt;
		System.err.println("\n\n"+" ".repeat(4)+Formater.formate("Taxable Amount", 20)+Formater.formate("CGST 2.5%", 15)+Formater.formate("SGST 2.5%", 15)+Formater.formate("Final Amount", 15));
		
		for(int i=0 ; i < itemCount ; i++) {
//			currentPrice = person.CustomersList[i].getPrice()*person.CustomersList[i].getQty();
//			currentFinalAmt = currentPrice * 1.05;
//			System.out.println(" ".repeat(6) +Formater.formate(currentPrice+"",20)  + Formater.formate(currentPrice*0.025+"",15) + 
//					Formater.formate(currentPrice*0.025+"",10) + Formater.revFormate(currentFinalAmt+"", 10) );
//			
//			billAfterTax += currentFinalAmt;
			
			billAfterTax += person.CustomersList[i].applyTax();
			
		}

		System.out.println("\n"+"-".repeat(70)+"\n"+" ".repeat(15)+"Your  Bill After Tax: "+billAfterTax);
	}
	
	public static void addDiscount(Customer person) {
		double discountedBill = 0.0;
		System.out.println("(Available Discounts : 10% on Clothing, 20% on Education, 15% on Accesories)");
		for(int i=0;i <itemCount;i++) {
			discountedBill += person.CustomersList[i].getDiscountPrice() * person.CustomersList[i].getQty();
		}
		System.err.println("\n"+" ".repeat(15)+" Your Final Bill After Dicount : "+discountedBill);
		System.out.println("-".repeat(70));
	}
}
