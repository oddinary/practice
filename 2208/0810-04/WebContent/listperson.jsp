<%@page import="person.person" %>
<%@page import="person.personDAO" %>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사람확인페이지</title>
</head>
<body>
	<!-- 
		사람목록페이지
			->mapping된 servlet
			->service 메소드 {
				db 목록 읽기
				사용자가 볼 수 있는 페이지로의 흐름을 만들어보자.(forward) 
			}
	-->
	<c:if test="${not empty list}">
		<ul> <!-- el에 이름을 적으면 어트리뷰트를 찾아본다. -->
			<c:forEach var="person" items="${list}">
				<li>${ person }</li>
			</c:forEach>
		</ul>
	</c:if>
</body>
</html>