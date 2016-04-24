<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring App</title>
</head>
<body>
	<c:if test="${not empty date}">
		<h1>Date : ${date}</h1><br>
	</c:if>
	
	<c:if test="${user == 'rama'}">
		<h1>User : ${user}</h1><br>
	</c:if>
	
</body>
</html>