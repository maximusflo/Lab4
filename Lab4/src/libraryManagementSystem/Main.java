package libraryManagementSystem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Library library = new Library();
		Member member = new Member();
		int choice;
			
		System.out.println("Welcome to the library");
			
		do {
			System.out.println("\n	1. Add book");
			System.out.println("	2. Remove book");
			System.out.println("	3. Search for book");
			System.out.println("	4. Display books");
			System.out.println("	5. Borrow book");
			System.out.println("	6. Return book");
			System.out.println("	7. Exit program");
			System.out.print("\nEnter choice: ");
			
			while (!scanner.hasNextInt()) {
				System.out.print("\nError, please enter valid choice: ");
				scanner.nextLine();
			}
			
			choice = scanner.nextInt();
			scanner.nextLine();
			
			
			switch (choice) {
				case 1:
					System.out.print("\nEnter book title: ");
					String title = scanner.nextLine();
					System.out.print("\nEnter book author: ");
					String author = scanner.nextLine();
					library.addBook(new Book(title, author, true));
					break;
				case 2:
					if (library.books.isEmpty()) {
						System.out.println("\nNo books in library to remove.");
						break;
					}
					System.out.print("\nEnter title of book to remove: ");
					String removeTitle = scanner.nextLine();
					library.removeBook(removeTitle);
					break;
				case 3:
					if (library.books.isEmpty()) {
						System.out.println("\nNo books in library to search.");
						break;
					}
					System.out.print("\nEnter book title: ");
					String searchTitle = scanner.nextLine();
					library.searchBook(searchTitle);
					break;
				case 4:
					if (library.books.isEmpty()) {
						System.out.println("\nNo books in library to display.");
						break;
					}
					library.displayBooks();
					break;
				case 5:
					if (library.books.isEmpty()) {
						System.out.println("\nNo books in library to borrow.");
						break;
					}
					System.out.print("\nEnter title of book to borrow: ");
					String borrowTitle = scanner.nextLine();
					member.borrowBook(library, borrowTitle);
					break;
				case 6:
					if (library.books.isEmpty()) {
						System.out.println("\nNo books in library to return.");
						break;
					}
					System.out.print("\nEnter name of book to return: ");
					String returnTitle = scanner.nextLine();
					member.returnBook(library,  returnTitle);
					break;
				case 7: 
					System.out.println("\nExiting the program...");
					break;
				default:
					System.out.println("\nError, please enter valid choice: ");
			}
		} while (choice != 7);
			
			scanner.close();
	}
}
