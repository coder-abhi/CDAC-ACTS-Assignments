package com.acts.stringTopicTester;

public class StringTester {

	public static void main(String[] args) {
		String str1 = "Pune";
		String str2 = "Pune";
		char str3[] = {'P','u','n','e'};
		String str4 = new String(str3);
		
		if(str1 == str2) {
			System.out.println("Str1 and Str2 both references are same");
		} else {
			System.out.println("Str1 and Str2 both references are Different");

		}
		
		if(str2 == str4) {
			System.out.println("Str2 and Str4 both references are same");
		} else {
			System.out.println("Str2 and Str4 both references are Different");
		}
	}

}
