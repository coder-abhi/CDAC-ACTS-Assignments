package com.acts.objectSave;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;

public class SaveBookAsObj {
	public static Set<Book> bookList = new HashSet<>();
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Book currBook ;
		bookList.add(new Book(1001,"Sherlock","Canon Dayle",5));
		bookList.add(new Book(1002,"Holmes","Canon Dayle",5));
		bookList.add(new Book(1003,"Harry Potter","Canon Dayle",5));
		bookList.add(new Book(1004,"Alchamist","Canon Dayle",5));
		bookList.add(new Book(1005,"How To","Canon Dayle",5));
//		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("newBookList.txt"))){
//			while(true) {
//				System.out.println("inside while");
//				currBook = (Book) ois.readObject();		
//				System.out.println(currBook);
//				bookList.add(currBook);
//			}
//		} catch (Exception e) {
//			System.out.println("catching error"+e.getMessage());
//		}
//		System.out.println("Printing Objects");
//		bookList.forEach(x -> System.out.println(x));
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objFile.bat"))){
			bookList.forEach(t -> {
				try {
					oos.writeObject(t);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
//			oos.writeObject(oos);
		}
		
	}
}
