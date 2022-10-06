package com.acts.player;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ScoreBoard {
	public static int TotalRuns;
	public static String CompleteScoreBoard[][];
	public static int currentOvers;
	public static int BallsInOver;
	public static int Wickets;
	public static int TotalOvers;

	public static Player CurrentBatsmans[] = new Player[2];
	public static Player CurrentBowler ;
	public static Player AllTeam[];
	
	public static Teams BattingTeam;
	public static Teams BowlingTeam;
//	public static int nextPlayerIndex = 0;
//	public static int nextBowlerIndex = 5;
	
	public static void StartMatch(Teams A,Teams B) {
		ResetScorBoard();
		BattingTeam = A;
		BowlingTeam = B;
		CompleteScoreBoard = new String[7][7];
		
		TotalOvers = 6;
		
		System.out.println("Batting Team : "+A.TeamName+"\t Bowling Team : "+B.TeamName);
		
		OpeningBatsmanInitialise();
		BowlerInitialise();
		int ball = 1;
		Scanner sc = new Scanner(System.in);
		Random randomInt = new Random();
		
		while(currentOvers < TotalOvers && ball != -1) {
			
			System.out.print("\nPress 1 To Continue and -1 to Stop : ");
			ball = sc.nextInt();
			
			int currentBall = randomInt.nextInt(-1,7);
			
			System.out.print("\nCurrentBall = ");
			if (currentBall == 5) currentBall = 1;
			BallsInOver++;
			CurrentBatsmans[0].addBallFaced();
			
//			boolean isOverComplete = ScoreBoard.isOversComplete();
			
			if(currentBall == -1) {
				System.err.println("Wicket");
				Wickets++;
				ScoreBoard.CompleteScoreBoard[currentOvers][BallsInOver-1] = "W";
				CurrentBowler.addWicket();
				if(Wickets == 5) break;
				WicketTeken();
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
				ChangeBowler();
				ShowCompleteScoreBoard();
//				PrintCompleteScoreBoard();
			} 
			
		}
		
		PrintMatchSummary();
		
	}
	
	
	public static void ShowCompleteScoreBoard() {
		for(int i=0; i<CurrentBatsmans.length; i++) {
			System.out.println(CurrentBatsmans[i].toStringBatsman());
		}
		System.out.println("\t\t\tTotal Runs : "+TotalRuns+"\tOvers : "+currentOvers+"."+BallsInOver
				+"\tWickets : "+BattingTeam.Wickets);
		
		System.out.println("Next Bowler : "+CurrentBowler.getName());
	}
	
	public static void ShowScore() {
		System.out.println("\nBatsmans : *"+CurrentBatsmans[0].getName()+"    "+CurrentBatsmans[1].getName()
				+ "\tBowler : "+CurrentBowler.getName());
		System.out.println("\t\t\tTotal Runs : "+TotalRuns+"\t\tOvers : "+currentOvers+"."+BallsInOver
				+"\tWickets : "+Wickets);
	}
	
	public static boolean isOversComplete() {
		if(BallsInOver == 6) {
			BallsInOver = 0;
			currentOvers++;
			return true;
		}
		return false;
	}
	public static void OpeningBatsmanInitialise() {

		CurrentBatsmans[0] = BattingTeam.AllTeam[0];
		CurrentBatsmans[1] = BattingTeam.AllTeam[1]; 
	}
	public static void BowlerInitialise() {
		CurrentBowler = BowlingTeam.NextBowler();
	}
	public static void WicketTeken() {
		CurrentBatsmans[0] = BattingTeam.NextBatsman();
	}
	
	public static void ChangeBowler() {
		CurrentBowler = BowlingTeam.NextBowler();
		
	}
	   
//	public static void PrintAllTeam() {
//		for(int i=0;i<6;i++) {
//			System.out.println(AllTeam[i].toString());
//		}
//	}
//	public static void PrintCompleteScoreBoard() {
//		for(int i=0;i<6;i++) {
//			System.out.println("Over "+(i+1)+" : "+Arrays.toString(CompleteScoreBoard[i]));
//		}
//	}
	public static void SwapPlayer(Player player[]) {
		Player temp = player[0];
		player[0] = player[1];
		player[1] = temp;
	}
	
	public static void PrintMatchSummary() {
		System.out.println("\t\t\tTotal Runs : "+TotalRuns+"\t\tOvers : "+currentOvers+"."+BallsInOver
				+"\tWickets : "+BattingTeam.Wickets);
		BattingTeam.PrintAllBatsman();
		
		BowlingTeam.PrintAllBowler();
		
	}
	
	public static void ResetScorBoard() {
		TotalRuns = 0;
		currentOvers = 0;
		BallsInOver = 0;
		Wickets = 0;	
	}
}
