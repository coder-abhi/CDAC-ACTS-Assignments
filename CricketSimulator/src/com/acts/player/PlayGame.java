package com.acts.player;
import java.util.Random;
import java.util.Scanner;

import com.acts.player.ScoreBoard;
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
		ScoreBoard.AllTeam[0].setNamePosition("Abhishek", Position.BATSMAN);
		ScoreBoard.AllTeam[1].setNamePosition("Rohit", Position.BATSMAN);
		ScoreBoard.AllTeam[2].setNamePosition("Surya", Position.BATSMAN);
		ScoreBoard.AllTeam[3].setNamePosition("Ishant", Position.BOWLER);
		ScoreBoard.AllTeam[4].setNamePosition("SHami", Position.BOWLER);
		ScoreBoard.AllTeam[5].setNamePosition("Bumrah", Position.BOWLER);
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
		ScoreBoard.AllTeam = new Player[6];
		for(int i=0;i<6;i++) {
			ScoreBoard.AllTeam[i] = new Player();
		}
		SetAllTeam();
		ScoreBoard.PrintAllTeam();
		ScoreBoard.OpeningBatsmanInitialise();
		ScoreBoard.BowlerInitialise();
		ScoreBoard.ShowScore();
		
		ScoreBoard.CompleteScoreBoard = new String[6][6];
		
		while(ball != -1) {
			System.out.print("\nPress 1 To Continue and -1 to Stop : ");
			ball = sc.nextInt();
			int currentBall = randInt.nextInt(-1,7);
			System.out.print("\nCurrentBall = "+currentBall);
			ScoreBoard.BallsInOver++;
			ScoreBoard.CurrentBatsmans[0].addBallFaced();
//			boolean isOverComplete = ScoreBoard.isOversComplete();
			
			if (currentBall == 5) currentBall = 1;
			if(currentBall == -1) {
				ScoreBoard.Wickets++;
				ScoreBoard.WicketTeken();
				ScoreBoard.CompleteScoreBoard[ScoreBoard.Overs][ScoreBoard.BallsInOver-1] = "W";
			}
			else {
				ScoreBoard.TotalRuns += currentBall;
				ScoreBoard.CurrentBatsmans[0].addRuns(currentBall);
				if(currentBall%2 == 1) {
					SwapPlayer(ScoreBoard.CurrentBatsmans);
				}
				ScoreBoard.CompleteScoreBoard[ScoreBoard.Overs][ScoreBoard.BallsInOver-1] = currentBall+"";
			}
			
			boolean isOverComplete = ScoreBoard.isOversComplete();
			ScoreBoard.ShowScore();
			if(isOverComplete) {
				ScoreBoard.ShowCompleteScoreBoard();
				ScoreBoard.PrintCompleteScoreBoard();
			} 
			
		}
		ScoreBoard.PrintAllTeam();
		
		

	}

}
