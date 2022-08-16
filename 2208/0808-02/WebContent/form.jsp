<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>원하는 범위의 책을 보여드릴테니까 범위를 입력하세요(처음엔 10개씩 해보고 다음엔 갯수를 적을수 있도록 해보세요)</p>
	<form action="./books.jsp">
		<input type="number" name = "page"/>
		<input type="number" name = "pageper"/>
		<input type="submit" />
	</form>
</body>
</html>