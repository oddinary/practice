import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class BookConsoleApp {
	private BookManage BM; // 무조건 있어야 한다(객체 의존성)

	public BookConsoleApp(BookManage BM) {
		this.BM = BM;
	}

	public void menu() {
		System.out.println("1.추가, 2. 목록, 3. 삭제, 4. 수정 , 5. 검색(제목)");
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		switch (num) {
		case 1:
			add();
			break;
		case 2:
			list();
			break;
		case 3:
			delete();
			break;
		case 4:
			update();
			break;
		case 5:
			search();
			break;
		default:
			break;
		}
	}

	private void list() {

		try {
			List<Book> list = BM.list();

			if (list.size() > 0) {
				for (Book b : list) {
					System.out.println(b);
				}
			} else {
				System.out.println("책 데이터가 없습니다.");
			}
		} catch (SQLException e) {
			System.out.println("데이터를 읽어오는 과정이 실패했습니다. 다시 시도해주세요.");
		}

	}

	public int delete() {
		list();
		System.out.println("삭제할 번호?");
		Scanner scan = new Scanner(System.in);
		int bookId = scan.nextInt();
		try {
			int result = BM.delete(bookId);
			if (result > 0) {
				System.out.println(result + "권의 책이 삭제 되었습니다.");
			} else {
				System.out.println("없는 번호입니다.");
			}
		} catch (SQLException e) {
			System.out.println("데이터를 읽어오는 과정이 실패했습니다. 다시 시도해주세요.");
		}
		return bookId;
	}

	public void add() {
		System.out.println("제목, 가격을 입력하라");
		Scanner scan = new Scanner(System.in);
		String title = scan.nextLine();
		if (title.length() > 40 ) {
			// 입력값 길이 처리
			System.out.println("40자를 넘어서면 안되용");
			return;
		}
		int price = scan.nextInt();

		try {
			int result = BM.add(new Book(title, price));

			System.out.println(result + "권의 책이 추가되었습니다.");
		} catch (SQLException e) {
			int code = e.getErrorCode();
			if (code == 1062) {
				System.out.println("중복된 제목, 제목을 확인하세요");
			} else if (code == 1406) {
				System.out.println("너무길어요");
			}
			System.out.println("데이터를 읽어오는 과정이 실패했습니다. 다시 시도해주세요.");
		}
	}

	private void update() {
		list();
		System.out.println("수정할 번호, 제못, 가격 순 입력");
		Scanner scan = new Scanner(System.in);
		
		int bookId = scan.nextInt();
		String title = scan.nextLine();
		int price = scan.nextInt();
		
		try {
			int result  = BM.update(new Book (bookId,title,price));
			System.out.println(result+"행 수정");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void search() {
		System.out.println("검색할 책 제목");
		Scanner scan = new Scanner(System.in);
		String title = scan.nextLine();
		
		List<Book> book;
		
		try {
			book = BM.selectByTitle(title);
			System.out.println(book);
		} catch (SQLException e) {
			System.out.println("데이터를 읽어오는 과정이 실패했습니다. 다시 시도해주세요.");
		}
	}
	public static void main(String[] args) {
		BookConsoleApp app = new BookConsoleApp(new BookManage());
		app.menu();
	}
}
