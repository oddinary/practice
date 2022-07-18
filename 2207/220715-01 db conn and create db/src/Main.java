import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");

			// table a를 만들고 컬럼은 b varchar(20) pk
//			String query = "create table a (b varchar(10) primary key);";
			String query = "drop table a;";
			stmt = con.createStatement(); // 얘도 닫아줘야함 닫을 때는 커넥션보다 먼저 닫아주자
			stmt.executeUpdate(query); // 수정 작업할 때 사용(추가ㅡ 변경, 삭제 등)
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
