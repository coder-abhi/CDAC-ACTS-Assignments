package com.acts.lambda;

public class Tester {

	public static void main(String[] args) {
		
		// Old method via creating class and implement interface
		Bank boi = new Bank();
		boi.pay();
		
		// Creating object interface onTheFly
		Payable paySBI = new Payable() {
			public void pay() {
				System.out.println("Payble is called in Tester");
			}};
			
			paySBI.pay();
			
			// Creating object and implementing unimplemented method in one line;
			Payable paySBI2 = ()-> System.out.println("Payble is called in lambda");
			paySBI2.pay();
			
			
	}
}
