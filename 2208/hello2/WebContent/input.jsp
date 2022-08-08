<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력하세용</title>
</head>
<body>
	<form action="/window/requestInfo.jsp" method="post">
		<label for="name">이름</label><input type="text" name="name"><br>
		<label for="age">나이</label><input type="text" name="age"><br>
		<label><input type="radio" name="radiochoice" value="male" />남</label>
      <label><input type="radio" name="radiochoice" value="female" />여</label>
      <label><input type="radio" name="radiochoice" value="undefined"/>해당없음</label>
      <label><input type="radio" name="radiochoice" value="none" checked />비공개</label> <br>
      <label><input type="checkbox" name="hobby" value="java">자바</label>
      <label><input type="checkbox" name="hobby" value="html">하이퍼텍스트마크업랭귀지</label>
      <label><input type="checkbox" name="hobby" value="css">캐스캐이딩스타일시트</label>
      <label><input type="checkbox" name="hobby" value="javascript">자바스트립트</label>
		<input type="submit">
	</form>
</body>
</html>