class Book {
	String title;
	String author;
	void printAll() {
		System.out.println("제목 : " + title + "/ 저자 : " + author);
	}
}

public class BookInfo {
	public static void main(String[] args) {
		Book rune = new Book();
		rune.title = "룬의 아이들";
		rune.author = "전민희";
		rune.printAll();
		
		Book node = new Book();
		node.title = "생활코딩! Node.js 노드제이에스 프로그래밍";
		node.author = "위키북스 러닝스쿨 시리즈";
		node.printAll();
	}
}