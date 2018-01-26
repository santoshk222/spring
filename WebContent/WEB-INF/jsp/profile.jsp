<%@page import="spittr.Spitter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%if(session.getAttribute("spitterLogged")!="loggedin")
	response.sendRedirect("/spittr/spitter/showlogin");
%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile page</title>
</head>
<body>
<h1>welcome</h1>
<a href='<c:url value="/spitter/logout"></c:url>' >Logout</a> <br>
Logged user: ${username}<br>
First Name: ${spitter.getFirstName()}<br>
Last name: ${spitter.getLastName()}
<%-- <%
	Spitter sp=(Spitter)session.getAttribute("spitter");
	out.print(sp.getFirstName()+" "+sp.getLastName());
%> --%>
</body>
</html>