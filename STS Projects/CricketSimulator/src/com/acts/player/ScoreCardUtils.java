package com.acts.player;

import java.util.Arrays;

public class ScoreCardUtils {
	public  int currentOvers;
	public  int Wickets;
	public  String CompleteScoreBoard[][];
	public  int BallsInOver;
	public  int TotalRuns;
	
	// Attributes for Teams
	public  Player CurrentBatsmans[] = new Player[2];
	public  Player CurrentBowler ;
	
	
	
	public void ShowOverStats() {
		System.out.println("-".repeat(60));
		
		System.out.println("\t  This Over ("+(currentOvers+1)+") : "+Arrays.toString(CompleteScoreBoard[currentOvers-1]) );
		ShowScore();
//		ChangeBowler();
		System.out.println("\nNext Bowler : "+StringFormater.Formate( CurrentBowler.getName(), 20) + "Batsman on Strike : "+CurrentBatsmans[0].getName());
		System.out.println("-".repeat(60));
	}
	
	public void ShowScore() {
		System.out.println("\nBatsmans   : *"+StringFormater.Formate(CurrentBatsmans[0].getName(),10)+StringFormater.Formate(CurrentBatsmans[1].getName(),13)
				+ "|   Bowler : "+StringFormater.Formate(CurrentBowler.getName(),10));
		System.out.println("Total Runs : "+ TotalRuns+"\t\tOvers : "+currentOvers+"."+BallsInOver
				+"\t Total Wickets : "+Wickets);
	}
	
	// Assigning New Bowler From Bowling Team -> to Current Bowler
	public void ChangeBowler(Teams BowlingTeam) {
		CurrentBowler = BowlingTeam.NextBowler();
		
	}

}
