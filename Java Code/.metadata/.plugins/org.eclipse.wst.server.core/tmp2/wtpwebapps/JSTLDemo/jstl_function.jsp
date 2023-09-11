<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL FUNCTION</title>
</head>
<body>
	<c:set var="str" value="My name is Uday Sharma" />
	Length : ${fn:length(str)}
	<br> Index : ${fn:indexOf(str,"is")}
	<br> is There : ${fn:contains(str,"Uday")}
	<br> is There : ${fn:contains(str,"JSP")}
	<br>
	<c:if test="${fn:contains(str,'Sharma')}">Yes is there</c:if>
	<br>
	<c:forEach items="${fn:split(str,' ')}" var="split">
${split}<br>
	</c:forEach>

</body>
</html>