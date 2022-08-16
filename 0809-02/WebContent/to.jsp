<%@page import="java.util.Random"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.time.LocalTime"%>
<%
	String alphabet = request.getParameter("alphabet");

	switch (alphabet){
	case "a" : 
		//현재 서버시간
		request.setAttribute("result", LocalTime.now());
		request.getRequestDispatcher("A.jsp").forward(request,response);
		break;
	case "b" :
		//현재 서버날짜
		request.setAttribute("result", LocalDate.now());
		request.getRequestDispatcher("B.jsp").forward(request,response);
		break;
	case "c" :
		//랜덤정수 숫자표시
		Random r = new Random();
		int num = r.nextInt();
		request.setAttribute("result", num);
		request.getRequestDispatcher("C.jsp").forward(request,response);
		break;
	}
%>