<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update the Processed Sale</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
 <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
<link rel="stylesheet" href="CSS/salespagestyle.css">
<style type="text/css">
body{
background: url("images/420eaf34ce5e6aae43d607d61086c740.jpg");
background-size: cover;
}
.search-bar input{
font-weight: 600;
  transition: ease-out 0.3s;
}
.search-bar input:hover{
  letter-spacing: 2px;
  transition: ease-in 0.3s;
}
</style>
</head>
<body>
 <%
 response.setHeader("Cache-Control","no-cache , no-store , must-revalidate");
 response.setHeader("Progma","no-cache");
 response.setHeader("Expires","0");
                if(session.getAttribute("uname")==null){
	            response.sendRedirect("login.jsp");
                    }
%>
<!--Header  -->
<header class="header">
<div class="logo">
<img alt="image" src="images/analytics.gif" class="image1"><img alt="image" class="image2" src="images/company-logo.png">
  </div>
    <nav class="navbar">
        <a href="index.jsp">Home</a>
        <a href="#">About</a>
        <a href="#">Services</a>
        <a href="#">Contact</a>
    </nav>
    <form action="Logout" class="search-bar">
     <input type="submit" value="Logout">
    </form>
   </header> 
  <!-- Section-1 -->
 <section>
   <div class="px-4 py-2 my-0 text-center">
    <h1 class="display-5 fw-bold">UPDATE  YOUR  PROGRESS  SALES</h1>
    <div class="col-lg-6 mx-auto">
      <p class="lead mb-1">Quickly design and customize responsive mobile-first sites with Bootstrap, the world’s most popular front-end open source toolkit, featuring Sass variables and mixins, responsive grid system, extensive prebuilt components, and powerful JavaScript plugins.</p>
          <a href="Progresssales.jsp" class="btn btn-primary">Add New Porgress Sales</a>
    </div>
  </div>
 </section>
<!-- Section-1 -->
   <div class="card-body">
   <div class="container">
      <div class="row">
      <div class="col-md-6 offset-md-3">
      <div class="card rounded-lg border border-danger">
       <div class="card-header">
        <h3 align="center">UPDATE SALES</h3>
       </div>
 <%@ page import="java.sql.Statement" %>
 <%@ page import="java.sql.DriverManager" %>
 <%@ page import="java.sql.Connection" %>
 <%@ page import="java.sql.Statement" %>
 <%@ page import="java.sql.ResultSet" %>
 
  <%
  String u=request.getParameter("u");
  Integer Processedid=Integer.parseInt(u);
  
  String url="jdbc:mysql://localhost:3306/sales_pipline_manaagement";
  String usernamedb="root";
	String passworddb="uday123";
    	 Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection(url, usernamedb, passworddb);
		Statement statement=connection.createStatement();
		String selectbyidsql="select * from processed where processedid='"+Processedid+"';";
		ResultSet resultSet=statement.executeQuery(selectbyidsql);
 %>
       <div class="card-body rounded-lg">
                <form action="UpdateProcessed" method="post">
 <%
      while(resultSet.next()){
   %>             <div class="input-group mb-2">
                    <input type="hidden" name="Processedid" class="form-control form-control-lg bg-light fs-6" placeholder="Processed Sales Lead id" required="required" value="<%out.println(resultSet.getString("processedid")); %>">
                </div>  
                <div class="input-group mb-2">
                    <input type="text" name="Processedleadname" class="form-control form-control-lg bg-light fs-6" placeholder="Processed Sales Lead Name" required="required" value="<%out.println(resultSet.getString("processedleadname")); %>">
                </div>
                <div class="input-group mb-2">
                    <input type="text" name="Processedleadcontact" class="form-control form-control-lg bg-light fs-6" placeholder="Processed Sales Lead Contact" required="required" value="<%out.println(resultSet.getString("processedleadcontact")); %>">
                </div>
                <div class="input-group mb-2">
                    <input type="text" name="Processedstatus" class="form-control form-control-lg bg-light fs-6" placeholder="Processed Sales Status " required="required" value="<%out.println(resultSet.getString("processedstatus")); %>">
                </div>
  <%
  }
  %>
                <div class="input-group mb-3 d-flex justify-content-between">
                    <div class="form-check">
                        <input type="checkbox" class="form-check-input" id="formCheck">
                        <label for="formCheck" class="form-check-label text-secondary"><small>I agree to Update this PROGRESS SALE<a href="#">Terms of service</a></small></label>
                    </div>
                </div>
                <div class="input-group mb-3">
                        <input class="btn btn-success w-100 fs-6 py-2" type="submit" value="Update Processed Sale">
                </div>
              </form>
       </div>
       </div>
      </div>
      </div>
   </div>
   </div>
<!-- Script -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>