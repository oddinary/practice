<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
		입력폼 
		사용자 이름
		사용자 나이
		두개의 값은 필수
	-->
	<form action="./welcome.jsp">
		<p>정보를 입력하세요</p>
			<label>이름
				<input type="text" name="name" required/>
			</label>
			<br>
			<label>나이
				<input type="number" name="age" required/>
			</label>
			<br>
		<input type="submit">
	</form>
</body>
</html>