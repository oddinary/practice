<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p> 결과는 </p>
	<%
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		switch (request.getParameter("calc")) {
		case "plus" : 
			out.println(num1 + num2);
			break;
		case "minus" : 
			out.println(num1 - num2);
			break;
		case "multiple" : 
			out.println(num1 * num2);
			break;
		case "division" :
			if(num2 != 0){
				out.println(num1 / num2 +"와(과) 나머지"+ num1 % num2);
				break;
			} else {
				out.println("0으로 나눌 수 없어요.");	
			}
		}
	%>
</body>
</html>