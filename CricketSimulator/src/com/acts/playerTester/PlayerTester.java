package com.acts.playerTester;
import java.awt.datatransfer.StringSelection;
import java.text.Format;
import java.text.ParseException;

import java.util.Date;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import com.acts.player.ScoreBoard;
import com.acts.player.DateUtils;
import com.acts.player.Person;
import com.acts.player.Player;


public class PlayerTester {
	
	public static String FormateString(String str,int spaces) {
		String tempString = " ".repeat(spaces - str.length());
		return str + tempString;
	}

	public static void main(String[] args) throws ParseException {
//		Person person = new Person();
//		person.PrintName();
		
		
//		Player player = new Player("ROHIT");
//		player.PrintName();
//		player.PrintRun();
		
//		Person person2 =  new Player();
		
//		Date dob = DateUtils.getDate("04/10/2022", DateUtils.DD_MM_YYYY);
		
		
//		System.out.println(++ScoreBoard.TotalRuns);
//		System.out.println(++ScoreBoard.TotalRuns);
		/*
		int len = 10;
		String name = "DJ";
		String NewName = " ".repeat(len-name.length());
		name += NewName;

		String name1 = "Abhishek";
		String NewName1 = " ".repeat(len - name1.length());
		name1 += NewName1;
		
		System.out.println(name+" : "+NewName.length());
		System.out.println(name1+" : "+NewName1.length());
		*/
//		System.out.println(FormateString("ABhishek",10)+":");
//		System.out.println(FormateString("DJ",10)+":");
		try {
			
			System.out.println(Integer.valueOf("as"));
		}
		catch(Exception e){
			
		}
	}

}