package com.acts.threading;

public class NewCount extends Thread {
	int num;
	NewCount (int starter ,String name){
		super(name);
		num = starter;
	}
	@Override
	public void run() {
		System.out.println(getName()+ "is running machine");
		try {
			while(num <= 100) {
				System.out.println(num + " -----> by "+getName());
				num+=2;
				Thread.sleep(4);				
			}
		}catch (Exception e) {
		}
	}
	
}
