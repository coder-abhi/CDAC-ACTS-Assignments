package com.acts.player;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ScoreBoard implements StringFormater{
	// Innings Attributes 
	public  int TotalRuns;
	public  String CompleteScoreBoard[][];
	public  int currentOvers;
	public  int BallsInOver;
	public  int Wickets;
	public  int TotalOvers;

	// Attributes for Teams
	public  Player CurrentBatsmans[] = new Player[2];
	public  Player CurrentBowler ;
//	public  Player AllTeam[];
	
	public Teams BattingTeam;
	public Teams BowlingTeam;

	// To Check if Team is all out or not
	public boolean isAllOut = false;
	
	
	public void StartMatch(Teams A,Teams B) {
		// Assigning first team for Batting and Second for Bowling
		BattingTeam = A;
		BowlingTeam = B;
		
		// Declare and Initialise ScoreBoard 2D Array
		CompleteScoreBoard = new String[7][6];
		
		for(int i=0;i<7;i++) {
			Arrays.fill(CompleteScoreBoard[i], "-");
		}
		
		// Deciding No. of Overs in Match
		TotalOvers = 6;
		
		System.out.println("Batting Team : "+A.TeamName+"\t Bowling Team : "+B.TeamName);
		
		// Initialise Batsman and Bowler
		OpeningBatsmanInitialise();
		BowlerInitialise();
		
		int ball = 0;
		
		// Initialise Necessary Objects
		Scanner sc = new Scanner(System.in);
		Random randomInt = new Random();
		
		
		while(currentOvers < TotalOvers && ball != -2) {
			
			if(ball <= 0) {
				System.out.print("\nPress No. of Balls to Play or -1 to Stop : ");
				ball = sc.nextInt();
			}
			
			int currentBall = randomInt.nextInt(-1,7);
			
			System.out.print("\nCurrentBall = ");
			
			// In criker 5 runs is so rare so 5 also means Single run in this program
			if (currentBall == 5) currentBall = 1;
			
			ball--;
			BallsInOver++;
			CurrentBatsmans[0].addBallFaced();
			
			// if Random generate -1 Means its Wicket
			if(currentBall == -1) {
				System.err.println("Wicket!!!\t"+CurrentBatsmans[0].toStringBatsman()+" got out by "+CurrentBowler.getName());
				
				//Updating Score Board
				CompleteScoreBoard[currentOvers][BallsInOver-1] = "W";
				
				// Increased Wickets count and check if Team is Allout or not
				WicketTeken();
				
				if(isAllOut) break;
			}
			else {
				System.out.print(currentBall);
				TotalRuns += currentBall;
				CurrentBatsmans[0].addRuns(currentBall);
				CurrentBowler.addRunsGiveAway(currentBall);
				if(currentBall%2 == 1) {
					SwapPlayer(CurrentBatsmans);
				}
				CompleteScoreBoard[currentOvers][BallsInOver-1] = currentBall+"";
			}
			
			boolean isOverComplete = isOversComplete();
			ShowScore();
			if(isOverComplete) {
				CurrentBowler.addOverBowled();
				ShowOverStats();
			} 
			
		}
		
		PrintMatchSummary();

		
	}
	
	public void ShowOverStats() {
		System.out.println("-".repeat(60));
		System.out.println("\t  This Over ("+(currentOvers+1)+") : "+Arrays.toString(CompleteScoreBoard[currentOvers-1]) );
		ShowScore();
		ChangeBowler();
		System.out.println("\nNext Bowler : "+StringFormater.Formate( CurrentBowler.getName(), 20) + "Batsman on Strike : "+CurrentBatsmans[0].getName());
		System.out.println("-".repeat(60));
	}
	
	
	public void ShowCompleteScoreBoard() {
		for(int i=0; i<CurrentBatsmans.length; i++) {
			System.out.println(CurrentBatsmans[i].toStringBatsman());
		}
		System.out.println("\t\t\tTotal Runs : "+TotalRuns+"\tOvers : "+currentOvers+"."+BallsInOver
				+"\tWickets : "+Wickets);
		
		System.out.println("Next Bowler : "+CurrentBowler.getName());
	}
	
	public void ShowScore() {
		System.out.println("\nBatsmans   : *"+StringFormater.Formate(CurrentBatsmans[0].getName(),10)+StringFormater.Formate(CurrentBatsmans[1].getName(),13)
				+ "|   Bowler : "+StringFormater.Formate(CurrentBowler.getName(),10));
		System.out.println("Total Runs : "+ TotalRuns+"\t\tOvers : "+currentOvers+"."+BallsInOver
				+"\t Total Wickets : "+Wickets);
	}
	


	public boolean isOversComplete() {
		if(BallsInOver == 6) {
			BallsInOver = 0;
			currentOvers++;
			return true;
		}
		return false;
	}
	
	// Assigning 2 Player as Current Player from Team
	public void OpeningBatsmanInitialise() {
		CurrentBatsmans[0] = BattingTeam.AllTeam[0];
		CurrentBatsmans[1] = BattingTeam.AllTeam[1]; 
	}
	
	// Assigning 1 Bowler as Current Bowler
	public void BowlerInitialise() {
		CurrentBowler = BowlingTeam.NextBowler();
	}
	
	// Increased Wickets count and check if Team is Allout or not
	public void WicketTeken() {
		
		//Added Wicket to Bowler Profile
		CurrentBowler.addWicket();
		
		Wickets++;
		if(Wickets >= 6) {
			System.out.println(BattingTeam.TeamName+" is All Out !!!");
			isAllOut = true;
			return ;
		}
		
		// Assigning new Batsman From Batting Team to Current Batsman
		CurrentBatsmans[0] = BattingTeam.NextBatsman();
	}
	
	// Assigning New Bowler From Bowling Team -> to Current Bowler
	public void ChangeBowler() {
		CurrentBowler = BowlingTeam.NextBowler();
		
	}
	   
	// Printing 2D array To Print All Balls in All Overs
	public void PrintCompleteScoreBoard() {
		for(int i=0;i<6;i++) {
			System.out.println(" ".repeat(15)+"Over "+(i+1)+" : "+Arrays.toString(CompleteScoreBoard[i]));
		}
	}
	
	// Swapping Player to Change strike of Current Batsman
	// CurrentPlayer[0] means it is on strike!!
	public void SwapPlayer(Player player[]) {
		Player temp = player[0];
		player[0] = player[1];
		player[1] = temp;
	}
	
	// Printing All Runs , Batting Statis and Bowling Stats
	public void PrintMatchSummary() {
		System.out.println("*".repeat(60));
		System.out.println(" ".repeat(18)+"This Innings Stats 👇\n");
		PrintCompleteScoreBoard();
		
		System.out.println("\nTotal Runs : "+TotalRuns+"\t\tTotal Overs : "+currentOvers+"."+BallsInOver
				+"\tTotal Wickets : "+Wickets);
		
		System.out.println("\n"+" ".repeat(18)+"Batting Stats 👇\n");
		BattingTeam.PrintAllBatsman();
		
		System.out.println("\n"+" ".repeat(18)+"Bowling Stats 👇\n");
		BowlingTeam.PrintAllBowler();
		
	}
	
}
