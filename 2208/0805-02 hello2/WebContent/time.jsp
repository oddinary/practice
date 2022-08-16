<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 페이지 디렉티브 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 자바코드를 적을수 있는 영역 -->
	<%
		// scriptlet
		System.out.println("사용자가 jsp페이지를 요청했습니다.");
		int a = 10;
	%>
	<p>jsp 페이지 입니다.</p>
	<strong><%= java.time.LocalTime.now() %></strong>
	<p>a의 값은 <%= a %>입니다.</p>
	<%-- jsp 주석입니다. --%>
</body>
</html>