package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(servletNames = { "/admin"})
public class LoginFilter implements Filter {

  
  

	public void destroy() {
		// TODO Auto-generated method stub
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		HttpServletRequest req=(HttpServletRequest) request;
		String uid=request.getParameter("uid");
		String pwd=request.getParameter("pwd");
		System.out.println(pwd);
		
		if(pwd.equalsIgnoreCase("admin")){
			chain.doFilter(request, response);
		}
		else{
			out.print("Sorry username or password error!");
			RequestDispatcher rd=request.getRequestDispatcher("invalid");
			rd.include(request, response);		
			
		}
	
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
