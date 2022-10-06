package com.acts.player;

public class PlayMatch {

	public static void main(String[] args) {
		Teams A = new Teams("Mumbai Indians",Squad.MI);
		Teams B = new Teams("Chennai Super Kings",Squad.CSK);
		
		ScoreBoard Innings1 = new ScoreBoard();
		Innings1.StartMatch(A, B);
		
		System.out.println("\nPress 1 to Continue for Second Innings : ");
		
		Innings1.StartMatch(B,A);
		
		
	}

}
