/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.75
 * Generated at: 2023-06-26 11:17:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.IOException;

public final class view_002dprogress_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.io.IOException");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>View Progress Sales</title>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write(" <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/salespagestyle.css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body{\r\n");
      out.write("background: url(\"images/420eaf34ce5e6aae43d607d61086c740.jpg\");\r\n");
      out.write("background-size: cover;\r\n");
      out.write("}\r\n");
      out.write(".search-bar input{\r\n");
      out.write("font-weight: 600;\r\n");
      out.write("  transition: ease-out 0.3s;\r\n");
      out.write("}\r\n");
      out.write(".search-bar input:hover{\r\n");
      out.write("  letter-spacing: 2px;\r\n");
      out.write("  transition: ease-in 0.3s;\r\n");
      out.write("}\r\n");
      out.write("table > *{\r\n");
      out.write("  font-weight: 500;\r\n");
      out.write("  font-size:18px;\r\n");
      out.write("  color:#fff;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  ");

 response.setHeader("Cache-Control","no-cache , no-store , must-revalidate");
 response.setHeader("Progma","no-cache");
 response.setHeader("Expires","0");
                if(session.getAttribute("uname")==null){
	            response.sendRedirect("login.jsp");
                    }

      out.write("\r\n");
      out.write("<!--Header  -->\r\n");
      out.write("<header class=\"header\">\r\n");
      out.write("<div class=\"logo\">\r\n");
      out.write("<img alt=\"image\" src=\"images/analytics.gif\" class=\"image1\"><img alt=\"image\" class=\"image2\" src=\"images/company-logo.png\">\r\n");
      out.write("  </div>\r\n");
      out.write("    <nav class=\"navbar\">\r\n");
      out.write("        <a href=\"index.jsp\">Home</a>\r\n");
      out.write("        <a href=\"#\">About</a>\r\n");
      out.write("        <a href=\"#\">Services</a>\r\n");
      out.write("        <a href=\"#\">Contact</a>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <form action=\"Logout\" class=\"search-bar\">\r\n");
      out.write("     <input type=\"submit\" value=\"Logout\">\r\n");
      out.write("    </form>\r\n");
      out.write("   </header> \r\n");
      out.write("  <!-- Section-1 -->\r\n");
      out.write("<section>\r\n");
      out.write("   <div class=\"px-4 py-2 my-0 text-center\">\r\n");
      out.write("    <h1 class=\"display-5 fw-bold\">View And Modify PORGRESS SALES</h1>\r\n");
      out.write("    <div class=\"col-lg-6 mx-auto\">\r\n");
      out.write("      <p class=\"lead mb-1\">Quickly design and customize responsive mobile-first sites with Bootstrap, the world’s most popular front-end open source toolkit, featuring Sass variables and mixins, responsive grid system, extensive prebuilt components, and powerful JavaScript plugins.</p>\r\n");
      out.write("          <a href=\"Progresssales.jsp\" class=\"btn btn-primary\">Add New Progress Sales</a>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  </section>\r\n");
      out.write("   <!-- table -->\r\n");
      out.write(" <table class=\"table table-hover text-center\">\r\n");
      out.write(" <thead>\r\n");
      out.write("    <tr> \r\n");
      out.write("       <th class=\"col\">Lead ID</th>\r\n");
      out.write("       <th scope=\"col\">Lead Name</th>\r\n");
      out.write("      <th scope=\"col\">Lead Contact</th>\r\n");
      out.write("      <th scope=\"col\">Progress Status</th>\r\n");
      out.write("      <th scope=\"col\">Update</th>\r\n");
      out.write("      <th scope=\"col\">Delete</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </thead>\r\n");
      out.write("  <tbody>\r\n");
      out.write("    ");

     Connection connection=null;
     Statement statement=null;
     ResultSet resultSet=null;
     
     try {
     	String url="jdbc:mysql://localhost:3306/sales_pipline_manaagement";
         String usernamedb="root";
      	String passworddb="uday123";
	       	 Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection(url, usernamedb, passworddb);
			statement=connection.createStatement();
			String selectsql="select * from progress;";
			resultSet=statement.executeQuery(selectsql);
            
			while(resultSet.next()){
			
      out.write("\r\n");
      out.write("   	<tr align=\"center\">\r\n");
      out.write("		    <th scope=\"row\">");
out.println(resultSet.getString("progressid")); 
      out.write("</th>\r\n");
      out.write("		    <td><b>");
out.println(resultSet.getString("progressleadname")); 
      out.write("</b></td>\r\n");
      out.write("		    <td><b>");
out.println(resultSet.getString("progressleadcontact")); 
      out.write("</b></td>\r\n");
      out.write("		    <td><b>");
out.println(resultSet.getString("progressstatus")); 
      out.write("</b></td>\r\n");
      out.write("        \r\n");
      out.write("        <td><div class=\"card\" style=\"width:5rem;\">\r\n");
      out.write("      <a href='update_progress.jsp?u=");
      out.print(resultSet.getString("progressid"));
      out.write("' class=\"btn btn-success\"><b>Edit</b></a></div></td>\r\n");
      out.write("  \r\n");
      out.write("       <td><b><form action='DeleteProgress?d=");
      out.print(resultSet.getString("progressid"));
      out.write("' method=\"post\">\r\n");
      out.write("       <div class=\"card\" style=\"width: 5rem;\">\r\n");
      out.write("         <input type=\"submit\" name=\"delete\" value=\"Delete\" id=\"");
      out.print(resultSet.getString("progressid") );
      out.write("\" class=\"form-control btn-danger font-weight-bolder\">\r\n");
      out.write("       </div>\r\n");
      out.write("       </form></b></td>\r\n");
      out.write("       </tr>\r\n");
      out.write("   ");
 }}catch(Exception e){
    	   e.printStackTrace();
       }  
          
      out.write("\r\n");
      out.write(" </tbody>\r\n");
      out.write(" </table>\r\n");
      out.write(" <hr>\r\n");
      out.write("<!-- Footer -->\r\n");
      out.write("         <footer class=\"footer\">\r\n");
      out.write("           <div class=\"social-media\">\r\n");
      out.write("            <a href=\"\"><i class='bx bxl-gmail'></i></a>\r\n");
      out.write("            <a href=\"\"><i class='bx bxl-linkedin'></i></a>\r\n");
      out.write("            <a href=\"\"><i class='bx bxl-instagram'></i></a>\r\n");
      out.write("            <a href=\"\"><i class='bx bxl-github' ></i></a>\r\n");
      out.write("           </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("<!-- Script -->\r\n");
      out.write(" <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
