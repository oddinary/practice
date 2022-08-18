package kr.co.greenart;

import java.sql.SQLException;
import java.util.List;

public class BoardService {
	private BoardDAO dao;
	
	public BoardService(BoardDAO dao) {
		this.dao = dao;
	}

	// 게시글 목록 보기 서비스
		// 입력값과 출력값이 뭔지를 생각해 보자
		// 출력값 : 게시글의 목록
	// public 목록<게시글> 게시글목록보기서비스()
		public List<BoardArticle> 게시글목록보기서비스(){
			// 필요한 로직을 포함하는 문장들(트랜잭션 제어 등)
			try {
				return dao.게시글목록가져오기();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException("데이터를 읽을 수 없습니다.");
				// 실패시 재시도 하는 로직 
			} 
			
			// 결과 반환
		}
	
	// 게시글 작성 서비스
	
	// 게시글 수정 서비스
	
	// 게시글 내용 보기 서비스
	
	// 게시글 삭제 서비스
}
