/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.75
 * Generated at: 2023-06-26 07:14:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">  \r\n");
      out.write("<link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/indexpagestyle.css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body{\r\n");
      out.write("background: url(\"images/420eaf34ce5e6aae43d607d61086c740.jpg\");\r\n");
      out.write("background-size: cover;\r\n");
      out.write("}\r\n");
      out.write(".lead{\r\n");
      out.write(" font-weight: 600;\r\n");
      out.write(" }\r\n");
      out.write(" .img-fluid{\r\n");
      out.write("  border-radius: 15px;\r\n");
      out.write("  box-shadow: 10px 10px 15px rgb(0,0,0,0.7);\r\n");
      out.write("  transition: ease-out 0.5s;\r\n");
      out.write(" }\r\n");
      out.write(" .img-fluid:hover{\r\n");
      out.write("     transform:scale(1.1);\r\n");
      out.write("     transition: ease-in 0.5s;\r\n");
      out.write(" }\r\n");
      out.write(" /*------------ Footer ------------*/\r\n");
      out.write(".footer{\r\n");
      out.write("	display: flex;\r\n");
      out.write("   justify-content: center;\r\n");
      out.write("   align-items: center;\r\n");
      out.write("}\r\n");
      out.write("div .row a{\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	color: black;\r\n");
      out.write("	font-weight: 400;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-media{\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("gap: 10px ;\r\n");
      out.write("height: 50px;\r\n");
      out.write("width:150px;\r\n");
      out.write("}\r\n");
      out.write(".social-media >a{\r\n");
      out.write("    font-size: 30px;\r\n");
      out.write("    color: white;\r\n");
      out.write("    font-weight: 600;\r\n");
      out.write("}\r\n");
      out.write(".bxl-gmail{\r\n");
      out.write("	color: red;\r\n");
      out.write("}\r\n");
      out.write(".bxl-linkedin{\r\n");
      out.write("	color: #0A6EBD;\r\n");
      out.write("}\r\n");
      out.write(".bxl-instagram{\r\n");
      out.write("   color:#40128B;\r\n");
      out.write("}\r\n");
      out.write(".bxl-github{\r\n");
      out.write("	color: black;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--NavBar-->\r\n");
      out.write("<header class=\"header\">\r\n");
      out.write("<div class=\"logo\">\r\n");
      out.write("<img alt=\"\" src=\"images/analytics.gif\" class=\"image1\"><img alt=\"\" class=\"image2\" src=\"images/company-logo.png\">\r\n");
      out.write("  </div>\r\n");
      out.write("    <nav class=\"navbar\">\r\n");
      out.write("        <a href=\"index.jsp\">Home</a>\r\n");
      out.write("        <a href=\"#\">About</a>\r\n");
      out.write("        <a href=\"#\">Services</a>\r\n");
      out.write("        <a href=\"#\">Contact</a>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <form action=\"#\" class=\"search-bar\">\r\n");
      out.write("        <input type=\"text\" placeholder=\"search...\" >\r\n");
      out.write("        <button class=\"search\"><i class='bx bx-search-alt-2'></i></button>\r\n");
      out.write("    </form>\r\n");
      out.write("   </header>  \r\n");
      out.write(" <!-- Sections -->\r\n");
      out.write("  <section>\r\n");
      out.write("  <div class=\"container col-xxl-8 px-4 py-1\">\r\n");
      out.write("    <div class=\"row flex-lg-row-reverse align-items-center g-5 py-5\">\r\n");
      out.write("      <div class=\"col-10 col-sm-8 col-lg-6\">\r\n");
      out.write("        <img src=\"images/image-sales.jpg\" class=\"d-block mx-lg-auto img-fluid\" alt=\"Sales Image\" width=\"700\" height=\"500\" loading=\"lazy\">\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-lg-6\">\r\n");
      out.write("        <h1 class=\"display-5 fw-bold lh-1 mb-3\">Manage Your Business Query with Ease</h1>\r\n");
      out.write("                <p class=\"lead\">Pipeline management is the process of identifying and managing all the moving parts — from manufacturing to your sales team— within a supply chain. The best-performing companies learn how to identify where their cash is flowing and then direct that money where it's most productive. This is called “pipeline management.”</p>\r\n");
      out.write("        <p class=\"lead\"></p>\r\n");
      out.write("        <div class=\"d-grid gap-2 d-md-flex justify-content-md-start\">\r\n");
      out.write("          <a href=\"login.jsp\"><button type=\"button\" class=\"btn btn-success btn-lg px-4 me-md-2\">Login</button></a>\r\n");
      out.write("          <a href=\"registration.jsp\"><button type=\"button\" class=\"btn btn-primary btn-lg px-4\">Sign Up</button></a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  </section>\r\n");
      out.write(" <!-- Footer -->\r\n");
      out.write("     <footer class=\"footer\">\r\n");
      out.write("           <div class=\"social-media\">\r\n");
      out.write("            <a href=\"\"><i class='bx bxl-gmail'></i></a>\r\n");
      out.write("            <a href=\"https://www.linkedin.com/in/uday-sharma-602b33267\"><i class='bx bxl-linkedin'></i></a>\r\n");
      out.write("            <a href=\"\"><i class='bx bxl-instagram'></i></a>\r\n");
      out.write("            <a href=\"\"><i class='bx bxl-github' ></i></a>\r\n");
      out.write("        </div></footer>\r\n");
      out.write("<!-- Scripts -->\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write(" </body>\r\n");
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