<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 12/24/2024
  Time: 6:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Sandwich Condiments</title>
</head>
<body>
    <h2>Sandwich Condiments</h2>
    <form action="save">
        <input type="checkbox" name="condiment" value="Letture"> Letture
        <input type="checkbox" name="condiment" value="Tomato"> Tomato
        <input type="checkbox" name="condiment" value="Mustard"> Mustard
        <input type="checkbox" name="condiment" value="Sprouts"> Sprouts
        <hr>
        <button type="submit">Save</button>
    </form>
    <hr>
    <h4>Selected condiments:</h4>
    <c:forEach var="cond" varStatus="loop" items="${condiment}">
        <p>${cond}</p>
    </c:forEach>
</body>
</html>
