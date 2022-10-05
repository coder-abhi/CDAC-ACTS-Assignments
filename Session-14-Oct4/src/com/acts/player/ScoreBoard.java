package com.acts.player;

import java.util.Arrays;

public class ScoreBoard {
	public static int TotalRuns;
	public static String CompleteScoreBoard[][];
	public static int Overs;
	public static int BallsInOver;
	public static int Wickets;

	public static Player CurrentBatsmans[];
	public static Player CurrentBowler[];
	public static Player AllTeam[];
	public static int nextPlayerIndex = 0;
	public static int nextBowlerIndex = 5;
	public static void ShowCompleteScoreBoard() {
		for(int i=0; i<CurrentBatsmans.length; i++) {
			System.out.println(CurrentBatsmans[i].toString());
		}
		System.out.println("\t\t\tTotal Runs : "+TotalRuns+"\tOvers : "+Overs+"."+BallsInOver
				+"\tWickets : "+Wickets);
	}
	
	public static void ShowScore() {
		System.out.println("\nBatsmans : *"+CurrentBatsmans[0].getName()+"    "+CurrentBatsmans[1].getName()
				+ "\tBowler : "+CurrentBowler[0].getName());
		System.out.println("\t\t\tTotal Runs : "+TotalRuns+"\t\tOvers : "+Overs+"."+BallsInOver
				+"\tWickets : "+Wickets);
	}
	
	public static boolean isOversComplete() {
		if(BallsInOver == 6) {
			BallsInOver = 0;
			Overs++;
			return true;
		}
		return false;
	}
	public static void OpeningBatsmanInitialise() {

		CurrentBatsmans = new Player[2];
		CurrentBatsmans[0] = AllTeam[0];
		CurrentBatsmans[1] = AllTeam[1];
		nextPlayerIndex += 2;
	}
	public static void BowlerInitialise() {

		CurrentBowler = new Player[1];
		CurrentBowler[0] = AllTeam[5];
	}
	public static void WicketTeken() {
		CurrentBatsmans[0] = AllTeam[nextPlayerIndex];
		nextPlayerIndex++;
	}
	
	public static void ChangeBowler(int index) {
		CurrentBowler[0] = AllTeam[index];
	}
	   
	public static void PrintAllTeam() {
		for(int i=0;i<6;i++) {
			System.out.println(AllTeam[i].toString());
		}
	}
	public static void PrintCompleteScoreBoard() {
		for(int i=0;i<6;i++) {
			System.out.println("Over "+(i+1)+" : "+Arrays.toString(CompleteScoreBoard[i]));
		}
	}
}
