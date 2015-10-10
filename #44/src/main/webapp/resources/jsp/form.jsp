<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Login </title>
</head>
<body>
    <form action="/table" method="post">
        <label for="fName"> First name: </label>
        <input type="text" id="fName" name="fName" required>
        <label for="sName"> Second name: </label>
        <input type="text" id="sName" name="sName" required>
        <label for="lName"> Last name: </label>
        <input type="text" id="lName" name="lName" required>
        <label for="bDate"> Birth date: </label>
        <input type="date" id="bDate" name="bDate">
        <label for="male"> male </label>
        <input type="radio" id="male" name="sex" value="male">
        <label for="female"> female </label>
        <input type="radio" id="female" name="sex" value="female">
        <input type="submit" value="Submit">
    </form>
</body>
</html>
