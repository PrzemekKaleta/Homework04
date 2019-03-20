<%--
  Created by IntelliJ IDEA.
  User: przemo
  Date: 20.03.19
  Time: 23:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Task 3</title>
</head>
<body>
    <p>Task 3</p>

    <c:set var="someName" value="Witaj w coderslab."/>

    <c:if test="${someName.contains('coderslab')}">
        <p>OK</p>
    </c:if>

</body>
</html>
