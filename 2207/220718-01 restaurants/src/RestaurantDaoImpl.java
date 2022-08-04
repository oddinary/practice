import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.greenart.dbutil.DBUtil;

public class RestaurantDaoImpl implements RestaurantDao {

	private Restaurant resultMapping(ResultSet rs) throws SQLException {
		int id = rs.getInt("id");
		String name = rs.getString("name");
		String phoneNum = rs.getString("phoneNum");
		String address = rs.getString("address");

		return new Restaurant(id, name, phoneNum, address);
	}

	public int[] create(List<Restaurant> list) throws SQLException{
		String query = "INSERT INTO restaurant (name, phoneNum,address) VALUES (?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			
			for(Restaurant r : list) {
				pstmt.setString(1, r.getName());
				pstmt.setString(2, r.getPhone());
				pstmt.setString(3, r.getAddress());
				pstmt.addBatch(); // 같은 작업을 한번에 몰아서 하는 작업을 Batch작업이라고 한다.
			}
			return pstmt.executeBatch();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}
	
	@Override
	public int create(String name, String phoneNumber, String address) throws SQLException {
		String query = "INSERT INTO restaurants (name, phoneNum,address), VALUES (?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstmt = null; // ??를 포함하는 sql문이 있다면 여기에 값을 넣어주는 동작을 수행 할 수 있다.
										// sqlinjection 공격으로 부터 안전하다.
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name); // 물음표 순서, 값
			pstmt.setString(2, phoneNumber);
			pstmt.setString(3, address);

			pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}

		return 0;
	}

	@Override
	public List<Restaurant> read() throws SQLException {
		String query = "SELECT * FROM restaurant";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Restaurant> list = new ArrayList<>();
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(resultMapping(rs));
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
		return list;
	}

	@Override
	public Restaurant read(int id) throws SQLException {
		String query = "SELECT * FROM restaurant WHERE id = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return resultMapping(rs);
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}

		return null;
	}

	@Override
	public int update(int id, String name, String phoneNumber, String address) throws SQLException {
		String query = "update restaurant set name = ?, phoneNum = ? address = ?, where id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, phoneNumber);
			pstmt.setString(3, address);
			pstmt.setInt(4, id);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
	}

	@Override
	public int delete(int id) throws SQLException {
		
		String query = "DELETE * FROM restaurant WHERE id = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			
			return pstmt.executeUpdate();
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
		
	}

}
