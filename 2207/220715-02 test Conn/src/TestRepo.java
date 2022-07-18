import java.sql.SQLException;
import java.util.List;

public class TestRepo {
	public static void main(String[] args) {
		BookManage BM = new BookManage();
		
		int result;
		try {
//			result = BM.add(new Book("테스트",15000));
//			System.out.println("추가확인" + (result == 1));
			
//			List<Book> list = BM.list();
//			System.out.println(list);
			
			List<Book> book = BM.selectByTitle("자바");
			System.out.println(book);
			
//			result = BM.update(new Book(13, "자바에서 변경한 새이름", 5000));
//			System.out.println(result == 1);
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
