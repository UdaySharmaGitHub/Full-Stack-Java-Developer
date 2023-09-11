<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.Statement,java.util.Random"%>
<%@ page import="java.util.ArrayList"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>this is the home page of jsp</title>
</head>
<body>
<p>this is home page</p>
 <form action="add.jsp" method='Get'>
  Enter the 1st number <input type="Text" name="num1"><br>
  Enter the 2nd number <input type="Text" name="num2"><br>
 <input type="submit">
</body>
</html>