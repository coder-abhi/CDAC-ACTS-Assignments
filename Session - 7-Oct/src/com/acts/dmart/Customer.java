package com.acts.dmart;

public class Customer {
 public String customerName;
 public Stock CustomersList[] = new Stock[5];
private double billAfterTax;
 public Customer(String name) {
	 this.customerName = name;
 }


public double getBillAfterTax() {
	return billAfterTax;
}
}
