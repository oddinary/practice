<%@page import="java.net.URLDecoder"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Map.Entry"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>클라이언트 및 서버정보</title>
</head>
<body>
클라이언트IP = <%= request.getRemoteAddr() %> <br>
<!-- 리퀘스트 객체 : 톰캣이 요청에 응답해서 객체를 생성해줌-->
   요청정보길이 = <%= request.getContentLength() %> <br>
   요청정보 인코딩 = <%= request.getCharacterEncoding() %> <br>
   요청정보 컨텐츠타입 = <%= request.getContentType() %> <br>
   요청정보 프로토콜 = <%= request.getProtocol() %> <br>
   요청정보 전송방식 = <%= request.getMethod() %> <br>
   요청 URI = <%= request.getRequestURI() %> <br>
   컨텍스트 경로 = <%= request.getContextPath() %> <br>
   서버이름 = <%= request.getServerName() %> <br>
   서버포트 = <%= request.getServerPort() %> <br>
   
   <%
   		request.setCharacterEncoding("UTF-8");
   %>
   <%=request.getRequestURL() %> <br>
   <%=request.getQueryString() %> <br>
   사용자이름 = <%= URLDecoder.decode(request.getParameter("name"), "UTF-8") %>  <br>
   사용자나이 = <%= request.getParameter("age") %>  <br>
   사용자성별 = <%= request.getParameter("radiochoice") %>  <br>
   사용자취미 = <%= Arrays.toString(request.getParameterValues("hobby")) %><br>
   <%
   		Map<String,String[]> map = request.getParameterMap();
   		for(Entry<String,String[]> e : map.entrySet()){
   			String key = e.getKey();
   			String[] value = e.getValue();
   %>
   			<%= key %> <br>
   			<%= Arrays.toString(value) %> <br>
   <%
   		}
   %> <br>
</body>
</html>