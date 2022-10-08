package com.acts.dmart;


public interface Formater {
	public static String formate(String str,int spaces) {
		String tempString = " ".repeat(spaces - str.length());
		return str + tempString;
	}
	public static String revFormate(String str,int spaces) {
		String tempString = " ".repeat(spaces - str.length());
		return tempString + str;
	}
}
