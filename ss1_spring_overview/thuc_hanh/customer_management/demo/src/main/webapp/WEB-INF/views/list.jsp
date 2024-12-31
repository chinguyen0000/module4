<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 12/27/2024
  Time: 12:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<p>There are ${customers.size()} cutomer(s) in list</p>
<h2>Customer List</h2>
<table>
    <thead>
    <tr>
        <th>No</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${customers}" varStatus="loop" var="c">
        <tr>
            <td>
                <c:out value="${c.id}"/>
            </td>
            <td>
                <a href="customers?id=${loop.count}">${c.name}</a>
            </td>
            <td>
                <c:out value="${c.email}"/>
            </td>
            <td>
                <c:out value="${c.address}"/>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
