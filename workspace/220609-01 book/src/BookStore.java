
public class BookStore {
	private Book[] books;
	
	public BookStore() {}
	
	public BookStore(Book... books) {
		this.books = books;
	}
	public void printNames() {
		for (int i = 0; i < books.length; i++) {
			System.out.println((i + 1) + " : " + books[i].getName());
		}
	}
	
	
}
