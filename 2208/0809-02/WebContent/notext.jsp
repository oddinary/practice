<%
	int result =  1 + 1;
	request.setAttribute("result", result);
	request.getRequestDispatcher("/WEB-INF/viewPage.jsp").forward(request,response);
	// 페이지 이름 그대로 요청을 하나로 합쳐줌
	// wep-inf안에 넣으면 더 안전하게 볼수 있겠죠?
%>