<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>중간에서 경로처리해줄거임</title>
</head>
<body>
	<!-- 사실 중간페이지에서 태그들은 필요없고 논리 흐름만 있으면 됨 -->
	<%
		String id = request.getParameter("route");
	
		if(id == null || id.length() == 0) {
			response.sendRedirect("./want.jsp?progress=failed");
		} else if(id.equals("person")){
			response.sendRedirect("./persons.jsp");
		} else if (id.equals("fruit")){
			response.sendRedirect("./fruit.jsp");
		}
	 %>
</body>
</html>