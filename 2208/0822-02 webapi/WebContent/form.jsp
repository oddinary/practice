<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form</title>
</head>
<body>
	<form>
		<input type="text" name="id" id="textid" />
		<button id="btnchk">아이디 중복 확인</button>
		<input type="submit" />
		<!-- ajax : 비동기적으로 요청을 처리하는 (화면이 바뀌지 않는) 방식 -->
	</form>
</body>
<script>
	let elem = document.getElementById("btnchk");
	elem.addEventListener("click", function (e){
		e.preventDefault();
		e.stopPropagation();
		let textid = document.getElementById("textid").value;
		
		if (!textid) {
			return;
		}
		fetch("http://localhost:8080/api/idcheck?id=" + textid)
		.then((resp) => resp.text())
		.then((json) => {
				let result = JSON.parse(json);
				if(result.duplicate) {
					alert("중복입니다.");
				}else{
					alert("사용가능합니다.");
				}
			})
			.catch((e) => console.log(e))
	});
</script>
</html>