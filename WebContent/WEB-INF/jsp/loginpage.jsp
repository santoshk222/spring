<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h1>Login Page</h1>
	<sf:form commandName="spitter" method="POST">
	<table>
		<thead>Enter Your credintials to login</thead>
		<tr><td>UserName: </td><td><sf:input path="userName"/></td></tr>
		<tr><td>PAssword: </td><td><sf:input path="password"/></td></tr>
		<tr><td> </td><td><input type="submit" value="Submit"></td></tr>
	</table>
	</sf:form>
</body>
</html>