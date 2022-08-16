<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=
		Arrays.toString(request.getParameterValues("num"))
	%>
	
	<%
		String arr[] = request.getParameterValues("num");
		if (arr.length == 0) {
				out.println("표시할 그림이 없어유");
		} else {
			for(int i = 0; i <arr.length ; i++) {
				out.println("<img src='./images/춘식/춘식"+ arr[i] +".png'/>");
			}
		}
	%>
</body>
</html>