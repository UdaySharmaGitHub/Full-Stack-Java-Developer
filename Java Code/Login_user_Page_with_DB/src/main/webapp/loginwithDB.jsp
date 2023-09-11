<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
 *{
   margin: 0;
   padding: 0;
   box-sizing: border-box;
 }
 body{
 height:100vh;
    display: flex;
    justify-content: center;
    align-items: center;
    background-image: linear-gradient(90deg,lightcoral,transparent);
 }
 .container{
    height: 300px;
    width: 300px;
    display:flex;
    flex-direction :column;
    justify-content:center;
    align-items:center;
    background-color: lightblue;
    gap:20px;
    box-shadow: 0px 10px 20px rgb(0,0,0,0.7);
border-radius: 15px
 }
 .container > input,label{
    margin-bottom: 10px;
    border: 0px none;
   }
</style>
</head>
<body>
<div class="container">
   <form action="Login" method="post">
   <label>Name</label><br><input type="text" name="uname"> <br>
   <label>password</label><br><input type="password" placeholder="password" name="pass"><br>
   <input type="submit" value="Login">
   </form>
   </div>
</body>
</html>