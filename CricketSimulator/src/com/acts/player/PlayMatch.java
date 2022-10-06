package com.acts.player;

public class PlayMatch {
	public static void ShowWinner(Inning Innings1, Inning Innings2) {
		
		if(Innings1.currentOvers == 0 || Innings2.currentOvers == 0) System.out.println("Result cant Defined !!!");
		
		if(Innings1.TotalRuns > Innings2.TotalRuns) {

			System.err.println("\nWinner is "+Innings1.BattingTeam.TeamName+ "🎉🎉🎉🎉");
		} else if(Innings2.TotalRuns > Innings1.TotalRuns) {
			System.err.println("\nWinner is "+Innings2.BattingTeam.TeamName+ "🎉🎉🎉🎉");
		} else {
			System.err.println("\nMatch is Draw");
		}
	}

	public static void main(String[] args) {
		Teams A = new Teams("Mumbai Indians",Squad.MI);
		Teams B = new Teams("Chennai Super Kings",Squad.CSK);
		
		Inning Innings1 = new Inning();
		Inning Innings2 = new Inning();
		
		Innings1.StartMatch(A, B);
		
		System.out.println("\nPress 1 to Continue for Second Innings : ");
		
		Innings2.StartMatch(B,A);
		
		ShowWinner(Innings1,Innings2);
		
		
	}

}
