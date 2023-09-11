<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login to cognifront</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel="stylesheet" href="CSS/loginpage.css">
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
</head>
<body>
<input type="hidden" id="status" value="<%=request.getAttribute("status")%>">
<!--Header  -->
<header class="header">
    <nav class="navbar">
        <a href="index.jsp">Home</a>
        <a href="#">About</a>
        <a href="#">Services</a>
        <a href="#">Contact</a>
    </nav>
    <form action="#" class="search-bar">
        <input type="text" placeholder="search...">
        <button class="search"><i class='bx bx-search-alt-2'></i></button>
    </form>
   </header>  
<!--Main Container  -->
     <div class="container d-flex justify-content-center align-items-center min-vh-70">
    <!--Login Container-->
       <div class="row border rounded-5 p-3 bg-lightblue  box-area">
    <!--Left Box-->
  <div class="col-md-6 rounded-4 d-flex justify-content-center align-items-center flex-column left-box" style="background-image: linear-gradient(-135deg,lightcoral,rgb(241, 49, 49));">
                  <p class="text-white fs-1" style="font-family: 'Courier New', Courier, monospace; font-weight: 600;">Cognifront</p>
           <div class="featured-image mb-3">
            <img src="images/undraw_data_reports_706v-removebg-preview.png" class="img-fluid" style="width: 350px;">
           </div>
           <p class="text-white fs-2" style="font-family: 'Courier New', Courier, monospace; font-weight: 600;">Sign in</p>
           <small class="text-white text-wrap text-center" style="width: 17rem;font-family: 'Courier New', Courier, monospace;">Manage Business Query With Ease</small>
       </div> 
 <!-- Right Box-->
       <div class="col-md-6 right-box">
          <div class="row align-items-center">
                <div class="header-text mb-4">
                     <h2>Hello,Again</h2>
                     <p>We are happy to have you back.</p>
                </div>
                <form action="Login" method="post">
                <div class="input-group mb-3">
                    <input type="text" class="form-control form-control-lg bg-light fs-6" placeholder="Username" name="username" id="username" required="required" >
                </div>
                <div class="input-group mb-3">
                    <input type="text" class="form-control form-control-lg bg-light fs-6" placeholder="Email address" name="email" id="email" required="required">
                </div>
                <div class="input-group mb-1">
                    <input type="password" class="form-control form-control-lg bg-light fs-6" placeholder="Password" name="password"  id="password" required="required">
                </div>
                <div class="input-group mb-5 d-flex justify-content-between">
                    <div class="form-check">
                        <input type="checkbox" class="form-check-input" id="formCheck">
                        <label for="formCheck" class="form-check-label text-secondary"><small>Remember Me</small></label>
                    </div>
                    <div class="forgot">
                        <small><a href="#">Forgot Password?</a></small>
                    </div>
                </div>
                <div class="input-group mb-3">
                <input class="btn btn-success w-100 fs-6 py-2" type="submit" value="Login">
                </div>
                 </form>
                <div class="input-group mb-3 ">
                    <button class="btn btn-lg btn-light w-100 fs-6" ><img src="images/google.png" style="width:20px" class="me-2"><small>Sign In with Google</small></button>
                </div>
                <div class="row">
                    <small>Don't have account? <a href="registration.jsp">Create one</a></small>
                </div>
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
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<link rel="stylesheet" href="alert/dist/sweetalert.css">
	<script type="text/javascript">
	var status=document.getElementById("status").value;
	if(status=="failed"){
		swal("Sorry","Wrong Username or Email or Password","error");
	}
	else if(status=="InvalidUname"){
		swal("Sorry","Please Enter Correct Username","error");
	}
	else if(status=="InvalidUemail"){
		swal("Sorry","Please Enter Correct Email","error");
	}
	else if(status=="InvalidUpassword"){
		swal("Sorry","Please Enter Correct Password","error");
	}
	</script>
</body>
</html>