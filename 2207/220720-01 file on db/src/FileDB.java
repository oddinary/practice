import java.io.File;
import java.io.FileInputStream;
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

public class FileDB {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try { // 파일을 DB에서 불러와서 저장하기
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("select * from files where id = ?");
			
			pstmt.setInt(1, 1);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				Blob file = rs.getBlob("file"); // sql에서 이진 데이터 저장하는 타입
				
				InputStream inputStream = file.getBinaryStream();
				FileOutputStream fos = new FileOutputStream(new File("다운받은 파일.jpg"));
				
				int b = 0;
				while (( b = inputStream.read() )!= -1) {
					fos.write(b);
				}				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeStmt(pstmt);
			DBUtil.closeConn(conn);
		}
		
		
		
		
		
		
		
//		try { // 파일을 DB에 저장하기
//			conn = DBUtil.getConnection();
//			pstmt = conn.prepareStatement("insert into files (id, name, file) values (?,?,?)");
//			pstmt.setInt(1, 1);
//			pstmt.setString(2, "파일이름");
//			pstmt.setBlob(3, new FileInputStream(new File("..\\..\\8월 아이폰.jpg")));
//			
//			pstmt.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} finally {
//			DBUtil.closeStmt(pstmt);
//			DBUtil.closeConn(conn);
//		}
	}
}
