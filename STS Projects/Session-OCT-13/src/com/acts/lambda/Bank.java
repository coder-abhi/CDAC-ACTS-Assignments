package com.acts.lambda;

public class Bank implements Payable,Operation{

	@Override
	public void pay() {
		System.out.println("Payable is called !!");
	}

//	@Override
//	public Object perform(Object J, Object K) {
		
//		return;
//	}
	
}
