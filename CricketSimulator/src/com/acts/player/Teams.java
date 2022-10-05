package com.acts.player;

import java.util.Arrays;

public class Teams {
	public int TotalRuns;
	public String CompleteScoreBoard[][];
	public int Wickets;
	
	public Player AllTeam[];
	public int nextBatsmanIndex;
	public int nextBowlerIndex ;
	
	public Teams(Player team[]) {
		AllTeam = new Player[7];
		AllTeam = team;
		CompleteScoreBoard = new String[6][];
		TotalRuns = 0;
		Wickets = 0;
//		Arrays.fill(CompleteScoreBoard,0);
		nextBatsmanIndex = 2;
		nextBowlerIndex = 6;
		
	}
	
	public Player NextBowler() {
		return AllTeam[nextBowlerIndex];
	}
	
	public Player NextBatsman() {
		return AllTeam[nextBatsmanIndex++];
	}
	
	public void PrintAllBatsman() {
		for(int i=0;i<7;i++) {
			if(AllTeam[i].getBallFaced() != 0) System.out.println(AllTeam[i].toStringBatsman());
		}
	}
	
	public void PrintAllBowler() {
		for(int i=0;i<7;i++) {
			if(AllTeam[i].position == Position.BOWLER) System.out.println(AllTeam[i].toStringBowler());
		}
	}
	
	public void PrintCompleteScoreBoard() {
		for(int i=0;i<6;i++) {
			System.out.println("Over "+(i+1)+" : "+Arrays.toString(CompleteScoreBoard[i]));
		}
	}
	
}
