package com.acts.stringBuilder;

public class StringBuilderTester {

	public static void main(String[] args) {
		String str = "Student are not doing practice";
		StringBuilder stringBuilder = new StringBuilder(str);
		stringBuilder.append(".");
		System.out.println(stringBuilder);

		stringBuilder.insert(0, "Why? ");
		System.out.println(stringBuilder);

		int index = stringBuilder.indexOf("not");
		System.out.println(index);

		stringBuilder.replace(index, index+3, "");
		System.out.println(stringBuilder);

		//stringBuilder.reverse();
		System.out.println(stringBuilder.reverse());
		String strOut = stringBuilder.toString();
		System.out.println(strOut);
	}
}

