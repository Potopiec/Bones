<%--
  Created by IntelliJ IDEA.
  User: rkita
  Date: 05/11/2021
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title></title>
</head>
<body>

<p>"${fossil.name}"</p>
<p>"${fossil.period}"</p>
<p>"${fossil.type}"</p>
<p>"${fossil.id}"</p>
<p>"${fossil.location}"</p>
<p>"${fossil.state}"</p>


<a href="<c:url value="/remove?id=${fossil.id}"/>">usun</a>
<a href="<c:url value="/editForm?id=${fossil.id}"/>">edit</a>

</body>
</html>
