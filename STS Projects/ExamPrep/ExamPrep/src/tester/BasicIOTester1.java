package tester;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

//read form text file
public class BasicIOTester1 {
	public static void main(String[] args) {
		System.out.println("Enter file name");
		try(Scanner sc= new Scanner(System.in);
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))) {
			String line;
//			while((line = br.readLine()) != null) {
//				System.out.println(line);
//			}	
			br.lines().forEach(System.out::println);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
