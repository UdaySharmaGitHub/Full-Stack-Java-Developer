package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
//	we have to use the post request when we send the data from client to server.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 String uname =request.getParameter("uname");
	 String pass=request.getParameter("pass");
	 if(uname.equals("Uday Sharma") && pass.equals("Abc123")) {
		 HttpSession session=request.getSession();
		 session.setAttribute("username", uname);
		 response.sendRedirect("welcome.jsp");
	 }
	 else {
		 response.sendRedirect("login.jsp");
	 }
	}
}
