<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Home </title>
</head>
<body>
    <table border="1">
        <thead>
            <tr>
                <td> First name </td>
                <td> Second name </td>
                <td> Last name </td>
                <td> Birth date </td>
                <td> Sex </td>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>
                    <c:if test="${userInfo.firstName!=null}"> ${userInfo.firstName} </c:if>
                </td>
                <td>
                    <c:if test="${userInfo.secondName!=null}"> ${userInfo.secondName} </c:if>
                </td>
                <td>
                    <c:if test="${userInfo.lastName!=null}"> ${userInfo.lastName} </c:if>
                </td>
                <td>
                    <c:if test="${userInfo.birthDate!=null}"> ${userInfo.birthDate} </c:if>
                </td>
                <td>
                    <c:if test="${userInfo.sex.type!=null}">${userInfo.sex.type} </c:if>
                </td>
            </tr>
        </tbody>
    </table>
</body>
</html>
