package com.acts.strings;
// String class is already created in java 

import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;



public class StringMethods {

	public static void main(String[] args) {
		String str1 = "CDAC"; // Creating string literals (stored in string literal pool)
		String str2 = "ACTS";
		String str3 = "ACTS";
		String str4 = new String("ACTS"); // Stored in heap
		out.println(str1);
		out.println(str2);
		out.println(str3);
		out.println(str4);

		//checking for reference
		if(str2 == str3) {
			out.println("Both refer to one");
		}

		if(str2 == str4) {
			out.println("**Both refer to one");
		}


		if(str2.equals(str4)) {
			out.println("*contents are same");
		}

		str4.intern();
		if(str2 == str4) {
			out.println("***Both ref to one");
		}

		//String Concatenation
		str1 = str1 + str2; //new string is created without changing the original string
		str2+= "Sunbeam";
		out.println(str1);
		out.println(str2);
		str2 = str2.concat(str4);
		out.println(str2);


		String rev1 = StringUtil.stringReverse(null);
		out.println(rev1);
		String rev2 = StringUtil.stringReverse("");
		out.println(rev2);
		String rev3 = StringUtil.stringReverse("    ");
		out.println(rev3);
		String rev4 = StringUtil.stringReverse("ACTS");
		out.println(rev4);
		String input = "CDAC";
		String rev5 = StringUtil.stringReverse(input);
		out.println(rev5);

		String str = "CDAC ACTS has proven placememt records";
		int index = str.indexOf("has");
		String subString = str.substring(index);
		out.println(subString);
	}

}