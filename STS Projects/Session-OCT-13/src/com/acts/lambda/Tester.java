package com.acts.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Tester {

	public static void main(String[] args) {
		
		// Old method via creating class and implement interface
		Bank boi = new Bank();
		boi.pay();
		
		// Creating object interface onTheFly
//		Payable paySBI = new Payable() {
//			public void pay() {
//				System.out.println("Payble is called in Tester");
//			}};
			
//			paySBI.pay();
			
			// Creating object and implementing unimplemented method in one line;
//			Payable paySBI2 = ()-> System.out.println("Payble is called in lambda");
//			paySBI2.pay();
			
		Function<Integer,Integer> fn = (a) -> a;
		System.out.println(fn.apply(101));
		BiFunction<Integer, Integer, Integer> bFn = (a,b) -> a+b;
		System.out.println(bFn.apply(74, 26));
		Predicate<Integer> pFn = (a) -> a==1;
		System.out.println(pFn.test(10)); 
			
	}
}
