<%@page import="kr.co.greenart.CountryDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 사용자가 대륙을 선택하면  해당하는 국가의 이름과 인구를 보여주는 페이지(인구순으로 내림차순으로 정렬되어있어야함)-->
	
	<% 
		CountryDao dao = new CountryDao();
		List<String> list = dao.getContinents();
	%>
	<!-- 그냥 test나 ./test만 써도 되지만 주소가 바뀔수도 있으니 이렇게 써줍시다. -->
	<form action="${pageContext.request.contextPath}/test" method="post">
		<select name="continent">
		<% for (int i = 0; i < list.size(); i++) { 
			String value =  list.get(i); %>
			<option value="<%= value %>"><%= value %></option>
		<% } %>
		</select>
		<input type="submit" value="검색">
	</form>
</body>
</html>