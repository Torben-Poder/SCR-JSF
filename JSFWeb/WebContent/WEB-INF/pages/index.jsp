<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="m" uri="/WEB-INF/tlds/test.tld" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
  <c:if test="${userbean.username ne null}">
    <h1>Hallow 
    ${userbean.username}
 </h1>
 </c:if>
<c:choose>
  <c:when test="${fn:length(items.items) eq 0 }">
    <span>ingen produktor</span>
  </c:when>
  <c:otherwise>
   <c:forEach items="${items.items}" var="item" varStatus="status">
   <c:if test="${status.first }">
     <table>
   </c:if>
     <tr>
       <td>${item.name }</td>
       <td>${item.price }</td>
       <c:if test="${item.haveit }">
         <td>Har på lager</td>
       </c:if>
       <c:if test="${!item.haveit }">
         <td>Har ikke på lager</td>
       </c:if>
     </tr>
     <c:if test="${status.last }">
       </table>
     </c:if>
    </c:forEach>
  </c:otherwise>
</c:choose>

</body>
</html>