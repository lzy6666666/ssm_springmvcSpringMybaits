<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/10
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <table>
            <c:forEach items="${lists}" var="bill" >
                <tr>
                    <td>${bill.billcode}</td>
                </tr>
            </c:forEach>
        </table>
</body>
</html>
