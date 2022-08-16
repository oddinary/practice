<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p> context가 뭔가요? </p>
	<%
	// pageContext도 객체다. 뭐하는 객체죠? 
	// Context는 개발자들이 사용할 수 있는 정보들을 모아놓는 공간을 말함
	// 다른 객체들을 꺼내 올 수 있는 공간들
		ServletRequest req = pageContext.getRequest();
		out.println(req == request);
		out.println("<br/>");
		ServletResponse resp = pageContext.getResponse();
		out.println(resp == response);
	%>
</body>
</html>