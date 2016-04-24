<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="springtag" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Portal</title>
<style type="text/css">
.error{
color: red;
font-style: bold;
}
</style>
</head>
<body>
	<table align="center">
	<spring:form method="post" commandName="employee" action="saveEmployee">
		<center>
			<table border="2">
				<tr>
					<td colspan="2" align="center"><springtag:message code="title"/></td>
				</tr>
				<tr>
					<td><springtag:message code="eno"/></td>
					<td><spring:input path="eno"/> <spring:errors path="eno" cssClass="error"/></td>
				</tr>
				<tr>
					<td><springtag:message code="ename"/></td>
					<td><spring:input path="ename"/> <spring:errors path="ename" cssClass="error"/></td>
				</tr>
				<tr>
					<td><springtag:message code="salary"/></td>
					<td><spring:input path="salary"/> <spring:errors path="salary" cssClass="error"/></td>
				</tr>	
				<tr>
					<td><springtag:message code="ssn"/></td>
					<td><spring:input path="ssn"/> <spring:errors path="ssn" cssClass="error"/></td>
				</tr>						
				<tr>
					<td colspan="2" align="center"><input type="submit" name="Register" value="Register"/></td>
				</tr>
			</table>
		</center>		
	</spring:form>
	</table>
</body>
</html>