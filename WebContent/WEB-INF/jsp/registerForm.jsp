<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spitter Registration Form</title>

<link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/style.css"></c:url>'>
</head>
<body>
	<h1>Welcome</h1><br>
	Please Enter information to register as a "Spitter"
	<sf:form action="" method="post" commandName="spitter">
	<table>
	<tr><td>First Name: </td>	<td><sf:input path="firstName"/>	<sf:errors path="firstName" cssClass="error"></sf:errors>	</td></tr>
	<tr><td>Last Name:  </td>	<td><sf:input path="lastName"/>		<sf:errors path="lastName" cssClass="error"></sf:errors>		</td></tr>
	<tr><td>UserName:   </td>	<td><sf:input path="userName"/>		<sf:errors path="userName" cssClass="error"></sf:errors>		</td></tr>
	<tr><td>Password:   </td>	<td><sf:password path="Password"/>	<sf:errors path="Password" cssClass="error"></sf:errors>		</td></tr>
	<tr><td></td><td><input type="submit" value="Submit"></td></tr>
	</table>
	</sf:form>
</body>
</html>