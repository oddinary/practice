
public class Book {
	private String name;
	private String author;
	private String publisher;
	private String genre;
	private int price;
	
	public Book(String name, String author, String publisher, String genre, int price) {
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.genre = genre;
		this.price = price;
	}
	
	public Book(String name, String author, String publisher, String genre) {
		this(name, author, publisher, genre, 0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getInfo(){ // 객체의 상태를 문자열로 반환하는 메소드
		return name + " / " + author + " / " + publisher + " / " + genre + " / " + price + "원";
	}
	public void setInfo(String name, String author, String publisher, String genre, int price){
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.genre = genre;
		this.price = price;
	}
}