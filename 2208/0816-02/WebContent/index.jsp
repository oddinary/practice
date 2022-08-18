<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<nav>
		<c:if test="${ empty loginid }">
			<a href="./loginform.jsp">로그인 하기</a>
		</c:if>
		<c:if test="${ not empty loginid }">
		<!-- 같은 과정을 중복시키지 않게 필터를 구현해보자(인코딩, 로그인 확인)  -->
		<a href="./board">게시글 보기</a>
		<a href="./memberInfo">회원정보 보기</a>
		<a href="./logout.jsp">로그아웃</a>
		</c:if>
	</nav>
</body>
</html>