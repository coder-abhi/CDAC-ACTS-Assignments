package com.acts.threading;

public class NewCountTester {

	public static void main(String[] args) throws InterruptedException {
		NewCount nw = new NewCount(0,"Summer Thread!!");
		NewCount nw2 = new NewCount(1,"Odder Thread!!");
		nw.start();
		Thread.sleep(2);
		nw2.start();
	}

}
