<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel="stylesheet" href="CSS/loginpage.css">
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
<style type="text/css">
.image1{
	border-radius: 15px;
}
</style>
</head>
<body>
<input type="hidden" id="status" value="<%=request.getAttribute("status")%>">
<header class="header">
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
<!--Main Container  -->
     <div class="container d-flex justify-content-center align-items-center min-vh-70">
    <!--Login Container-->
       <div class="row border rounded-5 p-3 bg-lightblue  box-area">
    <!--Left Box-->
<div class="col-md-6 right-box">
          <div class="row align-items-center">
                <div class="header-text mb-1">
                     <h2>SIGN UP</h2>
                     <p>be the part of the Organization</p>
                </div>
        <form action="Registration" method="post">
                <div class="input-group mb-2">
                    <input type="text" name="username" class="form-control form-control-lg bg-light fs-6" placeholder="Username" required="required">
                </div>
                <div class="input-group mb-2">
                    <input type="text" name="email" class="form-control form-control-lg bg-light fs-6" placeholder="Email address" required="required">
                </div>
                <div class="input-group mb-2">
                    <input type="password" name="password" class="form-control form-control-lg bg-light fs-6" placeholder="Password" required="required">
                </div>
                 <div class="input-group mb-2">
                    <input type="password" name="chkpassword" class="form-control form-control-lg bg-light fs-6" placeholder="Repeat your Password" required="required">
                </div>
                <div class="input-group mb-1">
                    <input type="text" name="contact_no" class="form-control form-control-lg bg-light fs-6" placeholder="Contact number" required="required">
                </div>
                <div class="input-group mb-3 d-flex justify-content-between">
                    <div class="form-check">
                        <input type="checkbox" class="form-check-input" id="formCheck">
                        <label for="formCheck" class="form-check-label text-secondary"><small>I agree all statements in <a href="">Terms of service</a></small></label>
                    </div>
                </div>
                <div class="input-group mb-3">
                        <input class="btn btn-primary w-100 fs-6 py-2" type="submit" value="Register">
                </div>
              </form>
                <div class="input-group mb-3">
                    <button class="btn btn-lg btn-light w-100 fs-6"><img src="images/google.png" style="width:20px" class="me-2"><small>Sign In with Google</small></button>
                </div>
                <div class="row">
                    <small>I am already
							member<a href="login.jsp"> Login</a></small>
                </div>
          </div>
       </div> 
  <!-- Right Box-->
      <div class="col-md-6 rounded-4 d-flex justify-content-center align-items-center flex-column left-box" style="background-image: linear-gradient(-135deg,lightcoral,rgb(241, 49, 49));">
                  <p class="text-white fs-1" style="font-family: 'Courier New', Courier, monospace; font-weight: 600;">Cognifront</p>
           <div class="featured-image mb-3">
            <img src="images/undraw_Access_account_re_8spm.png" class="img-fluid image1" style="width: 350px;">
           </div>
           <p class="text-white fs-2" style="font-family: 'Courier New', Courier, monospace; font-weight: 600;">Sign up</p>
           <small class="text-white text-wrap text-center" style="width: 17rem;font-family: 'Courier New', Courier, monospace;">Manage Business Query With Ease</small>
       </div> 
    </div>
          </div>
         <footer class="footer">
           <div class="social-media">
            <a href=""><i class='bx bxl-gmail'></i></a>
            <a href="https://www.linkedin.com/in/uday-sharma-602b33267"><i class='bx bxl-linkedin' ></i></a>
            <a href=""><i class='bx bxl-instagram' ></i></a>
            <a href=""><i class='bx bxl-github' ></i></a>
        </div></footer>
        
 <!-- JavaScript  -->
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
	else if(status == "success"){
		swal("Congrats","Account Created Successfully","success");
	}
	else if(status == "invalidUname"){
		swal("Sorry","Please Enter Username","error");
	}
	else if(status=="invalidUemail"){
		swal("Sorry","Please Enter email","error");
	}
	else if(status=="invalidUpassword"){
		swal("Sorry","Please Enter Password","error");
	}
	else if(status=="checkUpassword"){
		swal("Sorry","Please check the re entered Password","error");
	}
	else if(status=="invalidUcontact_no"){
		swal("Sorry","Please Enter Contact Number","error");
	}
	else if(status=="invalidContactlength"){
		swal("Sorry","Contact Number length is no defined","error");
	}
	</script>
</body>
</html>