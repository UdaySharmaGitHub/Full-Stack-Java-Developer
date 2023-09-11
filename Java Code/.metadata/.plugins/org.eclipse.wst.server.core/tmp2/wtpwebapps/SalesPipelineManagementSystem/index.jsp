<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">  
<link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
<link rel="stylesheet" href="CSS/indexpagestyle.css">
<style type="text/css">
body{
background: url("images/420eaf34ce5e6aae43d607d61086c740.jpg");
background-size: cover;
}
.lead{
 font-weight: 600;
 }
 .img-fluid{
  border-radius: 15px;
  box-shadow: 10px 10px 15px rgb(0,0,0,0.7);
  transition: ease-out 0.5s;
 }
 .img-fluid:hover{
     transform:scale(1.1);
     transition: ease-in 0.5s;
 }
 /*------------ Footer ------------*/
.footer{
	display: flex;
   justify-content: center;
   align-items: center;
}
div .row a{
	text-decoration: none;
	color: black;
	font-weight: 400;
}

.social-media{
    display: flex;
    justify-content: center;
    align-items: center;
gap: 10px ;
height: 50px;
width:150px;
}
.social-media >a{
    font-size: 30px;
    color: white;
    font-weight: 600;
}
.bxl-gmail{
	color: red;
}
.bxl-linkedin{
	color: #0A6EBD;
}
.bxl-instagram{
   color:#40128B;
}
.bxl-github{
	color: black;
}
</style>
</head>
<body>
<!--NavBar-->
<header class="header">
<div class="logo">
<img alt="" src="images/analytics.gif" class="image1"><img alt="" class="image2" src="images/company-logo.png">
  </div>
    <nav class="navbar">
        <a href="index.jsp">Home</a>
        <a href="#">About</a>
        <a href="#">Services</a>
        <a href="#">Contact</a>
    </nav>
    <form action="#" class="search-bar">
        <input type="text" placeholder="search..." >
        <button class="search"><i class='bx bx-search-alt-2'></i></button>
    </form>
   </header>  
 <!-- Sections -->
  <section>
  <div class="container col-xxl-8 px-4 py-1">
    <div class="row flex-lg-row-reverse align-items-center g-5 py-5">
      <div class="col-10 col-sm-8 col-lg-6">
        <img src="images/image-sales.jpg" class="d-block mx-lg-auto img-fluid" alt="Sales Image" width="700" height="500" loading="lazy">
      </div>
      <div class="col-lg-6">
        <h1 class="display-5 fw-bold lh-1 mb-3">Manage Your Business Query with Ease</h1>
                <p class="lead">Pipeline management is the process of identifying and managing all the moving parts — from manufacturing to your sales team— within a supply chain. The best-performing companies learn how to identify where their cash is flowing and then direct that money where it's most productive. This is called “pipeline management.”</p>
        <p class="lead"></p>
        <div class="d-grid gap-2 d-md-flex justify-content-md-start">
          <a href="login.jsp"><button type="button" class="btn btn-success btn-lg px-4 me-md-2">Login</button></a>
          <a href="registration.jsp"><button type="button" class="btn btn-primary btn-lg px-4">Sign Up</button></a>
        </div>
      </div>
    </div>
  </div>
  </section>
 <!-- Footer -->
     <footer class="footer">
           <div class="social-media">
            <a href=""><i class='bx bxl-gmail'></i></a>
            <a href="https://www.linkedin.com/in/uday-sharma-602b33267"><i class='bx bxl-linkedin'></i></a>
            <a href=""><i class='bx bxl-instagram'></i></a>
            <a href=""><i class='bx bxl-github' ></i></a>
        </div></footer>
<!-- Scripts -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
 </body>
</html>