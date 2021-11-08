<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<link href="<c:url value = "/resources/main.css"/>" rel="stylesheet"/>


<head>
    <title>Title</title>
</head>


<body>
<jsp:include page="header.jsp"/>

<main>

    <table id="collectionHeader">
        <tr id="tableHeaders">
            <th><a href="<c:url value="/?sortBy=type"/>"> TYPE</a></th>
            <th><a href="<c:url value="/?sortBy=period"/>">PERIOD</a></th>
            <th><a href="<c:url value="/?sortBy=name"/>">NAME</a></th>
            <th><a href="<c:url value="/?sortBy=location"/>">LOCATION</a></th>
            <th><a href="<c:url value="/?sortBy=state"/>">SIZE</a></th>
        </tr>
    </table>

    <table id="collection">
        <c:forEach items="${fossilsList}" var="fossilsNodes">
            <tr id="id_${fossilsNodes.id}">
                <td>${fossilsNodes.type}</td>
                <td>${fossilsNodes.period}</td>
                <td>${fossilsNodes.name}</td>
                <td>${fossilsNodes.location}</td>
                <td>${fossilsNodes.state}</td>
                <td><a href="<c:url value="/update?id=${fossilsNodes.id}"/>">update</a></td>

            </tr>
        </c:forEach>

    </table>
<main>

<jsp:include page="footer.jsp"/>

</body>
</html>
