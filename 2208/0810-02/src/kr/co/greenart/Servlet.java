package kr.co.greenart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// 특정한 클래스를 상속받을 수 있게 한다.
public class Servlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// html도 가능하다. 하지만 서블릿에서는 사용자가 보는 화면을 작성하는 것을 하지않는다. jsp가 하게함.

		
		req.setAttribute("title", "서블릿에서 설정한 제목");
		req.setAttribute("message", "서블릿에서 설정한 메세지");
		req.getRequestDispatcher("messageoutput.jsp").forward(req, resp);
	}
	
}
