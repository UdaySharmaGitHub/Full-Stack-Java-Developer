package com.udaysharma;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	 protected void doGet(HttpServletRequest request,HttpServletResponse response ) throws ServletException, IOException {
		  // JSTL--> JSP Standard tag library
//		  String name="uday";
//		  request.setAttribute("label", name);
//		  Student s=new Student(1,"uday Sharma");
//		  request.setAttribute("Student",s);
		  // we can also create a list
		  List<Student> studs=Arrays.asList(new Student(1,"uday Sharma"),new Student(2,"yashas"),new Student(3,"Anshul"));
		  request.setAttribute("students", studs);
		  RequestDispatcher rd=request.getRequestDispatcher("display.jsp");
		  rd.forward(request, response);
	 }
}
