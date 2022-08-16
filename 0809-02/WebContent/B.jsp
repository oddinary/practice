<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>B페이지입니다</h1>
	<p>오늘 날짜는</p>
	<% Object result = request.getAttribute("result"); %>
	<%= result %>
	<br>
	<a href="./from.jsp">전으로 돌아가기</a>
</body>
</html>