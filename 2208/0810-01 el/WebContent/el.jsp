<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>JSP Expression Language</p>
	<!-- jsp의 표현식 -->
	${ "qwer" }
	${ 123 }
	${ 123.456 }
	${ true }
	<br>
	${ 1 + 2 }
	${ true && false }
	<!-- get을 생략하고 객체만 적으면 된다. -->
	${ pageContext.request.requestURI }
</body>
</html>