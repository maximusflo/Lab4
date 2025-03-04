package libraryManagementSystem;

public class Book {
	private String title;
	private String author;
	private boolean isAvailable;

	public Book(String title, String author, boolean isAvailable) {
		this.title = title;
		this.author = author;
		this.isAvailable = isAvailable;
	}

	public void borrowBook() {
		if (isAvailable == true) {
			this.isAvailable = false;
		}
	}

	public void returnBook() {
		if (isAvailable == false) {
			this.isAvailable = true;
		}
	}

	public String toString() {
		String bookInfo;
		bookInfo = title + " by " + author;
		return bookInfo;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public boolean getIsAvailable() {
		return isAvailable;
	}
}
