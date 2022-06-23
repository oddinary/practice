import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Book implements Comparable<Book>{
	String title;
	int price;
	public Book( String title,int price) {
		super();
		this.price = price;
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(title,price); // 동일한 필드 값이면 같은 hash를 만들어 준다.
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Book [price=" + price + ", title=" + title + "]";
	}
	
	@Override
	public int compareTo(Book o) {
		return title.compareTo(o.title);
	}
}


public class Main8 {
	public static void main(String[] args) {
		Book b1 = new Book("책1",5000);
		Book b2 = new Book("책1",5000);
		Book b3 = new Book("책3",7000);
		Book b4 = new Book("책2",4000);
//		System.out.println(b1.equals(b2));
//		System.out.println(b1.equals(b3));
//		
//		Set<Book> set = new HashSet<>();	// 각 객체 마다 가지고 있는 숫자 값을 hash라고 하고 이것이 다르면 다른 객체로 인식한다.
//											// 그럼 동등한 객체 끼리는 같은 숫자로 만들어주면 되겠다.
//		set.add(b1);						// hash가 같으면 진짜 같은지 보기 위해 equals를 쓴다. 그래서 이클립스에서 둘을 동시에 만들어주는구나
//		set.add(b2);
//		set.add(b3);
//		
//		System.out.println(set.size());
//		System.out.println(set); // 같은 책(equals도 재정의함)인데 set에는 다른 책으로 인식해서 들어간다.

		Set<Book> tree = new TreeSet<>();
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		tree.add(b4);
		
		System.out.println(tree); // 대소비교의 기준이 없으니까 예외가 발생한다.
		
		Comparator<Book> comparator = new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				return o1.getPrice() - o2.getPrice();
			}
			
		};
		
		Set<Book> treeByPrice = new TreeSet<>(comparator); // Comparator가 있으니까 알려주면 된다.
		treeByPrice.add(b1);
		treeByPrice.add(b2);
		treeByPrice.add(b3);
		treeByPrice.add(b4);
		System.out.println(treeByPrice);
	}
}
