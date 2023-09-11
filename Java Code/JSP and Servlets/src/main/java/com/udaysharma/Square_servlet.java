package com.udaysharma;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/sq")
public class Square_servlet extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException{
    /* this is used for the RequestDispatcher */
    	PrintWriter out=resp.getWriter();
//int k=(int)req.getAttribute("k");
//out.print("hello to submation of number "+k);
//k=k*k;
//    	out.print("hello to squre "+k);
//    	System.out.println("this is Sq colled");
    	
    /* this is used for the	SendRedirect */
//    	int k=Integer.parseInt(req.getParameter("k"));
//    	out.print("hello to submation of number "+k);
//    	k=k*k;
//    	out.print("hello to squre "+k);
//    	System.out.println("this is Sq colled");
    /* HttpSession */
//    	HttpSession session=req.getSession();
//    	session.removeAttribute("k");    // remove attribute session
//    	int k=(int)session.getAttribute("k");  // typecasting
//    	out.print("hello to submation of number "+k);
//    	k=k*k;
//    	out.print(" hello to squre "+k);
//    	System.out.println(" this is Sq colled");  
    	
   /* Cookie  */
    	int k=0;
    	Cookie cookies[]=req.getCookies();
    	for(Cookie c:cookies) {
    		if(c.getName().equals("k")) {
    			k=Integer.parseInt(c.getValue());    }
    	}
    	k=k*k;
    	out.print(" hello to square "+k);
    	System.out.println(" this is Sq colled");
    }
}
