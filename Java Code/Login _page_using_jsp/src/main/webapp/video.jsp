<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

response.setHeader("Cache-Control","no-cache , no-store , must-revalidate");
//perfectly work on Http 1.1
response.setHeader("Progma","no-cache"); //Http 1.0
// If we are using the proxy server
response.setHeader("Expires","0");if(session.getAttribute("username")==null){
	response.sendRedirect("login.jsp");
}
%>
<img alt="" src="https://t4.ftcdn.net/jpg/02/55/89/59/360_F_255895994_daLC1HyNe3LsJyoVyDo8vBLvC8V4F5yi.jpg" width="400px" height="400px">
Welcome This is Video Page
</body>
</html>