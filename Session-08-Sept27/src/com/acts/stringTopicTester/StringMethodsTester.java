package com.acts.stringTopicTester;

public class StringMethodsTester {

	public static void main(String[] args) {
		String str = "This is Demo String !";
		String str2 = "JavaString";
		System.out.println("Length of String : "+str.length());
		
		System.out.println("Charecter at 12 : "+str.charAt(13));
		
		System.out.println("Adding 2 String : "+str.concat(str2));
		
		System.out.println(str.split(" ")[0]);

		
	}

}
