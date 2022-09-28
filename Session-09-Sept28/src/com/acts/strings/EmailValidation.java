package com.acts.strings;

public class EmailValidation {
	public static boolean  CheckEmail(String input) {
		if(null == input || input.isBlank() || input.length() <= 10) return false;
		if(input.indexOf("@") != input.lastIndexOf("@")) return false;
		if(input.indexOf(".") - input.indexOf("@") < 3 ) return false;
		if(input.length() - input.indexOf(".") != 4 && input.length() - input.indexOf(".") != 3) return false;
		return true;
	}
}
