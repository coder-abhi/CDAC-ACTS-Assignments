package com.acts.player;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ScoreBoard implements StringFormater{
	public  int TotalRuns;
	public  String CompleteScoreBoard[][];
	public  int currentOvers;
	public  int BallsInOver;
	public  int Wickets;
	public  int TotalOvers;

	public  Player CurrentBatsmans[] = new Player[2];
	public  Player CurrentBowler ;
	public  Player AllTeam[];
	
	public Teams BattingTeam;
	public Teams BowlingTeam;
//	public static int nextPlayerIndex = 0;
//	public static int nextBowlerIndex = 5;
	public boolean isAllOut = false;
	
	
	public void StartMatch(Teams A,Teams B) {
		ResetScorBoard();
		BattingTeam = A;
		BowlingTeam = B;
		CompleteScoreBoard = new String[7][6];
		
		for(int i=0;i<7;i++) {
			Arrays.fill(CompleteScoreBoard[i], "-");
		}
		
		int ballSkip = 1;
		TotalOvers = 6;
		
		System.out.println("Batting Team : "+A.TeamName+"\t Bowling Team : "+B.TeamName);
		
		OpeningBatsmanInitialise();
		BowlerInitialise();
		int ball = 0;
		Scanner sc = new Scanner(System.in);
		Random randomInt = new Random();
		
		while(currentOvers < TotalOvers && ball != -2) {
			
			if(ball <= 0) {
				System.out.print("\nPress 1 To Continue and -1 to Stop : ");
				ball = sc.nextInt();
			}
		

			
			int currentBall = randomInt.nextInt(-1,7);
			ball--;
			
			System.out.print("\nCurrentBall = ");
			if (currentBall == 5) currentBall = 1;
			BallsInOver++;
			CurrentBatsmans[0].addBallFaced();
			
//			boolean isOverComplete = ScoreBoard.isOversComplete();
			
			if(currentBall == -1) {
				System.err.println("Wicket!!!\t"+CurrentBatsmans[0].toStringBatsman()+" got out by "+CurrentBowler.getName());
//				Wickets++;
				CompleteScoreBoard[currentOvers][BallsInOver-1] = "W";
				CurrentBowler.addWicket();
//				if(Wickets == 5) break;
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
				
//				ShowCompleteScoreBoard();
//				PrintCompleteScoreBoard();
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
				+"\tWickets : "+BattingTeam.Wickets);
		
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
	public void OpeningBatsmanInitialise() {

		CurrentBatsmans[0] = BattingTeam.AllTeam[0];
		CurrentBatsmans[1] = BattingTeam.AllTeam[1]; 
	}
	public void BowlerInitialise() {
		CurrentBowler = BowlingTeam.NextBowler();
	}
	public void WicketTeken() {
		Wickets++;
		if(Wickets >= 6) {
			System.out.println(BattingTeam.TeamName+" is All Out !!!");
			isAllOut = true;
			return ;
		}
		CurrentBatsmans[0] = BattingTeam.NextBatsman();
	}
	
	public void ChangeBowler() {
		CurrentBowler = BowlingTeam.NextBowler();
		
	}
	   
//	public static void PrintAllTeam() {
//		for(int i=0;i<6;i++) {
//			System.out.println(AllTeam[i].toString());
//		}
//	}
	public void PrintCompleteScoreBoard() {
		
		for(int i=0;i<6;i++) {
			System.out.println(" ".repeat(15)+"Over "+(i+1)+" : "+Arrays.toString(CompleteScoreBoard[i]));
		}
	}
	public void SwapPlayer(Player player[]) {
		Player temp = player[0];
		player[0] = player[1];
		player[1] = temp;
	}
	
	public void PrintMatchSummary() {
		System.out.println("*".repeat(60));
		System.out.println(" ".repeat(18)+"This Innings Stats 👇\n");
		PrintCompleteScoreBoard();
		
		System.out.println("\nTotal Runs : "+TotalRuns+"\t\tTotal Overs : "+currentOvers+"."+BallsInOver
				+"\tTotal Wickets : "+BattingTeam.Wickets);
		
		System.out.println("\n"+" ".repeat(18)+"Batting Stats 👇\n");
		BattingTeam.PrintAllBatsman();
		
		System.out.println("\n"+" ".repeat(18)+"Bowling Stats 👇\n");
		BowlingTeam.PrintAllBowler();
		
	}
	
	public void ResetScorBoard() {
		TotalRuns = 0;
		currentOvers = 0;
		BallsInOver = 0;
		Wickets = 0;	
	}
}
