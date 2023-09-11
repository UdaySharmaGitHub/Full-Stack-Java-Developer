package com.loginwithdb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.loginwithdb.dao.LoginDao;


/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String uname =request.getParameter("uname");
		 String pass=request.getParameter("pass");
		 LoginDao dao=new LoginDao();
		 if(dao.check(uname, pass)) {
		 HttpSession session=request.getSession();
			 session.setAttribute("username",uname);
			 response.sendRedirect("welcome.jsp");
		 }
		 else {
			 response.sendRedirect("loginwithDB.jsp");
		 }
	}
}
