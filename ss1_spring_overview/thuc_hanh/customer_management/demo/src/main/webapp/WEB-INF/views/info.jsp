<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 12/27/2024
  Time: 12:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Info</title>
</head>
<body>
    <fieldset>
        <legend>Customer Information:</legend>
        ID: <input type="number" value="${customer.id}"><br>
        Name: <input type="text" value="${customer.name}"><br>
        Email: <input type="text" value="${customer.email}"><br>
        Address: <input type="text" value="${customer.address}"><br>
    </fieldset>
    <a href="/">Back to customer list</a>
</body>
</html>
