package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class personDAO {
	// 사람 등록하는 메소드
	public int create(String firstName, String lastName, int age, String email) throws SQLException {
		String query = "INSERT INTO persons (firstName, lastName, age, email) VALUES (?, ?, ?, ?)";
		personValidator v = new personValidator();
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			pstmt.setInt(3, age);
			pstmt.setString(4, email);
			pstmt.executeUpdate();
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}

		return 0;
	}

	// 사람확인하는 메소드
	public List<person> read() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<person> list = new ArrayList<>();

		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select firstName, lastName, age, email from persons");

		while (rs.next()) {
			String firstName = rs.getString("firstName");
			String lastName = rs.getString("lastName");
			int age = rs.getInt("age");
			String email = rs.getString("email");
			person p = new person(firstName, lastName, age, email);

			list.add(p);
		}
		if (rs != null) {
			rs.close();
		}
		if (stmt != null) {
			stmt.close();
		}
		if (conn != null) {
			conn.close();
		}
		return list;
	}
}
