package bookshop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class CollectionUtils {

	public static void populateData(Map<String, Book> bookMap){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        bookMap.put("Mobile",new Book("Mobile", "Vinay Kumar", 500.0, CategoryType.TECH, LocalDate.parse("22/09/2011",formatter)));
		bookMap.put("Wings Of Fire",new Book("Wings Of Fire", "Arun Tiwari", 150.0, CategoryType.AUTOBIOGRAPHY, LocalDate.parse("15/10/2009",formatter)));
		bookMap.put("Sun also rises",new Book("Sun also rises", "Earnest Hemingway", 400.0, CategoryType.FICTION, LocalDate.parse("06/04/2007",formatter)));
		bookMap.put("The Call of the Wild",new Book("The Call of the Wild","Jack London", 600.0, CategoryType.SCIFI, LocalDate.parse("17/05/2009",formatter)));
		bookMap.put("JAVA",new Book("JAVA", "Herbert Schildt", 800.0, CategoryType.TECH, LocalDate.parse("01/01/2006",formatter)));
		
		
		
	}
}
