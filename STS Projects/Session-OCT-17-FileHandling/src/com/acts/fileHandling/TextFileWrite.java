package com.acts.fileHandling;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TextFileWrite {

	public static void main(String[] args) {
		String data = "";
		String fileName = "abc.txt";

		// Java Appln <- BufferedReader <- InputStreamReader <- System.in 
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  // Keyboard
				PrintWriter pw = new PrintWriter(new FileWriter(fileName), true)) {// File
			//Java Appln -> PW : Buffered -> FW : Low level/Node stream -> File
			System.out.println("Please enter text:");
			while(!(data = br.readLine()).equals("Exit")) {
				pw.println(data);
			}
			System.out.println("*******Data writtern to file*****");

		} catch (IOException e) {
			//e.printStackTrace();
			System.err.println(e);
		}
		System.out.println("*****Graceful execution of main*****");
	}

}
