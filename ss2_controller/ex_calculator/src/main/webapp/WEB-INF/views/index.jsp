<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 12/24/2024
  Time: 6:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CALCULATOR</title>
</head>
<body>
    <h1>Calculator</h1>
    <form action="calculate" method="post">
        <input type="number" name="num1" required>
        <input type="number" name="num2" required>
        <br>
        <hr>
        <button name="calculate" type="submit" value="+">Addition(+)</button>
        <button name="calculate" type="submit" value="-">Subtraction(-)</button>
        <button name="calculate" type="submit" value="*">Multiplication(*)</button>
        <button name="calculate" type="submit" value="/">Division(/)</button>
    </form>
    <h4>Result:</h4> ${result}
</body>
</html>
