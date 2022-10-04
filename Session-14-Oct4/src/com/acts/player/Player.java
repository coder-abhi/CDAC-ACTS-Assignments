package com.acts.player;

public class Player extends Person{
	int run;
	String position;
	int avg;

	public Player() {
		
		super();
		this.run = 120;
		
	}
	
	public void PrintRun() {
		System.out.println("Total runs are : " + this.run);
	}
}
