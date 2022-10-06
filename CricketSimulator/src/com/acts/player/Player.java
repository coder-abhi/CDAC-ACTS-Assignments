package com.acts.player;

import java.util.Date;
import java.util.Scanner;

public class Player extends Person implements StringFormater{
	// Player attributes
	int run;
	Position position;
	int avg;
	int Fifty;
	int ballFaced;
	
	// Player Bowling attributes
	int Wickets;
	int OversBowled;
	int RunGiveAway;
	
	public Player() {
		
	}
	
	public Player(String name,Position position) {
		this.name = name;
		this.position = position;
	}
	
	public Player(String name,int age, String adress,Date dateOfBirth) {
		super();
		this.name = name;
		this.run = 120;
		this.position = Position.ALL_ROUNDER;
	}
	
	public void setNamePosition(String name,Position position){
		this.name = name;
		this.position = position;
	}
	
	// Add runs in Player Profile
	public void addRuns(int runs) {
		this.run += runs;
	}
	
	// Add no. of Ball faced by Player
	public void addBallFaced() {
		this.ballFaced++;
	}
	
	// Add no. of Overs Bowler Bowled
	public void addOverBowled() {
		this.OversBowled++;
	}
	
	// Add no. of Wickets Bowler Taken
	public void addWicket() {
		this.Wickets++;
	}
	
	// Adding No. of Runs given by Bowler
	public void addRunsGiveAway(int runs) {
		this.RunGiveAway += runs;
	}
	
	// Getting no of balls Faced by Batsman
	public int getBallFaced() {
		return ballFaced;
	}

	// Printer for Batsman
	public String toStringBatsman() {
		return StringFormater.Formate(this.name, 15)+this.run+"("+this.ballFaced+")";
	}
	
	// Printer for Bowler
	public String toStringBowler() {
		return StringFormater.Formate(this.name, 15) +"\tOvers : "+this.OversBowled+"\tRuns : "+this.RunGiveAway+"\tWickets : "+this.Wickets;
	}
	
	public void PrintProfile() {
		System.out.println("Name : "+name+"\tAge : "+age+"\nAdress : "+adress+"\nPosition : "+position+
				"\nRun : "+run+"Average : "+avg);
	}
	
}
