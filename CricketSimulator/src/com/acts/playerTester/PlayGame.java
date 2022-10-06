package com.acts.playerTester;
import java.util.Random;
import java.util.Scanner;

import com.acts.player.Inning;
import com.acts.player.Player;
import com.acts.player.Position;
public class PlayGame {
	/*
	public void getPlayerInfo(Player player) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Name : ");
		player.setName(sc.next());
		System.out.println("Choose Position : 1 -> Batsman\t2 -> Bowler\t3 -> All Rounder");
		int position = sc.nextInt();
		if(position == 1) player.setPosition(Position.BATSMAN);
		else if(position == 2) player.setPosition(Position.BOWLER);
		else if(position == 3) player.setPosition(Position.ALL_ROUNDER);
	}
	*/
	
	public static void SetAllTeam() {
		Inning.AllTeam[0].setNamePosition("Abhishek", Position.BATSMAN);
		Inning.AllTeam[1].setNamePosition("Rohit", Position.BATSMAN);
		Inning.AllTeam[2].setNamePosition("Surya", Position.BATSMAN);
		Inning.AllTeam[3].setNamePosition("Ishant", Position.BOWLER);
		Inning.AllTeam[4].setNamePosition("SHami", Position.BOWLER);
		Inning.AllTeam[5].setNamePosition("Bumrah", Position.BOWLER);
	}
	
	public static void SwapPlayer(Player player[]) {
		Player temp = player[0];
		player[0] = player[1];
		player[1] = temp;
	}

	public static void main(String[] args) {
		Random randInt = new Random();
		Scanner sc = new Scanner(System.in);
//		System.out.println(ball);
		int ball = 1;
		
		
		 /*
		ScoreBoard.CurrentBatsmans = new Player[2];
		ScoreBoard.CurrentBatsmans[0] = new Player();
		ScoreBoard.CurrentBatsmans[1] = new Player();
		System.out.println("Enter Name of 2 Batsman : ");
		ScoreBoard.CurrentBatsmans[0].setNamePosition(sc.next(), Position.BATSMAN);
		ScoreBoard.CurrentBatsmans[1].setNamePosition(sc.next(),Position.BATSMAN);
		ScoreBoard.CurrentBowler = new Player[1];
		
		ScoreBoard.CurrentBowler[0] = new Player();
		System.out.println("Enter Name of Bowler : ");
		ScoreBoard.CurrentBowler[0].setNamePosition(sc.next(),Position.BOWLER);
		*/
		Inning.AllTeam = new Player[6];
		for(int i=0;i<6;i++) {
			Inning.AllTeam[i] = new Player();
		}
		SetAllTeam();
		Inning.PrintAllTeam();
		Inning.OpeningBatsmanInitialise();
		Inning.BowlerInitialise();
		Inning.ShowScore();
		
		Inning.CompleteScoreBoard = new String[6][6];
		
		while(ball != -1) {
			System.out.print("\nPress 1 To Continue and -1 to Stop : ");
			ball = sc.nextInt();
			int currentBall = randInt.nextInt(-1,7);
			System.out.print("\nCurrentBall = "+currentBall);
			Inning.BallsInOver++;
			Inning.CurrentBatsmans[0].addBallFaced();
//			boolean isOverComplete = ScoreBoard.isOversComplete();
			
			if (currentBall == 5) currentBall = 1;
			if(currentBall == -1) {
				Inning.Wickets++;
				Inning.WicketTeken();
				Inning.CompleteScoreBoard[Inning.Overs][Inning.BallsInOver-1] = "W";
			}
			else {
				Inning.TotalRuns += currentBall;
				Inning.CurrentBatsmans[0].addRuns(currentBall);
				if(currentBall%2 == 1) {
					SwapPlayer(Inning.CurrentBatsmans);
				}
				Inning.CompleteScoreBoard[Inning.Overs][Inning.BallsInOver-1] = currentBall+"";
			}
			
			boolean isOverComplete = Inning.isOversComplete();
			Inning.ShowScore();
			if(isOverComplete) {
				Inning.ShowCompleteScoreBoard();
				Inning.PrintCompleteScoreBoard();
			} 
			
		}
		Inning.PrintAllTeam();
		
		

	}

}
