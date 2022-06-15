package book_drill1;

public class Magazine extends Book{
	private String releaseDate;

	public Magazine(String name, int pages, String author, String releaseDate) {
		super(name, pages, author);
		this.releaseDate = releaseDate;
		
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public String toString() {
		return super.toString() + ", 발매일: " + releaseDate;
	}
}
