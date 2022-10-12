package com.acts.student;

public interface Formate{
	public static String formate(String str, int spaces) {
		if(spaces - str.length() >= 0) {			
			return str+" ".repeat(spaces - str.length());
		}
		return str;
	}

}
