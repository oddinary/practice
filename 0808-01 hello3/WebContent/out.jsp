<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
		out.println("<!DOCTYPE html>");
   %>
<html>
<head>
<meta charset="UTF-8">
<title>out 기본 객체</title>
</head>
<body>
	<h1>정적 텍스트</h1>
	<h1>1+2+3</h1>
	<%= 1+2+3 %> <br>
	
	<%
		out.println(1+2+3);
		out.println("<br />");
	%>
	<p>jsp의 모든 텍스트는 out객체가 출력합니다.</p>
	
	<% 
		boolean someBool = true;
	
		if (someBool) {
			out.println("<p>참일 때 출력하는 텍스트</p>");
		}else{
			out.println("<p>거짓일 때 출력하는 텍스트</p>");
	}
	%>
</body>
</html>