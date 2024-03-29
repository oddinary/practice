package kr.co.greenart;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

@WebListener
public class myRequestListener implements ServletRequestListener, ServletRequestAttributeListener{
	// 흐름 확인용으로 자주 확인한다. 논리적 처리는 필터에서 함.(모든 사용자 이벤트)
	// 필터는 URL에 대해서 , 리퀘스트리스너는 모든 요청에 관해서 
	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		System.out.println("요청 객체에 attribute가 설정 되었음.");
		System.out.println(srae.getName()+srae.getValue());//보안상의 문제가 생길 수 있기 때문에 테스트용으로만 사용
		
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("사용자 요청이 발생했을 때 이벤트");
		HttpServletRequest req = (HttpServletRequest) sre.getServletRequest();
		System.out.println(req.getRequestURI()+"를 요청하였음.");
	}
	
}
