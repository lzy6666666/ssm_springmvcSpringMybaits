<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>


<html>
<head>
    <title>开发团队列表</title>
</head>
<body>

<h1>开发团队列表</h1>

<table border="1">

<c:forEach var="t" items="${teamList}">
    <tr>

        <td>${t.tid}</td>
        <td>${t.tname}</td>
        <td><img src="../${t.timg}"  width="64" height="64">${t.timg}</td>
        <td>${t.tmoney}</td>
        <td>${t.tlogo}</td>
        <td>${t.tpm}</td>
        <td>${t.tslogan}</td>
        <td>${t.tstatus}</td>
        <td>${t.ttime}</td>


    </tr>




</c:forEach>

</table>



</body>
</html>
