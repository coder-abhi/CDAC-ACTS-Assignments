package com.acts.fileHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.FileWriter;
public class FileWriterA {

	public static void main(String[] args) {
		String fileName = "newFile.txt";
		String currLine = "";
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(new FileWriter(fileName),true)){
			
			while(!(currLine = br.readLine()).equals("stop")) {
				pw.println(currLine);
				
			}
			System.out.println("File Written");
			
		}catch (Exception e) {
		}

}
}