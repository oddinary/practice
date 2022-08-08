<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>today</title>
</head>
<body>
	<p>오늘은</p>
	<p><strong><%= LocalDate.now() %></strong></p>
	<p>입니다.</p>
</body>
</html>