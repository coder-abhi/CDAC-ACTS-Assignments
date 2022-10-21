package com.acts.fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.stream.Stream;

public class ReadFile2 {

	public static void main(String[] args) {
		String currLine = "";
		String fileName = "newFile.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(fileName));
			PrintWriter pw = new PrintWriter(System.out)){
			
			while((currLine = br.readLine()) != null) {
				pw.println(currLine);
			}
			
		}catch (Exception e) {
		}
	}

}
