import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import kr.co.greenart.dbutil.DBUtil;

/*
 * my_db.books
 * 
 * 도서관리 프로그램 
 * 전체목록 v
 * (아이디나 제목이나 가격등으로 검색가능) v
 * 추가 v
 * 삭제 v
 * 수정 v
 * 
 * */

public class Drill {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		Scanner scan = new Scanner(System.in);
		
		try {
			conn = DBUtil.getConnection();

			while (true) {
				System.out.println("1.전체 책 정보 보기, 2.책 검색(이름), 3.책 추가, 4.책 삭제(이름), 5.책 수정, 0. 종료");
				int input = scan.nextInt();
				switch (input) {
				case 1: {
					// 전체 책 정보 보기
					stmt = conn.createStatement();
					rs = stmt.executeQuery("SELECT * FROM books;");

					while (rs.next()) {
						int id = rs.getInt("bookId");
						String title = rs.getString("title");
						int price = rs.getInt("Price");

						Book b = new Book(id, title, price);

						System.out.println(b.getId() + ", " + b.getTitle() + ", " + b.getPrice());
					}
					continue;
				}
				case 2: {
					// 책 검색 (이름)
					System.out.println("검색할 책의 제목을 입력하세요.");
					scan.nextLine();
					String name = scan.nextLine();
					stmt = conn.createStatement();
					rs = stmt.executeQuery("SELECT * FROM books WHERE title like '%" + name + "%';");

					while (rs.next()) {
						int id = rs.getInt("bookId");
						String title = rs.getString("title");
						int price = rs.getInt("Price");

						Book b = new Book(id, title, price);

						System.out.println(b.getId() + ", " + b.getTitle() + ", " + b.getPrice());

					}
					continue;
				}
				case 3: {
					// 책 추가
					System.out.println("추가할 책의 제목을 입력하세요.");
					scan.nextLine();
					String name = scan.nextLine();
					System.out.println("추가할 책의 가격을 입력하세요.");
					int money = scan.nextInt();

					Book b = new Book(name, money);

					stmt = conn.createStatement();

					result = stmt
							.executeUpdate("insert into books (title, price) values ('" + name + "'," + money + ");");

					System.out.println(b.getTitle() + ", " + b.getPrice());
					System.out.println(result + "권이 추가 되었습니다.");
					continue;
				}
				case 4: {
					// 책 삭제

					System.out.println("삭제할 책의 제목을 입력하세요.");
					scan.nextLine();
					String name = scan.nextLine();
					System.out.println("삭제할 책의 가격을 입력하세요.");
					int money = scan.nextInt();


					stmt = conn.createStatement();

					result = stmt
							.executeUpdate("delete from books where title like'%" + name + "%' and price = " + money + ";");
					System.out.println("삭제 되었습니다.");
					continue;
				}
				case 5: {
					// 책 수정

					System.out.println("수정할 책의 id을 입력하세요.");
					int num = scan.nextInt();
					System.out.println("책의 이름을 입력하세요");
					scan.nextLine();
					String name = scan.nextLine();
					System.out.println("책의 가격을 입력하세요.");
					int money = scan.nextInt();


					stmt = conn.createStatement();

					result = stmt.executeUpdate("update books set title = '"+ name + "', price = " + money + " where bookId = "+ num +";");
					System.out.println("수정 되었습니다.");
					continue;
				}
				case 0: {
					// 종료
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				default: {
					System.out.println("잘못된 입력입니다.");
					continue;
				}
				}
				break;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
}
