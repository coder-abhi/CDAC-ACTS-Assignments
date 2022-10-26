package tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import bookshop.CollectionUtils;
import bookshop.IOUtils;
import exception.BookHandlingException;
import bookshop.Book;

public class tester2 {
	public static void main(String[] args) {
		Map<String,Book> bookMap = new HashMap<>();
		Map<String,Book> cartMap = new HashMap<>();
		CollectionUtils.populateData(bookMap);

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("----------Menu-----------");
			System.out.println("\n 1. Display all books from the shop"
					+ "\n 2. Add Book to The Cart"
					+ "\n 3. Show User Cart Contents"
					+ "\n 4. Check out"
					+ "\n 5. Add new Book");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();

			switch(choice) {

			case 1:{
				bookMap.values().stream().forEach(System.out::println);
				break;
			}

			case 2:{
				System.out.println("Enter book name to add to cart");
				String name = sc.next();
				try {
					if(bookMap.get(name).getTitle().equals(name)) {
						cartMap.put(name, bookMap.get(name));	
						System.out.println("Book Successfully added to cart");
					}
					else {
						throw new BookHandlingException("Book Not Found!!!!");
					}
				}
				catch(BookHandlingException bhe) {
					bhe.printStackTrace();
				}
				break;
			}
			case 3:{
				System.out.println("Cart Content");
				cartMap.values().forEach(System.out::println);
				break;
			}
			case 4:{
				System.out.println("Total Cart Value:" + cartMap.values().stream().mapToDouble(c -> c.getPrice()).sum());
				System.out.println("Books in cart");
				cartMap.values().stream().forEach(s -> System.out.println(s.getTitle()));
				System.out.println("Enter file destination");
				String dest = sc.next();
				IOUtils.writeDetails2(cartMap, dest);
				System.out.println("Book successfully saved to file");
				break;
			}
			}
		}while(choice!=0);
	}
}
