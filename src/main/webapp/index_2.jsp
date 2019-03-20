<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: przemo
  Date: 20.03.19
  Time: 22:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Task 2</title>
</head>
<body>

    <p>Task 2</p>

    <c:set var = "numbers" scope = "page" value = "${[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]}"/>
    <%--da się to jakoś prze-iterować bez tworzenia tabeli?--%>
    <c:forEach items = "${numbers}" var="number" begin = "1" end = "9" step="2">
        <p>${number}</p>
    </c:forEach>


</body>
</html>
