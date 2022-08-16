<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>어플리케이션 기본객체에 설정이 되어 있는 값을 확인하는 페이지</p>
<p>add를 실행해준 뒤로는 이 웹 어플이케이션이 동작 하고 있는 도중에는 언제든지 같은 값을 확인할 수 있습니다.</p>
	<%=application.getAttribute("myStr")%>
	<%=application.getAttribute("myInt")%>
<!-- 영역(scope)에 유의하여 사용합시다.  --> 
</body>
</html>