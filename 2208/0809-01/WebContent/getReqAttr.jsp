<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- request객체는 한번의 요청에 대해서 유지되는 객체 (요청이 새로 처리되면 사라짐)-->
	<%= request.getAttribute("reqAttr") %>
	<%= request.getAttribute("reqInt") %>
	<!-- 영역(scope)에 유의하여 사용합시다.  --> 
</body>
</html>