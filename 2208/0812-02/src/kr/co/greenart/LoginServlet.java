package kr.co.greenart;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect(req.getContextPath() + "/idriminder.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		String rememberme = req.getParameter("rememberme");

		if (password.equals("1234")) {
			// 로그인 성공
			// 쿠키를 담은 성공메세지 응답
			Cookie login = new Cookie("login", URLEncoder.encode("login","utf-8"));
			login.setMaxAge(60 * 60);
			resp.addCookie(login);
			if (rememberme != null && rememberme.equals("on")) {
				Cookie c = new Cookie("rememberme", URLEncoder.encode(id,"utf-8"));
				c.setMaxAge(60 * 60 * 24);

				resp.addCookie(c);
			}
			req.getRequestDispatcher("loginsuccese.jsp").forward(req, resp);
		} else {
			// 실패
			resp.sendRedirect("./idreminder.jsp");
		}
	}
}
