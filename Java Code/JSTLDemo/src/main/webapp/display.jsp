<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SQL Connection in the JSTL</title>
<style type="text/css">
body{
background-color: aqua;}
.table{

}
</style>
</head>
<body>
<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/jdbc" user="root" password="uday123"/>
<sql:query var="rs" dataSource="${db}">select * from stu;</sql:query>
<table border="2" width="50%" class="table">
<tr>
<th>ID</th>
<th>Name</th>
<th>City</th>
</tr>
<c:forEach items="${rs.rows}" var="stu">
<tr>
<td><c:out value="${stu.id}"></c:out></td>
<td><c:out value="${stu.Name}"></c:out></td>
<td><c:out value="${stu.city}"></c:out></td>
</tr>
</c:forEach>
</table>
</body>
</html>