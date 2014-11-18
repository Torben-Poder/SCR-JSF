<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Log in</h1>
	<form action="/JSFWeb/login" method="POST">
		<label for="username">Username</label>
		<input type="text" name="username" value="${userbean.username}"></input>
		<br />
		<label for="password">Password</label>
		<input type="password" name="password"></input>
		<br />
		<input type="submit" name="submitbutton" value="Login" />
		<br />
		<%= request.getAttribute("message") %>
	</form>
</body>
</html>