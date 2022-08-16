<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="./calcresult.jsp">
		<input type="number" name="num1"/>
		<br>
		<input type="radio" name="calc" value="plus"/>+
		<input type="radio" name="calc" value="minus"/>-
		<input type="radio" name="calc" value="multiple"/>x
		<input type="radio" name="calc" value="division"/>/
		<br>
		<input type="number" name="num2"/>
		<input type="submit"/>
		<select id="select_value" name="operator">
			<option value="plus">+</option>
			<option value="minus">-</option>
			<option value="multiple">*</option>
			<option value="division">/</option>
		</select>
	</form>
</body>
</html>