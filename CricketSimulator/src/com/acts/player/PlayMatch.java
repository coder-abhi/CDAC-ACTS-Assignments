package com.acts.player;

public class PlayMatch {

	public static void main(String[] args) {
		Teams A = new Teams("Mumbai Indians",Squad.MI);
		Teams B = new Teams("Chennai Super Kings",Squad.CSK);
		
		ScoreBoard.StartMatch(A, B);
		
	}

}
