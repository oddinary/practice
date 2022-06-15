package book_drill1;

public class Main {

	public static void main(String[] args) {
		Book b1 = new Book("룬의 아이들", 578, "전민희");
		System.out.println(b1.toString());
		
		Magazine m1 = new Magazine("매거진b", 160, "B", "2022.06");
		System.out.println(m1.toString());

		Book book = (Book) new Magazine("cluel Homme", 160, "c", "2002.06");
		// 상향 형 변환 자동으로 이루어지기 때문에 이렇게 설정 해주지 않아도 된다.
		System.out.println(book.getName());
		System.out.println(book.getPages());
		System.out.println(book.getAuthor());
		// 1. 잡지를 책의 형태로 만들었기 때문에(상향 형 변환) 책의 행동은 가능하지만 잡지의 행동은 불가능 하다.
//		System.out.println(book.getReleaseDate());
		Magazine m2 = (Magazine) book;
		// 하향 형 변환(명시적으로 해줘야함)
		System.out.println(m2.getReleaseDate());
		
		
		Book b = new Book ("그냥 팩",50,"그냥 작가");
		
		if(b instanceof Magazine) {
			Magazine m = (Magazine) b;
		}// 하향 형 변환을 할 때는 내가 바꾸고자 하는 인스턴스가 맞는지 확인하고, 맞으면
		// 바꿔야 한다.
		
	}

}
