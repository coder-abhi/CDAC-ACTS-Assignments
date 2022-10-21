package com.acts.fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class TextFileRead {
	public static void main(String[] args) throws FileNotFoundException, IOException {
//		File file = new File("abc.txt");
//		try {
//			file.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(file.canRead());
		
		String data = "";
		String fileName = "abc.txt";
//		FileReader flReader = new FileReader(fileName);
//		flReader;
		try (BufferedReader br = new BufferedReader(new FileReader(fileName));  // File
				PrintWriter pw = new PrintWriter(System.out)){
			while((data = br.readLine()) != null) {
				pw.println(data);
				System.out.println("*******Data writtern to Console*****");
			}
			
		}catch (IOException  e) {
			System.err.println(e);
		}
		System.out.println("*****Graceful execution of main*****");
	}
}
