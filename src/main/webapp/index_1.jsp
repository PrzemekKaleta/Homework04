<%--
  Created by IntelliJ IDEA.
  User: przemo
  Date: 20.03.19
  Time: 22:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Task 1</title>
</head>
<body>

<p>Task 1</p>

<c:if test="${not empty param.author}">
    <p>Wybrany autor: ${param.author}</p>
</c:if>

</body>
</html>
