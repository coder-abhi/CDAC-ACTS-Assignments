package com.acts.student;

public interface SFormat{
	public static String strFormat(String str, int spaces) {
		return str+" ".repeat(spaces - str.length());
	}

}
