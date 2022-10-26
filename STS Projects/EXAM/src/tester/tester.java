package tester;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;
import java.util.Scanner;
import bookshop.*;
import exception.BookHandlingException;

public class tester {
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<Book> bookList = CollectionUtils.populateData();
		List<Book> cart = new ArrayList<>();
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
				bookList.forEach(System.out::println);
				break;
			}

			case 2:{
				System.out.println("Enter book name to add to cart ");
				String bookName = sc.next();
				boolean check = true;
				try {
					for(Book b: bookList) {
						if(b.getTitle().equals(bookName)) {
							cart.add(b);
							System.out.println("Book Added succesfully");
							check = false;
							break;
						}
					}
					if(check) {
						BookHandlingException bhe = new BookHandlingException("Book not Found");
						throw bhe;
					}
				}
				catch(BookHandlingException bhe) {
					bhe.printStackTrace();				
				}
				break;
			}			
			case 3: {
				System.out.println("User cart Items:");
				cart.stream().forEach(System.out::println);
				break;
			}

			case 5:{
				System.out.println("Enter Book Name");
				String name = sc.next();

				System.out.println("Enter Book Author");
				String author = sc.next();

				System.out.println("Enter Book Price");
				double price = sc.nextDouble();

				System.out.println("Enter Book Category");
				CategoryType category = CategoryType.valueOf(sc.next());
				System.out.println("Enter Publish Date in dd/mm/yyyy");
				String dt = sc.next();
				LocalDate date = LocalDate.parse(dt, formatter);
				bookList.add(new Book(name, author, price,category, date));
				System.out.println("Book Added Successfully");
				break;
			}
			case 4:{
				System.out.print("Total Cart Value: ");
				System.out.println(cart.stream().mapToDouble(c -> c.getPrice()).sum());
				
				
				double sum =0;
				for(Book b: cart) {
					sum = sum + b.getPrice();
				}
					
				System.out.println("Books purchased by user:");
				cart.forEach(s -> System.out.println(s.getTitle()));
				
				System.out.println("Enter file destination");
				String dest = sc.next();
				IOUtils.writeDetails(cart, dest);
				System.out.println("Book successfully saved to file");			
				
			}
			}
		}while(choice!=0);
	}
}
