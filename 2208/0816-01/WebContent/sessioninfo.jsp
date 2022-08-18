<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 정보 보기</title>
</head>
<body>
 <p>세션 아이디 : <%= session.getId() %></p>
 <!-- 
 	시간단위로 정보가 유지 되는데 이 시간은 서버마다 다름(톰캣은 기본 30분)
 	브라우저 단위마다 값이 바뀜 
  -->
 <p>세션 생성 시간 : <%= new Date(session.getCreationTime()) %></p>
 <p>마지막으로 세션에 접근한 시간 : <%= new Date(session.getLastAccessedTime()) %></p>
</body>
</html>