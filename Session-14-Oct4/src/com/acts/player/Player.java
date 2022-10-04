package com.acts.player;

import java.util.Date;

public class Player extends Person{
	int run;
	Position position;
	int avg;
	int strength;
	public Player(String name) {
		this.name = name;
		this.run = 120;
	}

	public Player(String name,int age, String adress,Date dateOfBirth) {
		
		super();
		this.name = name;
		this.run = 120;
		this.position = Position.ALL_ROUNDER;
		
	}
	
	public void setPlayerAttributes(int run, Position position, int avg, int strength) {
		this.run = run;
		this.position = position;
		this.avg = avg;
		this.strength = strength;
		
	}
	
	public void PrintRun() {
		System.out.println("Total runs are : " + this.run);
	}
	
	public void PrintProfile() {
		System.out.println("Name : "+name+"\tAge : "+age+"\nAdress : "+adress+"\nPosition : "+position+
				"\nRun : "+run+"Average : "+avg);
	}
	
}
