package kr.co.greenart;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

// 모든 요청에 대해서 동작하게하려면 /*를 해줘야한다. 
@WebFilter(filterName= "EncodingFilter", urlPatterns="/*", initParams = @WebInitParam(name="encoding",value="utf-8"))

public class EncodingFilter implements Filter{
	private String encoding;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// init 메소드는 객체가 필요할 때 생성을 위해서 한번 호출 된다.
		encoding = filterConfig.getInitParameter("encoding");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		request.setCharacterEncoding(encoding);
		response.setCharacterEncoding(encoding);
		
		chain.doFilter(request, response);
		
	}
	

}
