package com.acts.file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileHandle {
	
	public static void main(String[] args) {

		
		
	}
//	public static void readObject(String fileName) {
//		
//		try(ObjectInputStream oos = new ObjectInputStream(new FileInputStream("abc.bat"))){
//			oos.readObject();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	public static void writeObj() throws FileNotFoundException, IOException{
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.bat"))){
			oos.writeObject(oos);
		}
	}

}
