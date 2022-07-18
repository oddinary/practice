import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.co.greenart.dbutil.DBUtil;

public class BookManage {
	private Book resultMapping(ResultSet rs) throws SQLException {
		int id = rs.getInt("bookId");
		String title = rs.getString("title");
		int price = rs.getInt("price");
		return new Book(id, title, price);
	}

	// 추가
	public int add(Book book) throws SQLException {
		String query = "insert into books (title, price) values('" + book.getTitle() + "'," + book.getPrice() + ");";
		System.out.println("추가 : " + query);

		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();

			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}

	// 목록전체
	public List<Book> list() throws SQLException {
		String query = "select * from books";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Book> list = new ArrayList<>();

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				list.add(resultMapping(rs));
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
		return list;
	}

	// 책 검색
	public List<Book> selectByTitle(String title) throws SQLException {
		String query = "select * from books where title like '%" + title + "%'";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Book> list = new ArrayList<>();

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

				while (rs.next()) {
					list.add(resultMapping(rs));
				}
				return list;
			
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
		
	}

	// 삭제
	public int delete(int id) throws SQLException {
		String query = "delete from books where bookid = " + id;

		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();

			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}

	// 수정
	public int update(Book book) throws SQLException {
		String query = "update books set title = '" + book.getTitle() + "', price = " + book.getPrice()
				+ " where bookId =" + book.getId();

		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();

			return stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}
}
