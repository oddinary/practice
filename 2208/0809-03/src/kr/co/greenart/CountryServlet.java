package kr.co.greenart;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// 특정한 클래스를 상속받을 수 있게 한다.
public class CountryServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// html도 가능하다. 하지만 서블릿에서는 사용자가 보는 화면을 작성하는 것을 하지않는다.
		// jsp가 하게함.

		// 요청 흐름을 제어하는 페이지는 servlet클래스에 위치 시켜서 대체 할 수 있다.
				String continent = req.getParameter("continent");
				CountryDao dao = new CountryDao();
				List<Country> list = null;
				try {
					list = dao.getCountryByContinent(continent);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				req.setAttribute("list", list);
				req.getRequestDispatcher("searchresult.jsp").forward(req, resp);

			
	}
	
}
