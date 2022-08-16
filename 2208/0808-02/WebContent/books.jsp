<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%
	List<String> list = new ArrayList<>();
	for (int i = 0; i < 100; i++) {
		list.add("book" + i);
	}
%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 페이지</title>
</head>
<body>
	<% 	
		int num = 0;
		int pageper = 0;
		if (!request.getParameter("page").equals("")){
			num = Integer.parseInt(request.getParameter("page"));
		} 
		if (!request.getParameter("pageper").equals("")){
			pageper = Integer.parseInt(request.getParameter("pageper"));
		} 
	%>
	<%
	
		int start = (num - 1) * pageper; 	
	
		for(int i = start; i < start + pageper; i++) {
			out.println(list.get(num + i));
			out.println("<br/>");
		}
	%>
	<br/>
	<a href="./form.jsp">전 페이지로 돌아가기</a>
</body>
</html>