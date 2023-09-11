package com.udaysharma;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Myservlet extends HttpServlet {
     protected void doget(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
     PrintWriter out=response.getWriter();
     out.print("Hi<br>");
     ServletContext ctx=getServletContext();
     String str=ctx.getInitParameter("name");
     out.print(str);
     String str1=ctx.getInitParameter("phone");
     out.print("and my phone is "+str1);
     }
    	 
     }
