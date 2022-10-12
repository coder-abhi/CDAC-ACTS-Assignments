package com.acts.student;

public interface SFormat{
	public static String strFormat(String str, int spaces) {
		if(spaces - str.length() >= 0) {			
			return str+" ".repeat(spaces - str.length());
		}
		return str;
	}

}
