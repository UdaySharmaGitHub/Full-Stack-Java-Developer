<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
 <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
<link rel="stylesheet" href="CSS/indexpagestyle.css">
<link rel="stylesheet" href="CSS/welcomepage.css">
</head>
<style>
body{
background: url("images/420eaf34ce5e6aae43d607d61086c740.jpg");
background-size: cover;
}
.img-fluid{
   border-radius: 15px;
   box-shadow: -10px 10px 15px rgb(0,0,0,0.5);	
}
.img-icon{
height:50px ;
width:50px;
 mix-blend-mode:multiply;
}
.text-color1{
	color: black;
}
.text-color2{
	color: black;
}
.text-color3{
	color: #fff;
}
.search-bar input{
font-weight: 600;
  transition: ease-out 0.3s;
}
.search-bar input:hover{
  letter-spacing: 2px;
  transition: ease-in 0.3s;
}
.arrow-div{
 display: flex;
 align-items: center;
 justify-content: center; 
}
.arrow-image{
   width:100px;
   height : 70px;
      mix-blend-mode:multiply;
    text-align: center;
}
.arrow-right{
   width :90px;
   height : 90px;
   margin-top:20px;
   padding-right: 30px;
      mix-blend-mode:multiply;
}
.arrow-right1{
   width :90px;
   height : 90px;
      mix-blend-mode:multiply;
}
/* button*/
.button {
  position: relative;
  background-color: transparent;
  color: #e8e8e8;
  font-size: 17px;
  font-weight: 600;
  border-radius: 10px;
  width: 150px;
  height: 60px;
  border: none;
  text-transform: uppercase;
  cursor: pointer;
  overflow: hidden;
  box-shadow: 0 10px 20px rgba(51, 51, 51, 0.2);
  transition: all 0.3s cubic-bezier(0.23, 1, 0.320, 1);
}
.button::before {
  content: "SEE SALES!";
  display: flex;
  align-items: center;
  justify-content: center;
  width: 100%;
  height: 100%;
  pointer-events: none;
  background: linear-gradient(135deg,#7b4397,#dc2430 );
  transform: translate(0%,90%);
  z-index: 99;
  position: relative;
  transform-origin: bottom;
  transition: all 0.6s cubic-bezier(0.23, 1, 0.320, 1);
}
.button::after {
  content: "Hover me";
  display: flex;
  align-items: center;
  justify-content: center;
  background-color: #333;
  width: 100%;
  height: 100%;
  pointer-events: none;
  transform-origin: top;
  transform: translate(0%,-100%);
  transition: all 0.6s cubic-bezier(0.23, 1, 0.320, 1);
}
.button1::after{
  content: "Prospecting";
}
.button2::after{
  content: "Proposal";
}
.button3::after{
  content: "Negotiation";
}
.button4::after{
  content: "Closing";
}
.button5::after{
  content: "Retention";
}
.button6::after{
  content: "Disqualified";
}
.button:hover::before {
  transform: translate(0%,0%);
}
.button:hover::after {
  transform: translate(0%,-200%);
}

.button:focus {
  outline: none;
}

.button:active {
  scale: 0.95;
}

</style>
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
<img alt="" src="images/analytics.gif" class="image1"><img alt="" class="image2" src="images/company-logo.png">
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
   <!-- User Description -->
   <div class="px-4 pt-5 my-3 text-center border-none">
    <h1 class="display-4 fw-bold">Welcome ${uname} </h1>
    <br>
<div class="flowsales">
      <button class="button button1"></button>
      <img alt="" src="images/icons8-right.gif" class="arrow-right1">
      <button class="button button2"></button>
      <img alt="" src="images/icons8-right.gif" class="arrow-right1">
      <button class="button button3"></button>
      <img alt="" src="images/icons8-right.gif" class="arrow-right1">
      <button class="button button4"></button>
      <img alt="" src="images/icons8-right.gif" class="arrow-right1">
      <button class="button button5"></button>
      <img alt="" src="images/icons8-right.gif" class="arrow-right1">
      <button class="button button6"></button>
</div>
        <h1 class="display-4 pt-5 fw-bold">Overall Sales Report</h1>
    <div class="col-lg-6 mx-auto">
      <p class="lead mb-4">A sales manager job description usually includes building and leading a team of salespeople to help drive revenue. Sales managers must motivate their teams to generate leads, build client relationships, set targets to hit or exceed revenue forecasts, and ultimately meet customer needs.</p>
      <div class="d-grid gap-2 d-sm-flex justify-content-sm-center mb-3">
    <a href="Allsales.jsp"><button type="button" class="btn btn-primary btn-lg px-4 me-sm-3">All Sales</button></a>
      </div>
    </div>
    <div class="overflow-hidden" style="max-height: 65vh;">
      <div class="container px-5">
        <img src="images/image-sales2.jpg" class="img-fluid border rounded-15  mb-3" alt="sales-image" width="500" height="300" loading="lazy">
      </div>
    </div>
  </div>
 <div class="arrow-div">
      <img alt="" src="images/icons8-double-down.gif" class="arrow-image">
  </div> 
  <!-- Progress Sales  -->
    <div class="px-5 pt-1 my-3 text-center border-none">
    <h1 class="display-4 fw-bold">Progress Sales Report</h1>
    <div class="col-lg-6 mx-auto">
      <p class="lead mb-4">A sales manager job description usually includes building and leading a team of salespeople to help drive revenue. Sales managers must motivate their teams to generate leads, build client relationships, set targets to hit or exceed revenue forecasts, and ultimately meet customer needs.</p>
      <div class="d-grid gap-2 d-sm-flex justify-content-sm-center mb-3">
    <a href="Progresssales.jsp"><button type="button" class="btn btn-primary btn-lg px-4 me-sm-3">Progress Sales</button></a>
      </div>
    </div>
    <div class="overflow-hidden" style="max-height: 65vh;">
      <div class="container px-5">
        <img src="images/Progress-image.png" class="img-fluid border rounded-15  mb-3" alt="sales-image" width="500" height="300" loading="lazy">
      </div>
    </div>
  </div>
  <div class="arrow-div">
      <img alt="" src="images/icons8-double-down.gif" class="arrow-image">
  </div>
 <!-- Processed Sales  -->
    <div class="px-4 pt-1 my-3 text-center border-none">
    <h1 class="display-4 fw-bold text-color3">Processed Sales Report</h1>
    <div class="col-lg-6 mx-auto text-color3">
      <p class="lead mb-4">A sales manager job description usually includes building and leading a team of salespeople to help drive revenue. Sales managers must motivate their teams to generate leads, build client relationships, set targets to hit or exceed revenue forecasts, and ultimately meet customer needs.</p>
      <div class="d-grid gap-2 d-sm-flex justify-content-sm-center mb-3">
    <a href="Processedsales.jsp"><button type="button" class="btn btn-primary btn-lg px-4 me-sm-3">Processed Sales</button></a>
      </div>
    </div>
    <div class="overflow-hidden" style="max-height: 65vh;">
      <div class="container px-5">
        <img src="images/Processed-image.jpg" class="img-fluid border rounded-15  mb-3" alt="sales-image" width="500" height="300" loading="lazy">
      </div>
    </div>
  </div>
  <br>
   <!-- Section-1 for sales pipeline which is in Progress-->
<div class="container px-4 py-3" id="hanging-icons">
    <h2 class="pb-2 border-bottom">Sales Pipeline -In Progress</h2>
    <div class="row g-4 py-5 row-cols-1 row-cols-lg-3 text-color1">
      <div class="col d-flex align-items-start">
        <div class="icon-square bg-light text-dark flex-shrink-0 me-3 img-icon">
        <img alt="" src="images/icons8-answers-100.png" height="50px" width="50px">
                 <img alt="" src="images/icons8-right.gif" class="arrow-right">
        </div>
        <div>
          <h2>Prospecting</h2>
          <p>Paragraph of text beneath the heading to explain the heading. We'll add onto it with another sentence and probably just keep going until we run out of words.</p>
          <a href="Prospecting_progress.jsp" class="btn btn-primary">
            Prospecting Sales
          </a>
        </div>
      </div>
      <div class="col d-flex align-items-start">
        <div class="icon-square bg-light text-dark flex-shrink-0 me-3 img-icon">
        <img alt="" src="images/icons8-group-of-projects-100.png" height="50px" width="50px">
         <img alt="" src="images/icons8-right.gif" class="arrow-right">
        </div>
        <div>
          <h2>Proposal</h2>
          <p>Paragraph of text beneath the heading to explain the heading. We'll add onto it with another sentence and probably just keep going until we run out of words.</p>
          <a href="Proposal_progress.jsp" class="btn btn-primary">
            Proposal Sales
          </a>
        </div>
      </div>
      <div class="col d-flex align-items-start">
        <div class="icon-square bg-light text-dark flex-shrink-0 me-3 img-icon">
        <img alt="" src="images/icons8-approval-100.png" height="50px" width="50px">
              <img alt="" src="images/icons8-right.gif" class="arrow-right">
        </div>
        <div>
          <h2>Negotiation</h2>
          <p>Paragraph of text beneath the heading to explain the heading. We'll add onto it with another sentence and probably just keep going until we run out of words.</p>
          <a href="Negotiation_progress.jsp" class="btn btn-primary">
            Negotiation Sales</a>
        </div>
      </div>
    </div>
  </div>
   <!-- Sections 2 for sales pipeline which is in Processed-->
  <div class="container px-4 py-3" id="hanging-icons">
    <h2 class="pb-2 border-bottom">Sales Pipeline -In Processed</h2>
    <div class="row g-4 py-5 row-cols-1 row-cols-lg-3 text-color2">
      <div class="col d-flex align-items-start">
        <div class="icon-square bg-light text-dark flex-shrink-0 me-3 img-icon">
        <img alt="" src="images/icons8-bonds-100.png" height="50px" width="50px">
                 <img alt="" src="images/icons8-right.gif" class="arrow-right">
        </div>
        <div >
          <h2>Closing</h2>
          <p>Paragraph of text beneath the heading to explain the heading. We'll add onto it with another sentence and probably just keep going until we run out of words.</p>
          <a href="Closing_processed.jsp" class="btn btn-primary">
            Closing Sales
          </a>
        </div>
      </div>
      <div class="col d-flex align-items-start">
        <div class="icon-square bg-light text-dark flex-shrink-0 me-3 img-icon">
        <img alt="" src="images/icons8-journal-100.png" height="50px" width="50px">
         <img alt="" src="images/icons8-right.gif" class="arrow-right">
        </div>
        <div>
          <h2>Retention</h2>
          <p>Paragraph of text beneath the heading to explain the heading. We'll add onto it with another sentence and probably just keep going until we run out of words.</p>
          <a href="Retention_processed.jsp" class="btn btn-primary">
            Retention Sales
          </a>
        </div>
      </div>
      <div class="col d-flex align-items-start">
        <div class="icon-square bg-light text-dark flex-shrink-0 me-3 img-icon">
        <img alt="" src="images/icons8-sales-48.png" height="50px" width="50px">
        <img alt="" src="images/icons8-right.gif" class="arrow-right">
        </div>
        <div>
          <h2>Disqualified</h2>
          <p>Paragraph of text beneath the heading to explain the heading. We'll add onto it with another sentence and probably just keep going until we run out of words.</p>
          <a href="Disqualified_processed.jsp" class="btn btn-primary">
           Disqualified Sales
          </a>
        </div>
      </div>
    </div>
  </div>
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