package com.acts.playerTester;
import java.text.ParseException;
import java.util.Date;

import com.acts.player.DateUtils;
import com.acts.player.Person;
import com.acts.player.Player;

public class PlayerTester {

	public static void main(String[] args) throws ParseException {
		Person person = new Person();
//		person.PrintName();
		
		
		Player player = new Player();
		player.PrintName();
		player.PrintRun();
		
//		Person person2 =  new Player();
		
		Date dob = DateUtils.getDate("04/10/2022", DateUtils.DD_MM_YYYY);

	}

}