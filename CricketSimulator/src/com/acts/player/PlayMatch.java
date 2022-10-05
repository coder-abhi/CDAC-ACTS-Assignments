package com.acts.player;

public class PlayMatch {

	public static void main(String[] args) {
		Teams A = new Teams(Squad.MI);
		Teams B = new Teams(Squad.CSK);
		
		ScoreBoard.StartMatch(A, B);
		
	}

}
