<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
this declration tag<br>
<%!int coef=90 ;%>
this is scriplet tag<br>
	<% 
       	int i=Integer.parseInt(request.getParameter("num1"));
	int j=Integer.parseInt(request.getParameter("num2")); 
	int k=i+j;
		out.println("Output : "+k);
		%>
		<br>
		my favraite number is :<%out.println(coef); %><br>
       my favraite number using Expression tag is :<%=(coef)%>
</body>
</html>