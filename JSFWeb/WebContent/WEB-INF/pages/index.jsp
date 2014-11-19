<%@page import="dk.roskilde.it.beans.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>Hallow 
 <%= ((UserBean)request.getSession().getAttribute("userbean")).getUsername() %>
 <table>
   <c:forEach items="${items.items}" var="item" varStatus="status">
     <tr>
       <td>${item.name }</td>
       <td>${item.price }</td>
       <c:if test="${item.haveit }">
         <td>Har p� lager</td>
       </c:if>
       <c:if test="${!item.haveit }">
         <td>Har ikke p� lager</td>
       </c:if>
     </tr>
    </c:forEach>
 </table>
 </h1>
</body>
</html>