<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Cookie[] cookies = request.getCookies();
	for (Cookie c : cookies){
		if (c.getName().equals("rememberme")) {
			request.setAttribute("idvalue", URLDecoder.decode(c.getValue(),"utf-8"));
		}
	}
%>
	<form action="./login" method="post">
		<input type="text" name="id" value="${ cookie.rememberme.value }">
		<br>
		<input type="password" name="password">
		<br>
		<input type="checkbox" name="rememberme">
		<br>
		<input type="submit" value="로그인">
		<br>
	</form>
	
	<form action="./logout.do" method="post">
		<input type="submit" value="로그아웃">
	</form>
	
	<p>
		<a href="./testlogin.do">로그인해야 들어갈 수 있는 페이지</a>
	</p>
</body>
</html>