package libraryManagementSystem;

public class Member {
	
	public void borrowBook(Library library, String title) {
		boolean borrowed = false;
		for (Book book : library.books) {
			if (title.equals(book.getTitle())) {
				if (book.getIsAvailable()) {
					book.borrowBook();
					System.out.println("\n" + title + " has been borrowed successfully.");
					borrowed = true;
				} else {
					System.out.println("\n" + title + " is already checked out.");
					borrowed = true;
				}
				return;
			}
		}
		if(!borrowed) {
			System.out.println("\nBook not in library.");
		}
	}
	
	public void returnBook(Library library, String title) {
		boolean returned = false;
		for (Book book : library.books) {
			if (title.equals(book.getTitle())) {
				if(!book.getIsAvailable()) {
					book.returnBook();
					System.out.println("\n" + title + " has been returned successfully.");
					returned = true;
				} else {
					System.out.println("\n" + title + " is not checked out.");
					returned = true;
				}
				return;
			}
		}
		if (!returned) {
			System.out.println("\nBook not in library");
		}
	}
}
