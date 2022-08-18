<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>값확인</title>
</head>
<body>
<!-- 리퀘스트는 요청을 보낼 때 마다 달라진다. -->
 <p>요청객체 값 확인 : <%= request.getAttribute("reqTest") %></p>
 <!-- 세션은 아이디값을 기준으로 달라진다. -->
 <p>세션객체 값 확인 : <%= session.getAttribute("sessionTest") %></p>
</body>
</html>