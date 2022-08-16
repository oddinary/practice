package person;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class createServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 제대로된 경로로 입력을 하게끔 안내만 해준다.
		resp.sendRedirect(req.getContextPath() + "/newperson.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 한글이 깨지는 문제를 수정한다.
				// post로 전송하면 한글이 깨짐. 이 때 리퀘스트 객체를 전달하는 방식을 정해주면된다
				req.setCharacterEncoding("UTF-8");

				String firstName = req.getParameter("firstName");
				String lastName = req.getParameter("lastName");
				int age = Integer.parseInt(req.getParameter("age"));
				String email = req.getParameter("email");

				// 입력값이 유효한지 확인하는 절차를 추가한다.
				personValidator validator = new personValidator();

				Map<String, String> errors = new HashMap<>();
				errors.putAll(validator.isValidName(firstName));
				errors.putAll(validator.isValidName(lastName));
				errors.putAll(validator.isValidAge(age));
				errors.putAll(validator.isValidEmail(email));

				if (errors.size() > 0) {
					req.setAttribute("errors", errors);
					req.getRequestDispatcher("newperson.jsp").forward(req, resp);
					// 잘못된 값일때 사용자에게 어떻게 안내해야 하는가??
				} else {
					personDAO dao = new personDAO();
					try {
						dao.create(firstName, lastName, age, email);
					} catch (SQLException e) {
						e.printStackTrace();
					}
					resp.sendRedirect(req.getContextPath() + "/personlist");
				}
	}
}
