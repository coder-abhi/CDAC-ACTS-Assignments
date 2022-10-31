package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.List;

import employee.Employee;

public class IOUtils {

	public static List<Employee> readDetails(String srcFileName){
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(srcFileName))){
			return (List<Employee>) in.readObject();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;	
	}

	public static void writeDetailsBinary(List<Employee> emp, String destFileName) {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(destFileName))){
			out.writeObject(emp);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeDetailsText(List<Employee> emp, String destFileName) {
		try(PrintWriter pr = new PrintWriter(new FileWriter(destFileName))){
		emp.forEach(pr::println);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
}
