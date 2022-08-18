package kr.co.greenart;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		// 서블릿이 요청객체를 다루기전
		System.out.println("do filter 전에");
		
		System.out.println("세션 값을 확인합니다.");
		
		HttpSession session = ((HttpServletRequest) req).getSession();
		Object loginid = session.getAttribute("loginid");
		
		if(loginid != null) {
			System.out.println("로그인 확인되었습니다. 게시판으로 forward합니다");
			// 원래의 흐름을 그대로 이어갈수 있도록 request와 response를 전달해 주는 메소드
			chain.doFilter(req, resp);
			// 서블릿이 요청을 처리하고 응답을 보내기 전에
		} else {
			System.out.println("로그인 되지 않은 유저입니다.");
			
//			response.setStatus(HttpServletResponse.SC_UNAUTHORIZED); // 응답코드 401번(인증이 되어있지 않을 때)
//			request.getRequestDispatcher("needlogin.jsp").forward(req,resp);
			((HttpServletResponse) resp).sendError(HttpServletResponse.SC_UNAUTHORIZED);
		}
		
		System.out.println("do filter후에!");
	}
	
}
