<%@ page import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
<%@ include file="header.jsp" %>
<ul>
    <j:forEach var="user" items="${users}">
        <li>${user.name}</li>
    </j:forEach>
</ul>
</body>
</html>
