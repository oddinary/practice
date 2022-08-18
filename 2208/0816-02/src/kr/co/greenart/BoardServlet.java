package kr.co.greenart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@WebServlet("/board")
public class BoardServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;
	
	private static Logger logger = LoggerFactory.getLogger(BoardServlet.class);
	
	// 게시글 보기를 제공해주는 객체
	// 필드가 생겼고 메소드를 호출해야 하니까 객체가 하나 초기화되어 있어야함(객체 의존성)
	// 객체 의존성은 세터나 생성자로 설정이 가능하다. 
	private BoardService service;
	
	// init객체를 호출 해서 필드 초기화 해주기
	@Override
	public void init(ServletConfig config) throws ServletException {
		service = new BoardService(new BoardDAO());
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("사용자가 get방식으로 게시판 목록을 요청하였습니다.");
		logger.info("logger를 통해 메세지를 남깁니다.");
		logger.info("사용자가 Get요청함 (게시판 목록)");
		//slf4j - FATAL / ERROR / WARN / INFO / DEBUG (중요도)
			
			List<BoardArticle> articles = service.게시글목록보기서비스();
			request.setAttribute("articles", articles);
			
			request.getRequestDispatcher("/WEB-INF/articles.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
}
