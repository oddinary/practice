<%@page import="kr.co.greenart.CountryDao"%>
<%@page import="kr.co.greenart.Country"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
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
	
	<!-- empty 다음에 오는 객체가 null이면 true를 반환한다. 원소가 있거나 값이 있으면 false를 반환한다.-->
	<c:if test="${not empty list}">
		<ul>
			<c:forEach var="country" items="${list}">
				<li>${ country.name } ${ country.population }</li>
			</c:forEach>
		</ul>
	</c:if>

</body>
</html>