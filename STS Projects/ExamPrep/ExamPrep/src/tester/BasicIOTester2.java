package tester;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BasicIOTester2 {
	public static void main(String[] args) {
		System.out.println("enter src and dest path in seperate line");
		try(Scanner sc =new Scanner(System.in);
			BufferedReader br =new BufferedReader(new FileReader(sc.nextLine()));
				PrintWriter pw = new PrintWriter(new FileWriter(sc.nextLine()))){
			String line;
			while((line = br.readLine())!= null) {
				pw.println(line);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}

}
