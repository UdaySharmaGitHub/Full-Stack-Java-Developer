package com.udaysharma;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/add")
public class AddServlets extends HttpServlet {
	public  void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
	// we need to convert the String into integer
	int i=Integer.parseInt(req.getParameter("num1"));
	int j=Integer.parseInt(req.getParameter("num2"));
	// performing the add operation
	int k = i+j;
	PrintWriter out=resp.getWriter();
	out.println("<html><body bgcolor='cyan'>");
	out.println("Output : "+k);
	out.println("</body></html>");
	}
}
