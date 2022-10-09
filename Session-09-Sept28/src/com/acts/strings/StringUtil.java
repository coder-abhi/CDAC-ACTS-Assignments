package com.acts.strings;
import static java.lang.System.in; 
import static java.lang.System.out;
import java.util.*;
public class StringUtil {
	public static final String EMPTY_STRING = "";

	public static boolean isEmptyString (String str) {
		if(null == str || str.isBlank()|| str.isEmpty()) {
			return true;
		}
		return false;
	}

	public static String stringReverse(String str) {
		if(StringUtil.isEmptyString(str)) {
			out.println("String can not be reversed");
			return str;
		}
		String revStr = EMPTY_STRING;
		for (int i = 0; i< str.length(); i++) {
			revStr = str.charAt(i) + revStr;
		}
		return revStr;	
	}
	
	public static String isPalindrome(String Str) {
		if(StringUtil.isEmptyString(Str)) {
			return "Enter valid string "+"\n Entered: "+Str;
		}
		String string = Str;
		String reverse = StringUtil.stringReverse(Str);
		if(reverse.equalsIgnoreCase(string)) {
			return "Entered string is Palindrome";
		}
		else {
			return "Entered string is Not Palindrome";
		}
	}
}
