package kr.co.greenart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CountryDao {
	public List<String> getContinents() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<String> list = new ArrayList<>();
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("Select Distinct continent from country");

			while (rs.next()) {
				String continent = rs.getString("continent");
				list.add(continent);
			}

		} finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		return list;
	}

	public List<Country> getCountryByContinent(String continent) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Country> list = new ArrayList<>();
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
			pstmt = conn.prepareStatement(
					"Select name, Population from country where continent = ? order by Population desc");
			pstmt.setString(1, continent);
			rs = pstmt.executeQuery();

			int count = 0;
			while (rs.next()) {
				Country c = new Country();
				c.setName(rs.getString("name"));
				c.setPopulation(rs.getInt("Population"));
				list.add(c);
				count++;
			}

		} finally {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		return list;
	}
}
