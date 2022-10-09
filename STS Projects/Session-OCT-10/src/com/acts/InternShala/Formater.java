package com.acts.InternShala;

public interface Formater{
	public static String formate(String str, int spaces) {
		return str+" ".repeat(spaces - str.length());
	}

}
