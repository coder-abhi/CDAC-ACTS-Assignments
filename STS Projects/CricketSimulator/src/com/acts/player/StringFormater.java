package com.acts.player;

public interface StringFormater {
	public static String Formate(String str,int spaces) {
		String tempString = " ".repeat(spaces - str.length());
		return str + tempString;
	}
}
