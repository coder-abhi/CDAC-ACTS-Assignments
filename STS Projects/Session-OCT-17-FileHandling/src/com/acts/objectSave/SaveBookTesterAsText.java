package com.acts.objectSave;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;


public class SaveBookTesterAsText {
	public static HashSet bookList = new HashSet<>();

	
	
	public static void main(String[] args) throws IOException {
		bookList.add(new Book(1001,"Sherlock","Canon Dayle",5));
		bookList.add(new Book(1002,"Holmes","Canon Dayle",5));
		bookList.add(new Book(1003,"Harry Potter","Canon Dayle",5));
		bookList.add(new Book(1004,"Alchamist","Canon Dayle",5));
		bookList.add(new Book(1005,"How To","Canon Dayle",5));
		
		try (PrintWriter pw = new PrintWriter(new FileWriter("newBookList.txt"))){
			bookList.forEach(pw :: println);
		}
	}


}
