<!-- 요청 흐름을 제어하는 페이지는 servlet클래스에 위치 시켜서 대체 할 수 있다. -->
<%@page import="kr.co.greenart.Country"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.greenart.CountryDao"%>
	<%	
		String continent = request.getParameter("continent");
		CountryDao dao = new CountryDao();
		List<Country> list = dao.getCountryByContinent(continent);
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("searchresult.jsp").forward(request, response);
	%>
	