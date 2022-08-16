<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		if(age == null || age.trim().length() == 0) {
			response.setStatus(400);
			out.println("잘못된 입력");
		}
		
		if (name.equals(" ")) {
			out.println("이름은 공백을 입력할수 없습니다.");
			out.println("<br/>");
			out.println("<a href='./person.jsp'>다시 입력하기</a>");
		} else {		
			out.println("( " + name + ", " + age + " ) 님 환영합니다.");
		}
	%>
</body>
</html>