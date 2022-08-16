<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사람등록페이지</title>
</head>
<body>
	<!-- 
		사람등록페이지(입력 양식 제공) 
			-> action = mapping된 servlet
			-> service 메소드 {
				db행을 추가
				redirect 응답(사람목록페이지)			
			}
	-->
	<h2>사람등록 페이지</h2>
	<!-- post로 전송하면 한글이 깨짐. 이 때 리퀘스트 객체를 전달하는 방식을 정해주면된다-->
	<form action="./personcreate" method="post">
		<label> 이름 <input type="text" name="firstName" required />
		</label> <br> <label> 성 <input type="text" name="lastName"
			required />
		</label> <br> <label> 나이 <input type="number" name="age" required />
		</label> <br> <label> 이메일 <input type="text" name="email"
			required />
		</label> <br> <input type="submit" value="등록" />
		<c:if test="${not empty errors}">
			<div>
				<c:forEach var="message" items="${errors}">
					<p>${ message.value }</p>
				</c:forEach>
			</div>
		</c:if>
	</form>
</body>
</html>