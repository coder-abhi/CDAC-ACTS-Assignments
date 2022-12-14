package com.acts.strings;

public class ReverseString {
	public static String Reverse(String str) {
		// checking if string is invalid
		if(null == str || str.isBlank() || str.isEmpty()) {
			System.out.println("String is Invalid");
			return "";
		}
		
		// Reverse a string
		String result = "";
		int n = str.length()-1;
		while(n != -1) {
			result += str.charAt(n);
			n--;
		}
		return result;
	}

}
