package bookshop;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

public interface IOUtils {

	@SuppressWarnings("unchecked")
	static Map<String,Book> readDetails(String fileName) {
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
			return (Map<String,Book>) in.readObject();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;	
	}
	static void writeDetails (Map<String, Book> book, String fileName) {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))){
			out.writeObject(book);		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
						e.printStackTrace();
		}

	}	
//-----------------------------Using text File-------------------------	
	static void writeDetails2(Map<String, Book> book, String fileName) {
		try(PrintWriter pr =new PrintWriter(new FileWriter(fileName))) {
				book.values().forEach(pr::println);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
