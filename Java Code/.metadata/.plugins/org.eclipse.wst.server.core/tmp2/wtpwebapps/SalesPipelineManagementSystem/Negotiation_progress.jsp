<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="java.io.IOException" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Negotiation Sales</title>
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
table > *{
  font-weight: 500;
  font-size:18px;
  color:#fff;
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
    <h1 class="display-5 fw-bold">NEGOTIATION PORGRESS SALES</h1>
    <div class="col-lg-6 mx-auto">
      <p class="lead mb-1">Quickly design and customize responsive mobile-first sites with Bootstrap, the world’s most popular front-end open source toolkit, featuring Sass variables and mixins, responsive grid system, extensive prebuilt components, and powerful JavaScript plugins.</p>
          <a href="view-progress.jsp" class="btn btn-primary">Edit Negotiation Sales</a>
    </div>
  </div>
  </section>
   <!-- table -->
 <table class="table table-hover text-center">
 <thead>
    <tr> 
       <th class="col">Lead ID</th>
       <th scope="col">Lead Name</th>
      <th scope="col">Lead Contact</th>
      <th scope="col">Progress Status</th>
      <th scope="col">Move the Sale</th>
    </tr>
  </thead>
  <tbody>
    <%
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
			String selectsql="select * from progress where progressstatus='Negotiation';";
			resultSet=statement.executeQuery(selectsql);
            
			while(resultSet.next()){
			%>
   	<tr align="center">
		    <th scope="row"><%out.println(resultSet.getString("progressid")); %></th>
		    <td><b><%out.println(resultSet.getString("progressleadname")); %></b></td>
		    <td><b><%out.println(resultSet.getString("progressleadcontact")); %></b></td>
		    <td><b><%out.println(resultSet.getString("progressstatus")); %></b></td>
		    
		    	          <!--anything happen then we have to delete it  -->
      <td><b><form action="Negotiationtoclosing" method="post">
       <div class="card" style="width: 5rem;">
           
                    <input type="hidden" name="Progressid" class="form-control form-control-lg bg-light fs-6" placeholder="Sales Lead Name" required="required" value="<%out.println(resultSet.getString("progressid")); %>">
                    <input type="hidden" name="Progressleadname" class="form-control form-control-lg bg-light fs-6" placeholder="Sales Lead Name" required="required" value="<%out.println(resultSet.getString("progressleadname")); %>">
                    <input type="hidden" name="Progressleadcontact" class="form-control form-control-lg bg-light fs-6" placeholder="Sales Lead Name" required="required" value="<%out.println(resultSet.getString("progressleadcontact")); %>">
                
         <input type="submit" name="negotiationtoclosing" value="Pass" class="form-control btn-success font-weight-bolder">
       </div>
       </form></b></td>
      <!--  -->
		    
		    
		    
       </tr>
   <% }}catch(Exception e){
    	   e.printStackTrace();
       }  
          %>
 </tbody>
 </table>
 <hr>
<!-- Footer -->
         <footer class="footer">
           <div class="social-media">
            <a href=""><i class='bx bxl-gmail'></i></a>
            <a href=""><i class='bx bxl-linkedin'></i></a>
            <a href=""><i class='bx bxl-instagram'></i></a>
            <a href=""><i class='bx bxl-github' ></i></a>
           </div>
        </footer>
<!-- Script -->
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</body>
</html>