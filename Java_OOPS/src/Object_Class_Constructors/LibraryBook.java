package Object_Class_Constructors;

public class LibraryBook {
	int bookId;
	String title;
	String author;
	boolean available;
	  LibraryBook(int bookId, String title, String author, boolean available) {
	        this.bookId = bookId;
	        this.title = title;
	        this.author = author;
	        this.available = available;
	    }
	  boolean isAvailable() {
	        return available;
	    }

}
