package libraryManagementSystem;

import java.util.ArrayList;

public class Library {
	ArrayList<Book> books = new ArrayList<>();
	
	public void addBook(Book book) {
		books.add(book);
		System.out.println("\n" + book + " added to library");
		
	}
	
	public void removeBook(String title) {
		boolean removed = false;
		for (Book book : books) {
			if (title.equals(book.getTitle())) {
				books.remove(book);
				System.out.println("\n" + title + " removed from library");
				removed = true;
				break;
			} 
		}
		if (!removed) {
			System.out.println("\nBook not found.");
		}
	}
	
	public void displayBooks() {
		System.out.println("\nDisplaying available books...");
		for (Book book : books) {
			System.out.println(" " + book + " - " + (book.getIsAvailable() ? "Available" : "Checked Out"));
		}
	}
	
	public void searchBook(String title) {
		boolean found = false;
		for (Book book : books) {
			if (title.equals(book.getTitle())) {
				System.out.println("\n" + book.getTitle() + " by " + book.getAuthor() + " - " + (book.getIsAvailable() ? "Available" : "Checked Out"));
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("\nBook not found.");
		}
	}

}
