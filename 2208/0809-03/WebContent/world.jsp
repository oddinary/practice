<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>국가목록</title>
</head>
<body>
	<!-- 
		jdbc와 연동 할 때는?
		1. 제일먼저 jdbc드라이버를 추가해줘야 한다. WEB-INF > lib 에 드라이브파일을 집어 넣자.
		2. 드라이버를 로드합니다. 
	-->
	<%
		Class.forName("com.mysql.cj.jdbc.Driver");
	%>
	<!-- 3. 커넥션을 만들어 줍니다. -->

	<%
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

	try {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
		stmt = conn.createStatement();
		rs = stmt.executeQuery("SELECT Name From world.country");
		
			out.println("<ul>");
				while (rs.next()){
					String result = rs.getString("Name");
					out.println("<li>");
					out.println(result);
					out.println("</li>");
				}
			out.println("</ul>");
		
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
	%>
	
</body>
</html>