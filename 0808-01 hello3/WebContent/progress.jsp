<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 처리</title>
</head>
<body>
	<p>로그인 처리 요청이 전달되었나요?</p>
	<!-- request는 요청에대한 정보를 담고 있는 객체 -->
	<%
		String id = request.getParameter("userid");
	
		// 입력값이 있으면 xx님 반갑습니다. 로 출력되게
		// 해당 파라미터 값이 전달이 되었는데 입력값이 없으면 빈문자열 ("")이 전달 됨
		// 없는 파라미터 값을 요청하면 null이 출력된다.
		if (id.length() > 0) {
			out.println(id + "님 반갑습니다.");
		} else {
			out.println("id를 입력하세요");
			// 응답객체
			// 전달 받은 주소에 대해서 새 요청을 만듦
			response.sendRedirect("./login.jsp");
			
			//header에 고유한 id를 줘서 기억하고 클라이언트에게 기억시킴 (세션, 세션 id)
			// 재요청할 때 기억된 id로 요청해서 재요청인지 확인하게 함(쿠키내용을 서버에 전송함)
			// 세션은 서버에 쿠키는 클라이언트에 저장됨
		}
	%>
</body>
</html>