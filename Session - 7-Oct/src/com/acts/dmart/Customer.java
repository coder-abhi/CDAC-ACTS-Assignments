package com.acts.dmart;

public class Customer {
 public String customerName;
 public Stock CustomersList[] = new Stock[5];
private double billAfterTax;
 public Customer(String name) {
	 this.customerName = name;
 }
//public void setAfterTaxBill(double billAfterTax) {
//	this.billAfterTax = billAfterTax;
//}
public double getBillAfterTax() {
	return billAfterTax;
}
}
