package kr.co.greenart;

public class BoardArticle {
	private int id;
	// 제목
	private String title;
	// 내용
	private String contents;
	
	@Override
	public String toString() {
		return "BoardArticle [id=" + id + ", title=" + title + ", contents=" + contents + "]";
	}
	
	public BoardArticle() {}
	
	public BoardArticle(int id, String title, String contents) {
		super();
		this.id = id;
		this.title = title;
		this.contents = contents;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	
}
