import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.co.greenart.dbutil.DBUtil;

public class Main {
	public static void main(String[] args) {
		
		try(Connection conn = DBUtil.getConnection();
				PreparedStatement pstmt = conn.prepareStatement("");) {// 오토 클로저블을 구현하고 있는 객체의 선언과 초기화 문장만 올 수 있다.
			
			pstmt.setString(1, "");
			ResultSet rs = pstmt.executeQuery();
			
		} catch(SQLException e) {
			e.printStackTrace();
		} 
		
//		Connection conn = null;
//		try { 
//			conn = DBUtil.getConnection();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			DBUtil.closeConn(conn);
//		}
	}
}
