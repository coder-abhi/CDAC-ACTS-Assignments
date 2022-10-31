package bookshop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public interface IOUtils {

	@SuppressWarnings("unchecked")
	static List<Book> readDetails(String fileName) {
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
			return (List<Book>) in.readObject();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;	
	}
	static void writeDetails (List<Book> book, String fileName) {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))){
			out.writeObject(book);		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
						e.printStackTrace();
		}

	}

}
