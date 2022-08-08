<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>뭘 보고 싶니?</title>
</head>
<body>
<p>보고싶은 목록 고르기~</p> <br>
<%= request.getParameter("progress") %>
	<form action="./middle.jsp" method="post">
		<input type="radio" name="route" value="person"/> 사람
		<input type="radio" name="route" value="fruit"/> 과일
		<input type="submit"/>
	</form>

</body>
</html>