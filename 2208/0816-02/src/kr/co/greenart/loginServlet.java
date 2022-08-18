package kr.co.greenart;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/loginservice")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//post는 입력요청이 파라미터로 날아오니까 요청객체의 파라미터를 살펴봐야한다.
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		if (password != null && password.equals("qwer")) {
			// 로그인 성공
			// 세션 객체를 통해서
			HttpSession session = request.getSession();
			session.setAttribute("loginid", id);
		} 
		
		request.getRequestDispatcher("./loginresult.jsp").forward(request, response);
	}

}
