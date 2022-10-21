package com.acts.petShop;

public interface Formate{
	public static String formate(String str, int spaces) {
		if(spaces - str.length() >= 0) {			
			return str+" ".repeat(spaces - str.length());
		}
		return str;
	}
	
	public static String title(String title, int spaces) {
		if(spaces - title.length() >= 0) {
			spaces -= title.length();
			return "*".repeat(spaces/2)+ title + "*".repeat(spaces/2);
		}
		return title;
	}

}
