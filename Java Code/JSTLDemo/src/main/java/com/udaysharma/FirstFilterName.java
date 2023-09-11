package com.udaysharma;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/Myservlet")
public class FirstFilterName extends HttpFilter implements Filter {
    public FirstFilterName() {
        super();
    }
	public void destroy() {
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("hi THis is Filter 2");
		PrintWriter out=response.getWriter();
		HttpServletRequest req=(HttpServletRequest) request;
		 String aname=request.getParameter("aname");
    if(!aname.isEmpty())
		chain.doFilter(request, response);
    else
    	out.print("Invalid input name is must");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}
}
