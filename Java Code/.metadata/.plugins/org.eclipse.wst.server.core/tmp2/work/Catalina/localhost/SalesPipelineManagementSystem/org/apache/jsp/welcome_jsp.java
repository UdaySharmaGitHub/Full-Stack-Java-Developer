/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.75
 * Generated at: 2023-06-29 03:31:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Welcome</title>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write(" <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/indexpagestyle.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"CSS/welcomepage.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<style>\n");
      out.write("body{\r\n");
      out.write("background: url(\"images/420eaf34ce5e6aae43d607d61086c740.jpg\");\r\n");
      out.write("background-size: cover;\r\n");
      out.write("}\r\n");
      out.write(".img-fluid{\r\n");
      out.write("   border-radius: 15px;\r\n");
      out.write("   box-shadow: -10px 10px 15px rgb(0,0,0,0.5);	\r\n");
      out.write("}\r\n");
      out.write(".img-icon{\r\n");
      out.write("height:50px ;\r\n");
      out.write("width:50px;\r\n");
      out.write(" mix-blend-mode:multiply;\r\n");
      out.write("}\r\n");
      out.write(".text-color1{\r\n");
      out.write("	color: black;\r\n");
      out.write("}\r\n");
      out.write(".text-color2{\r\n");
      out.write("	color: black;\r\n");
      out.write("}\r\n");
      out.write(".text-color3{\r\n");
      out.write("	color: #fff;\r\n");
      out.write("}\r\n");
      out.write(".search-bar input{\r\n");
      out.write("font-weight: 600;\r\n");
      out.write("  transition: ease-out 0.3s;\r\n");
      out.write("}\r\n");
      out.write(".search-bar input:hover{\r\n");
      out.write("  letter-spacing: 2px;\r\n");
      out.write("  transition: ease-in 0.3s;\r\n");
      out.write("}\r\n");
      out.write(".arrow-div{\r\n");
      out.write(" display: flex;\r\n");
      out.write(" align-items: center;\r\n");
      out.write(" justify-content: center; \r\n");
      out.write("}\r\n");
      out.write(".arrow-image{\r\n");
      out.write("   width:100px;\r\n");
      out.write("   height : 70px;\r\n");
      out.write("      mix-blend-mode:multiply;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write(".arrow-right{\r\n");
      out.write("   width :90px;\r\n");
      out.write("   height : 90px;\r\n");
      out.write("   margin-top:20px;\r\n");
      out.write("   padding-right: 30px;\r\n");
      out.write("      mix-blend-mode:multiply;\r\n");
      out.write("}\r\n");
      out.write(".arrow-right1{\r\n");
      out.write("   width :90px;\r\n");
      out.write("   height : 90px;\r\n");
      out.write("      mix-blend-mode:multiply;\r\n");
      out.write("}\r\n");
      out.write("/* button*/\r\n");
      out.write(".button {\r\n");
      out.write("  position: relative;\r\n");
      out.write("  background-color: transparent;\r\n");
      out.write("  color: #e8e8e8;\r\n");
      out.write("  font-size: 17px;\r\n");
      out.write("  font-weight: 600;\r\n");
      out.write("  border-radius: 10px;\r\n");
      out.write("  width: 150px;\r\n");
      out.write("  height: 60px;\r\n");
      out.write("  border: none;\r\n");
      out.write("  text-transform: uppercase;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  overflow: hidden;\r\n");
      out.write("  box-shadow: 0 10px 20px rgba(51, 51, 51, 0.2);\r\n");
      out.write("  transition: all 0.3s cubic-bezier(0.23, 1, 0.320, 1);\r\n");
      out.write("}\r\n");
      out.write(".button::before {\r\n");
      out.write("  content: \"SEE SALES!\";\r\n");
      out.write("  display: flex;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("  justify-content: center;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 100%;\r\n");
      out.write("  pointer-events: none;\r\n");
      out.write("  background: linear-gradient(135deg,#7b4397,#dc2430 );\r\n");
      out.write("  transform: translate(0%,90%);\r\n");
      out.write("  z-index: 99;\r\n");
      out.write("  position: relative;\r\n");
      out.write("  transform-origin: bottom;\r\n");
      out.write("  transition: all 0.6s cubic-bezier(0.23, 1, 0.320, 1);\r\n");
      out.write("}\r\n");
      out.write(".button::after {\r\n");
      out.write("  content: \"Hover me\";\r\n");
      out.write("  display: flex;\r\n");
      out.write("  align-items: center;\r\n");
      out.write("  justify-content: center;\r\n");
      out.write("  background-color: #333;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: 100%;\r\n");
      out.write("  pointer-events: none;\r\n");
      out.write("  transform-origin: top;\r\n");
      out.write("  transform: translate(0%,-100%);\r\n");
      out.write("  transition: all 0.6s cubic-bezier(0.23, 1, 0.320, 1);\r\n");
      out.write("}\r\n");
      out.write(".button1::after{\r\n");
      out.write("  content: \"Prospecting\";\r\n");
      out.write("}\r\n");
      out.write(".button2::after{\r\n");
      out.write("  content: \"Proposal\";\r\n");
      out.write("}\r\n");
      out.write(".button3::after{\r\n");
      out.write("  content: \"Negotiation\";\r\n");
      out.write("}\r\n");
      out.write(".button4::after{\r\n");
      out.write("  content: \"Closing\";\r\n");
      out.write("}\r\n");
      out.write(".button5::after{\r\n");
      out.write("  content: \"Retention\";\r\n");
      out.write("}\r\n");
      out.write(".button6::after{\r\n");
      out.write("  content: \"Disqualified\";\r\n");
      out.write("}\r\n");
      out.write(".button:hover::before {\r\n");
      out.write("  transform: translate(0%,0%);\r\n");
      out.write("}\r\n");
      out.write(".button:hover::after {\r\n");
      out.write("  transform: translate(0%,-200%);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button:focus {\r\n");
      out.write("  outline: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button:active {\r\n");
      out.write("  scale: 0.95;\r\n");
      out.write("}\r\n");
      out.write("\n");
      out.write("</style>\r\n");
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
      out.write("<img alt=\"\" src=\"images/analytics.gif\" class=\"image1\"><img alt=\"\" class=\"image2\" src=\"images/company-logo.png\">\r\n");
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
      out.write("   </header>  \r\n");
      out.write("   <!-- User Description -->\r\n");
      out.write("   <div class=\"px-4 pt-5 my-3 text-center border-none\">\r\n");
      out.write("    <h1 class=\"display-4 fw-bold\">Welcome ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${uname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" </h1>\r\n");
      out.write("    <br>\r\n");
      out.write("<div class=\"flowsales\">\r\n");
      out.write("      <button class=\"button button1\"></button>\r\n");
      out.write("      <img alt=\"\" src=\"images/icons8-right.gif\" class=\"arrow-right1\">\r\n");
      out.write("      <button class=\"button button2\"></button>\r\n");
      out.write("      <img alt=\"\" src=\"images/icons8-right.gif\" class=\"arrow-right1\">\r\n");
      out.write("      <button class=\"button button3\"></button>\r\n");
      out.write("      <img alt=\"\" src=\"images/icons8-right.gif\" class=\"arrow-right1\">\r\n");
      out.write("      <button class=\"button button4\"></button>\r\n");
      out.write("      <img alt=\"\" src=\"images/icons8-right.gif\" class=\"arrow-right1\">\r\n");
      out.write("      <button class=\"button button5\"></button>\r\n");
      out.write("      <img alt=\"\" src=\"images/icons8-right.gif\" class=\"arrow-right1\">\r\n");
      out.write("      <button class=\"button button6\"></button>\r\n");
      out.write("</div>\r\n");
      out.write("        <h1 class=\"display-4 pt-5 fw-bold\">Overall Sales Report</h1>\r\n");
      out.write("    <div class=\"col-lg-6 mx-auto\">\r\n");
      out.write("      <p class=\"lead mb-4\">A sales manager job description usually includes building and leading a team of salespeople to help drive revenue. Sales managers must motivate their teams to generate leads, build client relationships, set targets to hit or exceed revenue forecasts, and ultimately meet customer needs.</p>\r\n");
      out.write("      <div class=\"d-grid gap-2 d-sm-flex justify-content-sm-center mb-3\">\r\n");
      out.write("    <a href=\"Allsales.jsp\"><button type=\"button\" class=\"btn btn-primary btn-lg px-4 me-sm-3\">All Sales</button></a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"overflow-hidden\" style=\"max-height: 65vh;\">\r\n");
      out.write("      <div class=\"container px-5\">\r\n");
      out.write("        <img src=\"images/image-sales2.jpg\" class=\"img-fluid border rounded-15  mb-3\" alt=\"sales-image\" width=\"500\" height=\"300\" loading=\"lazy\">\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write(" <div class=\"arrow-div\">\r\n");
      out.write("      <img alt=\"\" src=\"images/icons8-double-down.gif\" class=\"arrow-image\">\r\n");
      out.write("  </div> \r\n");
      out.write("  <!-- Progress Sales  -->\r\n");
      out.write("    <div class=\"px-5 pt-1 my-3 text-center border-none\">\r\n");
      out.write("    <h1 class=\"display-4 fw-bold\">Progress Sales Report</h1>\r\n");
      out.write("    <div class=\"col-lg-6 mx-auto\">\r\n");
      out.write("      <p class=\"lead mb-4\">A sales manager job description usually includes building and leading a team of salespeople to help drive revenue. Sales managers must motivate their teams to generate leads, build client relationships, set targets to hit or exceed revenue forecasts, and ultimately meet customer needs.</p>\r\n");
      out.write("      <div class=\"d-grid gap-2 d-sm-flex justify-content-sm-center mb-3\">\r\n");
      out.write("    <a href=\"Progresssales.jsp\"><button type=\"button\" class=\"btn btn-primary btn-lg px-4 me-sm-3\">Progress Sales</button></a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"overflow-hidden\" style=\"max-height: 65vh;\">\r\n");
      out.write("      <div class=\"container px-5\">\r\n");
      out.write("        <img src=\"images/Progress-image.png\" class=\"img-fluid border rounded-15  mb-3\" alt=\"sales-image\" width=\"500\" height=\"300\" loading=\"lazy\">\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"arrow-div\">\r\n");
      out.write("      <img alt=\"\" src=\"images/icons8-double-down.gif\" class=\"arrow-image\">\r\n");
      out.write("  </div>\r\n");
      out.write(" <!-- Processed Sales  -->\r\n");
      out.write("    <div class=\"px-4 pt-1 my-3 text-center border-none\">\r\n");
      out.write("    <h1 class=\"display-4 fw-bold text-color3\">Processed Sales Report</h1>\r\n");
      out.write("    <div class=\"col-lg-6 mx-auto text-color3\">\r\n");
      out.write("      <p class=\"lead mb-4\">A sales manager job description usually includes building and leading a team of salespeople to help drive revenue. Sales managers must motivate their teams to generate leads, build client relationships, set targets to hit or exceed revenue forecasts, and ultimately meet customer needs.</p>\r\n");
      out.write("      <div class=\"d-grid gap-2 d-sm-flex justify-content-sm-center mb-3\">\r\n");
      out.write("    <a href=\"Processedsales.jsp\"><button type=\"button\" class=\"btn btn-primary btn-lg px-4 me-sm-3\">Processed Sales</button></a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"overflow-hidden\" style=\"max-height: 65vh;\">\r\n");
      out.write("      <div class=\"container px-5\">\r\n");
      out.write("        <img src=\"images/Processed-image.jpg\" class=\"img-fluid border rounded-15  mb-3\" alt=\"sales-image\" width=\"500\" height=\"300\" loading=\"lazy\">\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <br>\r\n");
      out.write("   <!-- Section-1 for sales pipeline which is in Progress-->\r\n");
      out.write("<div class=\"container px-4 py-3\" id=\"hanging-icons\">\r\n");
      out.write("    <h2 class=\"pb-2 border-bottom\">Sales Pipeline -In Progress</h2>\r\n");
      out.write("    <div class=\"row g-4 py-5 row-cols-1 row-cols-lg-3 text-color1\">\r\n");
      out.write("      <div class=\"col d-flex align-items-start\">\r\n");
      out.write("        <div class=\"icon-square bg-light text-dark flex-shrink-0 me-3 img-icon\">\r\n");
      out.write("        <img alt=\"\" src=\"images/icons8-answers-100.png\" height=\"50px\" width=\"50px\">\r\n");
      out.write("                 <img alt=\"\" src=\"images/icons8-right.gif\" class=\"arrow-right\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("          <h2>Prospecting</h2>\r\n");
      out.write("          <p>Paragraph of text beneath the heading to explain the heading. We'll add onto it with another sentence and probably just keep going until we run out of words.</p>\r\n");
      out.write("          <a href=\"Prospecting_progress.jsp\" class=\"btn btn-primary\">\r\n");
      out.write("            Prospecting Sales\r\n");
      out.write("          </a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col d-flex align-items-start\">\r\n");
      out.write("        <div class=\"icon-square bg-light text-dark flex-shrink-0 me-3 img-icon\">\r\n");
      out.write("        <img alt=\"\" src=\"images/icons8-group-of-projects-100.png\" height=\"50px\" width=\"50px\">\r\n");
      out.write("         <img alt=\"\" src=\"images/icons8-right.gif\" class=\"arrow-right\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("          <h2>Proposal</h2>\r\n");
      out.write("          <p>Paragraph of text beneath the heading to explain the heading. We'll add onto it with another sentence and probably just keep going until we run out of words.</p>\r\n");
      out.write("          <a href=\"Proposal_progress.jsp\" class=\"btn btn-primary\">\r\n");
      out.write("            Proposal Sales\r\n");
      out.write("          </a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col d-flex align-items-start\">\r\n");
      out.write("        <div class=\"icon-square bg-light text-dark flex-shrink-0 me-3 img-icon\">\r\n");
      out.write("        <img alt=\"\" src=\"images/icons8-approval-100.png\" height=\"50px\" width=\"50px\">\r\n");
      out.write("              <img alt=\"\" src=\"images/icons8-right.gif\" class=\"arrow-right\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("          <h2>Negotiation</h2>\r\n");
      out.write("          <p>Paragraph of text beneath the heading to explain the heading. We'll add onto it with another sentence and probably just keep going until we run out of words.</p>\r\n");
      out.write("          <a href=\"Negotiation_progress.jsp\" class=\"btn btn-primary\">\r\n");
      out.write("            Negotiation Sales</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("   <!-- Sections 2 for sales pipeline which is in Processed-->\r\n");
      out.write("  <div class=\"container px-4 py-3\" id=\"hanging-icons\">\r\n");
      out.write("    <h2 class=\"pb-2 border-bottom\">Sales Pipeline -In Processed</h2>\r\n");
      out.write("    <div class=\"row g-4 py-5 row-cols-1 row-cols-lg-3 text-color2\">\r\n");
      out.write("      <div class=\"col d-flex align-items-start\">\r\n");
      out.write("        <div class=\"icon-square bg-light text-dark flex-shrink-0 me-3 img-icon\">\r\n");
      out.write("        <img alt=\"\" src=\"images/icons8-bonds-100.png\" height=\"50px\" width=\"50px\">\r\n");
      out.write("                 <img alt=\"\" src=\"images/icons8-right.gif\" class=\"arrow-right\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div >\r\n");
      out.write("          <h2>Closing</h2>\r\n");
      out.write("          <p>Paragraph of text beneath the heading to explain the heading. We'll add onto it with another sentence and probably just keep going until we run out of words.</p>\r\n");
      out.write("          <a href=\"Closing_processed.jsp\" class=\"btn btn-primary\">\r\n");
      out.write("            Closing Sales\r\n");
      out.write("          </a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col d-flex align-items-start\">\r\n");
      out.write("        <div class=\"icon-square bg-light text-dark flex-shrink-0 me-3 img-icon\">\r\n");
      out.write("        <img alt=\"\" src=\"images/icons8-journal-100.png\" height=\"50px\" width=\"50px\">\r\n");
      out.write("         <img alt=\"\" src=\"images/icons8-right.gif\" class=\"arrow-right\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("          <h2>Retention</h2>\r\n");
      out.write("          <p>Paragraph of text beneath the heading to explain the heading. We'll add onto it with another sentence and probably just keep going until we run out of words.</p>\r\n");
      out.write("          <a href=\"Retention_processed.jsp\" class=\"btn btn-primary\">\r\n");
      out.write("            Retention Sales\r\n");
      out.write("          </a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col d-flex align-items-start\">\r\n");
      out.write("        <div class=\"icon-square bg-light text-dark flex-shrink-0 me-3 img-icon\">\r\n");
      out.write("        <img alt=\"\" src=\"images/icons8-sales-48.png\" height=\"50px\" width=\"50px\">\r\n");
      out.write("        <img alt=\"\" src=\"images/icons8-right.gif\" class=\"arrow-right\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("          <h2>Disqualified</h2>\r\n");
      out.write("          <p>Paragraph of text beneath the heading to explain the heading. We'll add onto it with another sentence and probably just keep going until we run out of words.</p>\r\n");
      out.write("          <a href=\"Disqualified_processed.jsp\" class=\"btn btn-primary\">\r\n");
      out.write("           Disqualified Sales\r\n");
      out.write("          </a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("<!-- Footer -->\r\n");
      out.write("     <footer class=\"footer\">\r\n");
      out.write("           <div class=\"social-media\">\r\n");
      out.write("            <a href=\"\"><i class='bx bxl-gmail'></i></a>\r\n");
      out.write("            <a href=\"https://www.linkedin.com/in/uday-sharma-602b33267\"><i class='bx bxl-linkedin'></i></a>\r\n");
      out.write("            <a href=\"\"><i class='bx bxl-instagram'></i></a>\r\n");
      out.write("            <a href=\"\"><i class='bx bxl-github' ></i></a>\r\n");
      out.write("        </div></footer>\r\n");
      out.write(" <!-- Scripts -->\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\r\n");
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