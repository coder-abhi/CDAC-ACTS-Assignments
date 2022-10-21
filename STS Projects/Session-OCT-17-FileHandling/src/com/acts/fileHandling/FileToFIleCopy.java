package com.acts.fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

class FileToFIleCopy {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("newFile.txt"));
				PrintWriter pw = new PrintWriter(new FileWriter("abhi.txt",true))) {
			
			br.lines().forEach(pw::print);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
