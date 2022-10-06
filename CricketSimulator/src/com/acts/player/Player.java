package com.acts.player;

import java.util.Date;
import java.util.Scanner;

public class Player extends Person implements StringFormater{
	int run;
	Position position;
	int avg;
	int Fifty;
	int ballFaced;
	
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
	
	public void setPlayerAttributes(int run, Position position, int avg, int strength) {
		this.run = run;
		this.position = position;
		this.avg = avg;
		
	}
	
	public void setNamePosition(String name,Position position){
		this.name = name;
		this.position = position;
	}
	
	public void addRuns(int runs) {
		this.run += runs;
	}
	
	public void addBallFaced() {
		this.ballFaced++;
	}
	
	public void addOverBowled() {
		this.OversBowled++;
	}
	public void addWicket() {
		this.Wickets++;
	}
	public void addRunsGiveAway(int runs) {
		this.RunGiveAway += runs;
	}
	
	public int getBallFaced() {
		return ballFaced;
	}

	public String toStringBatsman() {
		return StringFormater.Formate(this.name, 15)+this.run+"("+this.ballFaced+")";
	}
	public String toStringBowler() {
		return StringFormater.Formate(this.name, 15) +"\tOvers : "+this.OversBowled+"\tRuns : "+this.RunGiveAway+"\tWickets : "+this.Wickets;
	}
	
	public void PrintProfile() {
		System.out.println("Name : "+name+"\tAge : "+age+"\nAdress : "+adress+"\nPosition : "+position+
				"\nRun : "+run+"Average : "+avg);
	}
	
}
