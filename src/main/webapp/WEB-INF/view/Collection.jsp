
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<link href="<c:url value = "/resources/main.css"/>" rel="stylesheet"/>


<head>
    <title>Title</title>
</head>

<body>
<h1>Collection</h1>
<c:forEach items="${fossils}" var="fos">
    <div class = "fossilFrame">
        <p>${fos.name}</p>
    </div>
</c:forEach>
</body>
</html>
