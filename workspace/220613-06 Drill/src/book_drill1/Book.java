package book_drill1;

public class Book {
	private String name;
	private int pages;
	private String author;
	public Book(String name, int pages, String author) {
		this.name = name;
		this.pages = pages;
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String toString() {
		return "이름: " + name + ", 페이지 수: " + pages + ", 저자: " + author;  
	}
}
