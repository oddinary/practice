import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.co.greenart.dbutil.DBUtil;

public class RestaurantManage {
//	U (id, 새 상호명, 새 전화번호, 새 주소) 행갯수 
//	D (id) 행 갯수
	
	// 매핑
	private Restaurant resultMapping(ResultSet rs) throws SQLException {
		int id = rs.getInt("Id");
		String name = rs.getString("Name");
		String phoneNum = rs.getString("phoneNum");
		String address = rs.getString("address");
		return new Restaurant(id, name, phoneNum, address);
	}

// R() : List<음식점>
	public List<Restaurant> list() throws SQLException {
		String query = "select * from restaurant";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Restaurant> list = new ArrayList<>();

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
//	C(상호명, 전화번호, 주소) throws SQLException
	public int add(Restaurant restaurant) throws SQLException {
		String query = "insert into restaurant (name, phoneNum, address) values ('"+restaurant.getName()+"','"+restaurant.getPhone()+"','"+restaurant.getAddress()+"')";
		System.out.println("추가 : " + query);
		
		Connection conn= null;
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
//	R(id) : 음식점
	public List<Restaurant> select(String name) throws SQLException {
		String query = "select * from restaurant where name like '%" + name + "%'";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Restaurant> list = new ArrayList<>();

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
	
	public int update(Restaurant restaurant) throws SQLException {
		String query = "update restaurant set name = '" + restaurant.getName() + "', phoneNum = '" + restaurant.getPhone()
		+ "', address = '" + restaurant.getAddress() + "' where Id =" + restaurant.getId();
		
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
	
	public int delete(int id) throws SQLException {
		String query = "delete from restaurant where id = " + id;
		
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
