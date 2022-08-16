package kr.co.greenart;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/editcookie")
public class EditCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie c = new Cookie("yourname", "edit");
		response.addCookie(c);
		Cookie c2 = new Cookie("korname","삭제될꺼니까");
		c2.setMaxAge(0); // 초 단위로 기간을 설정해 줄 수 있음
		response.addCookie(c2);
		
		// 쿠키의 삭제도 가능하다.
		// 쿠키는 보통 기간이 만료 되었을 때 삭제 됨.
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
