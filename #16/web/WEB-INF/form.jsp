<%--
  Created by IntelliJ IDEA.
  User: Aidar_2
  Date: 05.10.2015
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <form action="/calc" method="post">
        First operand: <input type="text" name="firstNum">
        Second operand: <input type="text" name="secondNum">
        <br>
        <input type="radio" name="operation" value="sum"> Sum
        <input type="radio" name="operation" value="subt"> Subt
        <input type="radio" name="operation" value="mult"> Mult
        <input type="radio" name="operation" value="div"> Div
        <input type="submit" value="Submit">
    </form>
</body>
</html>
